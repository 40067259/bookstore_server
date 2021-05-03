package com.example.A3.UsedBookLibrary.domain;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class GoogleResult {

        @XmlAttribute
        private int ID;
        @XmlElement
        private String coverLink;
        @XmlElement
        private String title;
        @XmlElement
        private String description;
        @XmlElement
        private String ISBN;

    public GoogleResult(int ID, String coverLink, String title, String description, String ISBN) {
        this.ID = ID;
        this.coverLink = coverLink;
        this.title = title;
        this.description = description;
        this.ISBN = ISBN;
    }

    public GoogleResult() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCoverLink() {
        return coverLink;
    }

    public void setCoverLink(String coverLink) {
        this.coverLink = coverLink;
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
