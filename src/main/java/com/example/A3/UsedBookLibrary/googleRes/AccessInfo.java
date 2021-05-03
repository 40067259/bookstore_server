
package com.example.A3.UsedBookLibrary.googleRes;

import java.io.Serializable;
import java.util.HashMap;
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
    "country",
    "viewability",
    "embeddable",
    "publicDomain",
    "textToSpeechPermission",
    "epub",
    "pdf",
    "webReaderLink",
    "accessViewStatus",
    "quoteSharingAllowed"
})
@Generated("jsonschema2pojo")
public class AccessInfo implements Serializable
{

    @JsonProperty("country")
    private String country;
    @JsonProperty("viewability")
    private String viewability;
    @JsonProperty("embeddable")
    private boolean embeddable;
    @JsonProperty("publicDomain")
    private boolean publicDomain;
    @JsonProperty("textToSpeechPermission")
    private String textToSpeechPermission;
    @JsonProperty("epub")
    private Epub epub;
    @JsonProperty("pdf")
    private Pdf pdf;
    @JsonProperty("webReaderLink")
    private String webReaderLink;
    @JsonProperty("accessViewStatus")
    private String accessViewStatus;
    @JsonProperty("quoteSharingAllowed")
    private boolean quoteSharingAllowed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4790992031429976209L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AccessInfo() {
    }

    /**
     * 
     * @param accessViewStatus
     * @param country
     * @param viewability
     * @param pdf
     * @param webReaderLink
     * @param epub
     * @param publicDomain
     * @param quoteSharingAllowed
     * @param embeddable
     * @param textToSpeechPermission
     */
    public AccessInfo(String country, String viewability, boolean embeddable, boolean publicDomain, String textToSpeechPermission, Epub epub, Pdf pdf, String webReaderLink, String accessViewStatus, boolean quoteSharingAllowed) {
        super();
        this.country = country;
        this.viewability = viewability;
        this.embeddable = embeddable;
        this.publicDomain = publicDomain;
        this.textToSpeechPermission = textToSpeechPermission;
        this.epub = epub;
        this.pdf = pdf;
        this.webReaderLink = webReaderLink;
        this.accessViewStatus = accessViewStatus;
        this.quoteSharingAllowed = quoteSharingAllowed;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("viewability")
    public String getViewability() {
        return viewability;
    }

    @JsonProperty("viewability")
    public void setViewability(String viewability) {
        this.viewability = viewability;
    }

    @JsonProperty("embeddable")
    public boolean isEmbeddable() {
        return embeddable;
    }

    @JsonProperty("embeddable")
    public void setEmbeddable(boolean embeddable) {
        this.embeddable = embeddable;
    }

    @JsonProperty("publicDomain")
    public boolean isPublicDomain() {
        return publicDomain;
    }

    @JsonProperty("publicDomain")
    public void setPublicDomain(boolean publicDomain) {
        this.publicDomain = publicDomain;
    }

    @JsonProperty("textToSpeechPermission")
    public String getTextToSpeechPermission() {
        return textToSpeechPermission;
    }

    @JsonProperty("textToSpeechPermission")
    public void setTextToSpeechPermission(String textToSpeechPermission) {
        this.textToSpeechPermission = textToSpeechPermission;
    }

    @JsonProperty("epub")
    public Epub getEpub() {
        return epub;
    }

    @JsonProperty("epub")
    public void setEpub(Epub epub) {
        this.epub = epub;
    }

    @JsonProperty("pdf")
    public Pdf getPdf() {
        return pdf;
    }

    @JsonProperty("pdf")
    public void setPdf(Pdf pdf) {
        this.pdf = pdf;
    }

    @JsonProperty("webReaderLink")
    public String getWebReaderLink() {
        return webReaderLink;
    }

    @JsonProperty("webReaderLink")
    public void setWebReaderLink(String webReaderLink) {
        this.webReaderLink = webReaderLink;
    }

    @JsonProperty("accessViewStatus")
    public String getAccessViewStatus() {
        return accessViewStatus;
    }

    @JsonProperty("accessViewStatus")
    public void setAccessViewStatus(String accessViewStatus) {
        this.accessViewStatus = accessViewStatus;
    }

    @JsonProperty("quoteSharingAllowed")
    public boolean isQuoteSharingAllowed() {
        return quoteSharingAllowed;
    }

    @JsonProperty("quoteSharingAllowed")
    public void setQuoteSharingAllowed(boolean quoteSharingAllowed) {
        this.quoteSharingAllowed = quoteSharingAllowed;
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
        sb.append(AccessInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("viewability");
        sb.append('=');
        sb.append(((this.viewability == null)?"<null>":this.viewability));
        sb.append(',');
        sb.append("embeddable");
        sb.append('=');
        sb.append(this.embeddable);
        sb.append(',');
        sb.append("publicDomain");
        sb.append('=');
        sb.append(this.publicDomain);
        sb.append(',');
        sb.append("textToSpeechPermission");
        sb.append('=');
        sb.append(((this.textToSpeechPermission == null)?"<null>":this.textToSpeechPermission));
        sb.append(',');
        sb.append("epub");
        sb.append('=');
        sb.append(((this.epub == null)?"<null>":this.epub));
        sb.append(',');
        sb.append("pdf");
        sb.append('=');
        sb.append(((this.pdf == null)?"<null>":this.pdf));
        sb.append(',');
        sb.append("webReaderLink");
        sb.append('=');
        sb.append(((this.webReaderLink == null)?"<null>":this.webReaderLink));
        sb.append(',');
        sb.append("accessViewStatus");
        sb.append('=');
        sb.append(((this.accessViewStatus == null)?"<null>":this.accessViewStatus));
        sb.append(',');
        sb.append("quoteSharingAllowed");
        sb.append('=');
        sb.append(this.quoteSharingAllowed);
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
        result = ((result* 31)+((this.accessViewStatus == null)? 0 :this.accessViewStatus.hashCode()));
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.viewability == null)? 0 :this.viewability.hashCode()));
        result = ((result* 31)+((this.pdf == null)? 0 :this.pdf.hashCode()));
        result = ((result* 31)+((this.webReaderLink == null)? 0 :this.webReaderLink.hashCode()));
        result = ((result* 31)+((this.epub == null)? 0 :this.epub.hashCode()));
        result = ((result* 31)+(this.publicDomain? 1 : 0));
        result = ((result* 31)+(this.quoteSharingAllowed? 1 : 0));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+(this.embeddable? 1 : 0));
        result = ((result* 31)+((this.textToSpeechPermission == null)? 0 :this.textToSpeechPermission.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccessInfo) == false) {
            return false;
        }
        AccessInfo rhs = ((AccessInfo) other);
        return ((((((((((((this.accessViewStatus == rhs.accessViewStatus)||((this.accessViewStatus!= null)&&this.accessViewStatus.equals(rhs.accessViewStatus)))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.viewability == rhs.viewability)||((this.viewability!= null)&&this.viewability.equals(rhs.viewability))))&&((this.pdf == rhs.pdf)||((this.pdf!= null)&&this.pdf.equals(rhs.pdf))))&&((this.webReaderLink == rhs.webReaderLink)||((this.webReaderLink!= null)&&this.webReaderLink.equals(rhs.webReaderLink))))&&((this.epub == rhs.epub)||((this.epub!= null)&&this.epub.equals(rhs.epub))))&&(this.publicDomain == rhs.publicDomain))&&(this.quoteSharingAllowed == rhs.quoteSharingAllowed))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&(this.embeddable == rhs.embeddable))&&((this.textToSpeechPermission == rhs.textToSpeechPermission)||((this.textToSpeechPermission!= null)&&this.textToSpeechPermission.equals(rhs.textToSpeechPermission))));
    }

}
