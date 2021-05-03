package com.example.A3.UsedBookLibrary.repo;

import com.example.A3.UsedBookLibrary.mapper.UsedBookMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BookRepo {
    @Autowired
    UsedBookMapper mapper;
    static Map<String, Integer> BookRepo = new HashMap<String,Integer>();
    @XmlElement
    private String ISBN;
    @XmlElement
    private int quantity;

    public BookRepo() {
    }

    public static Map<String, Integer> getBookRepo() {
        return BookRepo;
    }

    public static void setBookRepo(Map<String, Integer> bookRepo) {
        BookRepo = bookRepo;
    }

    public Integer getQuantity(String ISBN)
    {
        return mapper.getBookQuantityByISBN(ISBN);
    }

    public void addQuantity(String ISBN, int n)
    {
        int t = mapper.getBookQuantityByISBN(ISBN);
        mapper.updateBookQuantity(ISBN, t+n);

    }
    public void decreaseQuantity(int n)
    {

    }

}
