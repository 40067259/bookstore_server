package com.example.A3.UsedBookLibrary.exception;

public class DuplicatedIdException extends Exception{
    public DuplicatedIdException(){
        super("The ISBN has been existed,please update that one");
    }
}