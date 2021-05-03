package com.example.A3.UsedBookLibrary.exception;

public class notEnoughQuantityException extends  Exception {
    public notEnoughQuantityException(){
        super("there is no enough quantity of the book for sale.");
    }
}
