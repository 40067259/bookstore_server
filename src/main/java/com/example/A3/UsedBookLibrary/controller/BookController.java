package com.example.A3.UsedBookLibrary.controller;

import com.example.A3.UsedBookLibrary.domain.AD;
import com.example.A3.UsedBookLibrary.domain.Book;
import com.example.A3.UsedBookLibrary.service.UsedBookService;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping("book/")
@CrossOrigin
public class BookController {

    List<Book> bookList = new CopyOnWriteArrayList<>();
    @Autowired
    UsedBookService usedBookService;
    @Value("${azure.auth_url}")
    private String auth_url;

    private boolean validateToken(String token) {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost(String.format(auth_url));
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

    @GetMapping(path = "get/{ISBN}", produces = "application/json")
    public List<Book> searchByISBN(@RequestHeader("tokens") String token,  @PathVariable("ISBN") String ISBN){
        if(validateToken(token))
        {
            bookList.clear();
            Book book = usedBookService.searchBook(ISBN);
            if (book == null) return null;
            bookList.add(book);
            System.out.println("User authenticated.");
            return bookList;
        }
        else
            System.out.println("User not authenticated!");
            return null;

    }

    public static void main(String[] args) {
        Object o = new Object();

    }


}