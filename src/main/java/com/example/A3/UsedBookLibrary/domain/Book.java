package com.example.A3.UsedBookLibrary.domain;

import com.example.A3.UsedBookLibrary.exception.DuplicatedIdException;

import javax.xml.bind.annotation.*;
import java.sql.Blob;
import java.util.HashSet;
import java.util.Set;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Book implements Comparable{
    static Set<String> ISBNSet = new HashSet<>();
    @XmlAttribute
    private String ISBN;
    @XmlElement
    private String title;
    @XmlElement
    private String author;
    @XmlElement
    private String description;
    @XmlElement
    private String year;
    @XmlElement
    public byte [] cover;
    public Book() {
    }

    public Book(String ISBN, String title, String author,
                String description, String year, byte [] cover) throws DuplicatedIdException
    {
        if(ISBNSet.contains(ISBN)) throw new DuplicatedIdException();
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.description = description;
        this.year = year;
        this.cover = cover;
        ISBNSet.add(ISBN);
    }

    public static Set<String> getISBNSet() {
        return ISBNSet;
    }

    public static void setISBNSet(Set<String> ISBNSet) {
        Book.ISBNSet = ISBNSet;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public byte [] getCover() {
        return cover;
    }

    public void setCover(byte [] cover) {
        this.cover = cover;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
