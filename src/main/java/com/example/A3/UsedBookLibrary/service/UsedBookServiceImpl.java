package com.example.A3.UsedBookLibrary.service;

import com.example.A3.UsedBookLibrary.domain.AD;
import com.example.A3.UsedBookLibrary.domain.Book;
import com.example.A3.UsedBookLibrary.exception.notEnoughQuantityException;
import com.example.A3.UsedBookLibrary.mapper.UsedBookMapper;
import com.example.A3.UsedBookLibrary.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Blob;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class UsedBookServiceImpl implements UsedBookService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    UsedBookMapper mapper;
    @Override
    public Book searchBook(String ISBN) {
        return mapper.getBookByISBN(ISBN);
    }

    @Override
    public AD searchAD(String ID) {
        return mapper.getADByID(ID);
    }

    @Override
    public String searchBookAtAmazon(String ISBN) {
        return null;
    }

    @Override
    public String getPostTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String date = formatter.format(now);
        return date;
    }

    @Override
    public String getComment(String ID) {
        return mapper.getCommentByID(ID);
    }

    @Override
    public int importBook(String ISBN, String title, String author, String description, String year, Blob cover) {
        BookRepo.getBookRepo().put(ISBN,0);
        mapper.insertToBookRepo(ISBN,0);
        return mapper.createBook(ISBN, title, author, description, year, cover);
    }

    @Override
    public int updateBook(String ISBN, String title, String author, String description, String year, Blob cover) {
        return mapper.updateBook(ISBN, title, author, description, year, cover);
    }

    @Override
    public int deleteBook(String ISBN) {
        return mapper.deleteBookByISBN(ISBN);
    }

    @Override
    public boolean getADState(String ID) {
        return mapper.getADState(ID);
    }

    @Override
    public void banAD(String ID) {
        mapper.updateADState(ID,false);
    }

    @Override
    public void banComment() {
    }

    @Override
    public boolean verifyAD() {
        return false;
    }

    @Override
    public int updateBookCover(String ISBN, Blob cover) {
        return mapper.updateBookCover(ISBN, cover);
    }

    @Override
    public int deleteBookCover(String ISBN) {
        return mapper.deleteBookCover(ISBN);
    }

    @Override
    public byte [] getBookCover(String ISBN) {
        return mapper.getBookCover(ISBN);
    }

    @Override
    public int postAD(String ID, String title, String description, double price,
                      String ISBN, String comment, int quantity, Blob cover) {
        return mapper.createAD(ID, title, description, price, ISBN, comment, quantity, cover);
    }

    @Override
    public int updateAD(String ID, String title, String description, double price,
                        String ISBN, String comment, int quantity, Blob cover) {
        return mapper.updateAD(ID, title, description, price, ISBN, comment,quantity, cover);
    }

    @Override
    public int deleteAD(String ID) {
        return mapper.deleteAD(ID);
    }

    @Override
    public AD getAD(String ID) {
        return mapper.getADByID(ID);
    }

    @Override
    public List<AD> getAllAD() {
        return mapper.getALLAD();
    }

    @Override
    public int getBookQuantity(String ISBN)
    {
        return mapper.getBookQuantityByISBN(ISBN);
    }

    @Override
    public int buy(String ISBN, int quantity) throws notEnoughQuantityException {
        int temp = mapper.getBookQuantityByISBN(ISBN);
        temp = temp - quantity;
        if (temp < 0)
            throw new notEnoughQuantityException();
        else
        {
            BookRepo.getBookRepo().put(ISBN,temp);
            return  mapper.updateBookQuantity(ISBN,temp);
        }

    }

    @Override
    public void sell(String ISBN, int quantity)
    {
        int temp = mapper.getBookQuantityByISBN(ISBN);
        temp = temp + quantity;
        BookRepo.getBookRepo().put(ISBN,temp);
        mapper.updateBookQuantity(ISBN,temp);
    }

    @Override
    public String comment(String ID, String comment) {
        StringBuilder sb = new StringBuilder();
        String s;
        s = sb.append(mapper.getCommentByID(ID)).toString();
        if(s.length()==0)
            sb.append(comment);
        else
            sb.append("\n"+comment);
        mapper.updateComment(ID, sb.toString());
        return sb.toString();
    }
}
