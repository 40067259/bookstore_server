package com.example.A3.UsedBookLibrary.controller;

import com.example.A3.UsedBookLibrary.domain.AD;
import com.example.A3.UsedBookLibrary.domain.Book;
import com.example.A3.UsedBookLibrary.domain.GoogleResult;
import com.example.A3.UsedBookLibrary.exception.DuplicatedIdException;
import com.example.A3.UsedBookLibrary.exception.RepException;
import com.example.A3.UsedBookLibrary.googleRes.GoogleResponse;
import com.example.A3.UsedBookLibrary.repo.BookRepo;
import com.example.A3.UsedBookLibrary.service.UsedBookService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.rowset.serial.SerialBlob;
import javax.ws.rs.HeaderParam;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping("ad/")
public class ADController {
    List<AD> ADList = new CopyOnWriteArrayList<>();
    List<GoogleResult> resultList = new CopyOnWriteArrayList<>();
    @Autowired
    UsedBookService usedBookService;


    private boolean validateToken(String token) {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost(String.format("http://localhost:8877/user/auth"));
            httpPost.addHeader("token", token);
            CloseableHttpResponse httpResponse = client.execute(httpPost);
            HttpEntity entity = httpResponse.getEntity();
            String isAuthenticated = EntityUtils.toString(entity);
            httpResponse.close();
            if(isAuthenticated.equals("true")){
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @GetMapping(path = "get/{ID}", produces = "application/json")
    public List<AD> searchByID(@RequestHeader(value = "token") String token, @PathVariable("ID") String ID){
        System.out.println("ID From getByID-----> "+ID);
        System.out.println("token From getByID------> "+token);
        if(validateToken(token))
        {
            System.out.println("User authenticated.");
            ADList.clear();
            AD ad = usedBookService.searchAD(ID);
            if (ad == null) return null;
            ADList.add(ad);
            return ADList;
        }
        else
        {
            System.out.println("User not authenticated.");
            return null;
        }
    }

    @GetMapping(path = "getAllAD",produces = "application/json")
    public List<AD> getAllAD(@RequestHeader(value = "token") String token){
        System.out.println("GetAll token: "+token);
        if(validateToken(token))
        {
            ADList.clear();
            ADList = usedBookService.getAllAD();
            Collections.sort(ADList);
            System.out.println("User authenticated.");
            return ADList;
        }
        else
        {
            System.out.println("User not authenticated.");
            return null;
        }

    }

    @PostMapping(path = "postAD",produces = "application/json")
    //
    public String postAD(
                         @RequestHeader(value = "token") String token,
                         @RequestParam(value = "ISBN") String ISBN ,
                         @RequestParam(value = "bookTitle", required = false) String bookTitle,
                         @RequestParam(value = "year", required = false) String year,
                         @RequestParam(value = "bkDescription",required = false) String bkDes,
                         @RequestParam(value = "cover", required = false) MultipartFile cover,
                         @RequestParam(value = "author", required = false) String author,
                         @RequestParam(value = "title") String title,
                         @RequestParam(value = "description",required = false) String des,
                         @RequestParam(value = "price") double price,
                         @RequestParam(value = "quantity") int quantity) throws RepException, IOException, SQLException, DuplicatedIdException {
        System.out.println("token----> "+token);
        if(validateToken(token))
        {
            if(ISBN == null || ISBN.length() == 0 || title == null || title.length() == 0)
                throw new RepException("Miss some parameters, please try again");
            if(price < 0 || quantity <= 0 )
                throw new RepException("price or quantity can not less than 0");
            Blob blob = null;
            if(cover != null ){
                System.out.println(cover.getContentType()+" "+cover.getBytes().length);
                blob = new SerialBlob(cover.getBytes());
            }else{
                System.out.println("cover is empty");
            }
            Book book = usedBookService.searchBook(ISBN);
            if (book == null )
            {
                book = new Book(ISBN,bookTitle,author,bkDes,year,cover.getBytes());
                usedBookService.importBook(ISBN,bookTitle,author,bkDes,year,blob);
            }
            AD ad = new AD(book,title,des,price,quantity, cover.getBytes());
            usedBookService.postAD(ad.getID(),ad.getTitle(),ad.getDescription(),ad.getPrice(),ad.getBook().getISBN(),ad.getComment(), ad.getQuantity(), blob);
            //usedBookService.sell(ISBN, quantity); will be adding to admin api when admin approve it then add the quantity to book repo
            System.out.println("User authenticated.");
            return "AD has been created.";
        }
        else
        {
            return "User not authenticated.";
        }
    }

    /*
        update an AD either create a new book or select an existing one
     */
    @PutMapping(value = "updateAD")
    public String updateAD(@RequestHeader(value = "token") String token, @RequestParam(value = "ID") String ID ,@RequestParam(value = "ISBN", required = false) String ISBN , @RequestParam(value = "bookTitle", required = false) String bookTitle,
                         @RequestParam(value = "year", required = false) String year, @RequestParam(value = "bkDescription",required = false) String bkDes,
                         @RequestParam(value = "cover", required = false) MultipartFile cover, @RequestParam(value = "author", required = false) String author,
                         @RequestParam(value = "title", required = false) String title,
                         @RequestParam(value = "description",required = false) String des, @RequestParam(value = "price",required = false) double price,
                         @RequestParam(value = "quantity", required = false) int quantity) throws RepException, IOException, SQLException, DuplicatedIdException
    {
        if(validateToken(token))
        {
            if (ID.equalsIgnoreCase("null")) return "missing ID";
            if(ISBN.equalsIgnoreCase("null")&&(!bookTitle.equals("null")||!year.equals("null")||!bkDes.equals("null")||!author.equals("null")|| !(cover ==null)))
                return "require ISBN if you want to change book info.";
            AD ad = usedBookService.searchAD(ID);
            if (ad == null ) return "the AD does not exist.";
            Blob blob = null;
            if(cover != null) blob = new SerialBlob(cover.getBytes());

            Book book =null;
            if(!ISBN.equals("null"))
            {
                book = usedBookService.searchBook(ISBN);
                if (book == null ) // if it is a new book
                {
                    book = new Book(ISBN,bookTitle,author,bkDes,year,cover.getBytes());
                    usedBookService.importBook(ISBN,bookTitle,author,bkDes,year,blob);
                }
            }

            String titleMod = !title.equals("null") ? title:ad.getTitle();
            String desMod = !des.equals("null")? des:ad.getDescription();
            double priceMod = price !=0? price:ad.getPrice();
            int quantityMod = quantity !=0? quantity:ad.getQuantity();
            ad.setBook(book);

            ad.setTitle(titleMod);
            ad.setDescription(desMod);
            ad.setPrice(priceMod);
            ad.setQuantity(quantityMod);
            //ad.setCover(book.getCover());
            usedBookService.updateAD(ID,ad.getTitle(),ad.getDescription(),ad.getPrice(),ad.getBook().getISBN(),ad.getComment(),ad.getQuantity(), blob);
            System.out.println("User authenticated.");
            return "AD has been update, waiting for admin to approve it";
        }
        else
        {
            return "User not authenticated.";
        }
    }

    @DeleteMapping(path = "deleteAD/{ID}", produces = "application/json")
    public String deleteAD(@RequestHeader(value = "token") String token, @PathVariable("ID") String ID) throws RepException
    {
        if(validateToken(token))
        {
            if (ID.equals("null")||ID.length()==0) throw new RepException("require ID value");
            AD ad = usedBookService.getAD(ID);
            if (ad == null) return "there is no that ad.";
            AD.getADSet().remove(ID);
            usedBookService.deleteAD(ID);
            System.out.println("User authenticated.");
            return "the ad with ID "+ ID+" has been deleted.";
        }
        else
        {
            return "User not authenticated.";
        }
    }

    @GetMapping(path = "searchGoogleBook/{query}", produces = "application/json")
    public List<GoogleResult> searchGoogleBook(@RequestHeader(value = "token") String token, @PathVariable(value = "query") String query) throws MalformedURLException {
        if(validateToken(token))
        {
            String apiKey = "&key=AIzaSyDxOjAAT1hTyUNRo05HCyWDMvgfah9QTdI";
            URL base_url = new URL("https://www.googleapis.com/books/v1/volumes?q=");
            resultList.clear();
            ObjectMapper mapper = new ObjectMapper();
            HttpGet httpGet = null;
            try (CloseableHttpClient client = HttpClients.createDefault()) {
                String con;
                if(query.contains(" "))
                {
                    con = query.split(" ")[0];
                    query = query.replaceAll(" ", "+");
                    httpGet = new HttpGet(base_url.toString() + query + "&oq=" + con +"?projection=lite" + apiKey);
                }else
                    httpGet = new HttpGet(base_url.toString() + query +"?projection=lite"+ apiKey);

                CloseableHttpResponse httpResponse = client.execute(httpGet);

                GoogleResponse response = mapper.readValue(httpResponse.getEntity().getContent(),GoogleResponse.class);

                int temp = response.getItems().size() > 10 ? 10:response.getItems().size();

                for (int i = 0; i<temp; i++)

                {
                    String titleMod = response.getItems().get(i).getVolumeInfo().getTitle();
                    String desMod = response.getItems().get(i).getVolumeInfo().getDescription();
                    String ISBNMod = response.getItems().get(i).getVolumeInfo().getIndustryIdentifiers() !=null?response.getItems().get(i).getVolumeInfo().getIndustryIdentifiers().get(0).getIdentifier():"not available";
                    String coverLink = response.getItems().get(i).getVolumeInfo().getImageLinks() != null ?response.getItems().get(i).getVolumeInfo().getImageLinks().getThumbnail():"not available";
                    GoogleResult result = new GoogleResult(i, coverLink, titleMod, desMod,ISBNMod );
                    resultList.add(result);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("User authenticated.");
            return resultList;
        }
        else
        {
            System.out.println("User not authenticated.");
            return null;
        }
    }


}
