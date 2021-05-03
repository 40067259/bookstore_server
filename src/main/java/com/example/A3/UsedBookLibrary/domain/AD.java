package com.example.A3.UsedBookLibrary.domain;

import javax.xml.bind.annotation.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AD implements Comparable{

    static Set<String> ADSet = new HashSet<>();
    @XmlAttribute
    private String ID;
    @XmlElement
    private Book book;
    @XmlElement
    private String title;
    @XmlElement
    private String description;
    @XmlElement
    private double price;
    @XmlElement
    private String comment;
    @XmlElement
    private boolean ban = true;
    @XmlElement
    private int quantity =0;
    @XmlElement
    public byte [] cover;

    public AD() {
    }

    public AD(Book book, String title, String description, double price, int quantity, byte[] cover) {
        ID = UUID.randomUUID().toString().toLowerCase().substring(0,6);
        while(ADSet.contains(ID)){
            ID = UUID.randomUUID().toString().toLowerCase().substring(1,7);
        }
        this.book = book;
        this.title = title;
        this.description = description;
        this.price = price;
        this.comment = comment;
        this.quantity = quantity;
        this.cover = cover;
        ADSet.add(ID);
    }

    public static Set<String> getADSet() {
        return ADSet;
    }

    public static void setADSet(Set<String> ADSet) {
        AD.ADSet = ADSet;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isBan() {
        return ban;
    }

    public void setBan(boolean ban) {
        this.ban = ban;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    @Override
    public int compareTo(Object o) {
        AD tem = (AD) o;
        return this.title.compareTo(((AD) o).title);
    }
}

