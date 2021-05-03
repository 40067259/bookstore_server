package com.example.A3.UsedBookLibrary.service;

import com.example.A3.UsedBookLibrary.domain.AD;
import com.example.A3.UsedBookLibrary.domain.Book;
import com.example.A3.UsedBookLibrary.exception.notEnoughQuantityException;

import java.sql.Blob;
import java.util.List;

public interface UsedBookService {

    //common
    Book searchBook(String ISBN);
    AD searchAD(String ID);
    String searchBookAtAmazon(String ISBN);
    String getPostTime();
    String getComment(String ID);
    int getBookQuantity(String ISBN);

    //admin
    int importBook(String ISBN, String title, String author,
                   String description, String year, Blob cover);
    
    int updateBook(String ISBN, String title, String author,
                   String description, String year, Blob cover);
    int deleteBook(String ISBN);

    boolean getADState(String ID);
    void banAD(String ID);
    void banComment();
    boolean verifyAD();
    int updateBookCover(String ISBN,Blob cover);
    int deleteBookCover(String ISBN);
    byte [] getBookCover(String ISBN);

    //seller
    int postAD(String ID, String title, String description, double price,
               String ISBN, String comment, int quantity, Blob cover); // sell
    int updateAD(String ID, String title, String description, double price,
                 String ISBN, String comment, int quantity, Blob cover); // edit
    int deleteAD(String ID);

    void sell(String ISBN, int quantity);
    AD getAD(String ID);
    List<AD> getAllAD();

    //buyer
    int buy(String ISBN,int quantity) throws notEnoughQuantityException;
    String comment(String ID, String comment);

}
