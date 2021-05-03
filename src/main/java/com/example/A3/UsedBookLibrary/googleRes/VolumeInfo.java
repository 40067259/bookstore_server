
package com.example.A3.UsedBookLibrary.googleRes;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "authors",
    "publisher",
    "publishedDate",
    "industryIdentifiers",
    "readingModes",
    "pageCount",
    "printType",
    "categories",
    "maturityRating",
    "allowAnonLogging",
    "contentVersion",
    "imageLinks",
    "language",
    "previewLink",
    "infoLink",
    "canonicalVolumeLink",
    "subtitle",
    "description",
    "panelizationSummary",
    "averageRating",
    "ratingsCount"
})
@Generated("jsonschema2pojo")
public class VolumeInfo implements Serializable
{

    @JsonProperty("title")
    private String title;
    @JsonProperty("authors")
    private List<String> authors = null;
    @JsonProperty("publisher")
    private String publisher;
    @JsonProperty("publishedDate")
    private String publishedDate;
    @JsonProperty("industryIdentifiers")
    private List<IndustryIdentifier> industryIdentifiers = null;
    @JsonProperty("readingModes")
    private ReadingModes readingModes;
    @JsonProperty("pageCount")
    private int pageCount;
    @JsonProperty("printType")
    private String printType;
    @JsonProperty("categories")
    private List<String> categories = null;
    @JsonProperty("maturityRating")
    private String maturityRating;
    @JsonProperty("allowAnonLogging")
    private boolean allowAnonLogging;
    @JsonProperty("contentVersion")
    private String contentVersion;
    @JsonProperty("imageLinks")
    private ImageLinks imageLinks;
    @JsonProperty("language")
    private String language;
    @JsonProperty("previewLink")
    private String previewLink;
    @JsonProperty("infoLink")
    private String infoLink;
    @JsonProperty("canonicalVolumeLink")
    private String canonicalVolumeLink;
    @JsonProperty("subtitle")
    private String subtitle;
    @JsonProperty("description")
    private String description;
    @JsonProperty("panelizationSummary")
    private PanelizationSummary panelizationSummary;
    @JsonProperty("averageRating")
    private int averageRating;
    @JsonProperty("ratingsCount")
    private int ratingsCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 609692259960998326L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public VolumeInfo() {
    }

    /**
     * 
     * @param industryIdentifiers
     * @param pageCount
     * @param printType
     * @param readingModes
     * @param previewLink
     * @param canonicalVolumeLink
     * @param description
     * @param language
     * @param title
     * @param imageLinks
     * @param subtitle
     * @param panelizationSummary
     * @param averageRating
     * @param publisher
     * @param ratingsCount
     * @param publishedDate
     * @param categories
     * @param maturityRating
     * @param allowAnonLogging
     * @param contentVersion
     * @param authors
     * @param infoLink
     */
    public VolumeInfo(String title, List<String> authors, String publisher, String publishedDate, List<IndustryIdentifier> industryIdentifiers, ReadingModes readingModes, int pageCount, String printType, List<String> categories, String maturityRating, boolean allowAnonLogging, String contentVersion, ImageLinks imageLinks, String language, String previewLink, String infoLink, String canonicalVolumeLink, String subtitle, String description, PanelizationSummary panelizationSummary, int averageRating, int ratingsCount) {
        super();
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.industryIdentifiers = industryIdentifiers;
        this.readingModes = readingModes;
        this.pageCount = pageCount;
        this.printType = printType;
        this.categories = categories;
        this.maturityRating = maturityRating;
        this.allowAnonLogging = allowAnonLogging;
        this.contentVersion = contentVersion;
        this.imageLinks = imageLinks;
        this.language = language;
        this.previewLink = previewLink;
        this.infoLink = infoLink;
        this.canonicalVolumeLink = canonicalVolumeLink;
        this.subtitle = subtitle;
        this.description = description;
        this.panelizationSummary = panelizationSummary;
        this.averageRating = averageRating;
        this.ratingsCount = ratingsCount;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("authors")
    public List<String> getAuthors() {
        return authors;
    }

    @JsonProperty("authors")
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @JsonProperty("publisher")
    public String getPublisher() {
        return publisher;
    }

    @JsonProperty("publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @JsonProperty("publishedDate")
    public String getPublishedDate() {
        return publishedDate;
    }

    @JsonProperty("publishedDate")
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @JsonProperty("industryIdentifiers")
    public List<IndustryIdentifier> getIndustryIdentifiers() {
        return industryIdentifiers;
    }

    @JsonProperty("industryIdentifiers")
    public void setIndustryIdentifiers(List<IndustryIdentifier> industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
    }

    @JsonProperty("readingModes")
    public ReadingModes getReadingModes() {
        return readingModes;
    }

    @JsonProperty("readingModes")
    public void setReadingModes(ReadingModes readingModes) {
        this.readingModes = readingModes;
    }

    @JsonProperty("pageCount")
    public int getPageCount() {
        return pageCount;
    }

    @JsonProperty("pageCount")
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @JsonProperty("printType")
    public String getPrintType() {
        return printType;
    }

    @JsonProperty("printType")
    public void setPrintType(String printType) {
        this.printType = printType;
    }

    @JsonProperty("categories")
    public List<String> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    @JsonProperty("maturityRating")
    public String getMaturityRating() {
        return maturityRating;
    }

    @JsonProperty("maturityRating")
    public void setMaturityRating(String maturityRating) {
        this.maturityRating = maturityRating;
    }

    @JsonProperty("allowAnonLogging")
    public boolean isAllowAnonLogging() {
        return allowAnonLogging;
    }

    @JsonProperty("allowAnonLogging")
    public void setAllowAnonLogging(boolean allowAnonLogging) {
        this.allowAnonLogging = allowAnonLogging;
    }

    @JsonProperty("contentVersion")
    public String getContentVersion() {
        return contentVersion;
    }

    @JsonProperty("contentVersion")
    public void setContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
    }

    @JsonProperty("imageLinks")
    public ImageLinks getImageLinks() {
        return imageLinks;
    }

    @JsonProperty("imageLinks")
    public void setImageLinks(ImageLinks imageLinks) {
        this.imageLinks = imageLinks;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("previewLink")
    public String getPreviewLink() {
        return previewLink;
    }

    @JsonProperty("previewLink")
    public void setPreviewLink(String previewLink) {
        this.previewLink = previewLink;
    }

    @JsonProperty("infoLink")
    public String getInfoLink() {
        return infoLink;
    }

    @JsonProperty("infoLink")
    public void setInfoLink(String infoLink) {
        this.infoLink = infoLink;
    }

    @JsonProperty("canonicalVolumeLink")
    public String getCanonicalVolumeLink() {
        return canonicalVolumeLink;
    }

    @JsonProperty("canonicalVolumeLink")
    public void setCanonicalVolumeLink(String canonicalVolumeLink) {
        this.canonicalVolumeLink = canonicalVolumeLink;
    }

    @JsonProperty("subtitle")
    public String getSubtitle() {
        return subtitle;
    }

    @JsonProperty("subtitle")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("panelizationSummary")
    public PanelizationSummary getPanelizationSummary() {
        return panelizationSummary;
    }

    @JsonProperty("panelizationSummary")
    public void setPanelizationSummary(PanelizationSummary panelizationSummary) {
        this.panelizationSummary = panelizationSummary;
    }

    @JsonProperty("averageRating")
    public int getAverageRating() {
        return averageRating;
    }

    @JsonProperty("averageRating")
    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    @JsonProperty("ratingsCount")
    public int getRatingsCount() {
        return ratingsCount;
    }

    @JsonProperty("ratingsCount")
    public void setRatingsCount(int ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VolumeInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("authors");
        sb.append('=');
        sb.append(((this.authors == null)?"<null>":this.authors));
        sb.append(',');
        sb.append("publisher");
        sb.append('=');
        sb.append(((this.publisher == null)?"<null>":this.publisher));
        sb.append(',');
        sb.append("publishedDate");
        sb.append('=');
        sb.append(((this.publishedDate == null)?"<null>":this.publishedDate));
        sb.append(',');
        sb.append("industryIdentifiers");
        sb.append('=');
        sb.append(((this.industryIdentifiers == null)?"<null>":this.industryIdentifiers));
        sb.append(',');
        sb.append("readingModes");
        sb.append('=');
        sb.append(((this.readingModes == null)?"<null>":this.readingModes));
        sb.append(',');
        sb.append("pageCount");
        sb.append('=');
        sb.append(this.pageCount);
        sb.append(',');
        sb.append("printType");
        sb.append('=');
        sb.append(((this.printType == null)?"<null>":this.printType));
        sb.append(',');
        sb.append("categories");
        sb.append('=');
        sb.append(((this.categories == null)?"<null>":this.categories));
        sb.append(',');
        sb.append("maturityRating");
        sb.append('=');
        sb.append(((this.maturityRating == null)?"<null>":this.maturityRating));
        sb.append(',');
        sb.append("allowAnonLogging");
        sb.append('=');
        sb.append(this.allowAnonLogging);
        sb.append(',');
        sb.append("contentVersion");
        sb.append('=');
        sb.append(((this.contentVersion == null)?"<null>":this.contentVersion));
        sb.append(',');
        sb.append("imageLinks");
        sb.append('=');
        sb.append(((this.imageLinks == null)?"<null>":this.imageLinks));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("previewLink");
        sb.append('=');
        sb.append(((this.previewLink == null)?"<null>":this.previewLink));
        sb.append(',');
        sb.append("infoLink");
        sb.append('=');
        sb.append(((this.infoLink == null)?"<null>":this.infoLink));
        sb.append(',');
        sb.append("canonicalVolumeLink");
        sb.append('=');
        sb.append(((this.canonicalVolumeLink == null)?"<null>":this.canonicalVolumeLink));
        sb.append(',');
        sb.append("subtitle");
        sb.append('=');
        sb.append(((this.subtitle == null)?"<null>":this.subtitle));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("panelizationSummary");
        sb.append('=');
        sb.append(((this.panelizationSummary == null)?"<null>":this.panelizationSummary));
        sb.append(',');
        sb.append("averageRating");
        sb.append('=');
        sb.append(this.averageRating);
        sb.append(',');
        sb.append("ratingsCount");
        sb.append('=');
        sb.append(this.ratingsCount);
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.industryIdentifiers == null)? 0 :this.industryIdentifiers.hashCode()));
        result = ((result* 31)+ this.pageCount);
        result = ((result* 31)+((this.printType == null)? 0 :this.printType.hashCode()));
        result = ((result* 31)+((this.readingModes == null)? 0 :this.readingModes.hashCode()));
        result = ((result* 31)+((this.previewLink == null)? 0 :this.previewLink.hashCode()));
        result = ((result* 31)+((this.canonicalVolumeLink == null)? 0 :this.canonicalVolumeLink.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.imageLinks == null)? 0 :this.imageLinks.hashCode()));
        result = ((result* 31)+((this.subtitle == null)? 0 :this.subtitle.hashCode()));
        result = ((result* 31)+((this.panelizationSummary == null)? 0 :this.panelizationSummary.hashCode()));
        result = ((result* 31)+ this.averageRating);
        result = ((result* 31)+((this.publisher == null)? 0 :this.publisher.hashCode()));
        result = ((result* 31)+ this.ratingsCount);
        result = ((result* 31)+((this.publishedDate == null)? 0 :this.publishedDate.hashCode()));
        result = ((result* 31)+((this.categories == null)? 0 :this.categories.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.maturityRating == null)? 0 :this.maturityRating.hashCode()));
        result = ((result* 31)+(this.allowAnonLogging? 1 : 0));
        result = ((result* 31)+((this.contentVersion == null)? 0 :this.contentVersion.hashCode()));
        result = ((result* 31)+((this.authors == null)? 0 :this.authors.hashCode()));
        result = ((result* 31)+((this.infoLink == null)? 0 :this.infoLink.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VolumeInfo) == false) {
            return false;
        }
        VolumeInfo rhs = ((VolumeInfo) other);
        return ((((((((((((((((((((((((this.industryIdentifiers == rhs.industryIdentifiers)||((this.industryIdentifiers!= null)&&this.industryIdentifiers.equals(rhs.industryIdentifiers)))&&(this.pageCount == rhs.pageCount))&&((this.printType == rhs.printType)||((this.printType!= null)&&this.printType.equals(rhs.printType))))&&((this.readingModes == rhs.readingModes)||((this.readingModes!= null)&&this.readingModes.equals(rhs.readingModes))))&&((this.previewLink == rhs.previewLink)||((this.previewLink!= null)&&this.previewLink.equals(rhs.previewLink))))&&((this.canonicalVolumeLink == rhs.canonicalVolumeLink)||((this.canonicalVolumeLink!= null)&&this.canonicalVolumeLink.equals(rhs.canonicalVolumeLink))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.imageLinks == rhs.imageLinks)||((this.imageLinks!= null)&&this.imageLinks.equals(rhs.imageLinks))))&&((this.subtitle == rhs.subtitle)||((this.subtitle!= null)&&this.subtitle.equals(rhs.subtitle))))&&((this.panelizationSummary == rhs.panelizationSummary)||((this.panelizationSummary!= null)&&this.panelizationSummary.equals(rhs.panelizationSummary))))&&(this.averageRating == rhs.averageRating))&&((this.publisher == rhs.publisher)||((this.publisher!= null)&&this.publisher.equals(rhs.publisher))))&&(this.ratingsCount == rhs.ratingsCount))&&((this.publishedDate == rhs.publishedDate)||((this.publishedDate!= null)&&this.publishedDate.equals(rhs.publishedDate))))&&((this.categories == rhs.categories)||((this.categories!= null)&&this.categories.equals(rhs.categories))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.maturityRating == rhs.maturityRating)||((this.maturityRating!= null)&&this.maturityRating.equals(rhs.maturityRating))))&&(this.allowAnonLogging == rhs.allowAnonLogging))&&((this.contentVersion == rhs.contentVersion)||((this.contentVersion!= null)&&this.contentVersion.equals(rhs.contentVersion))))&&((this.authors == rhs.authors)||((this.authors!= null)&&this.authors.equals(rhs.authors))))&&((this.infoLink == rhs.infoLink)||((this.infoLink!= null)&&this.infoLink.equals(rhs.infoLink))));
    }

}
