
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
    "saleability",
    "isEbook",
    "buyLink"
})
@Generated("jsonschema2pojo")
public class SaleInfo implements Serializable
{

    @JsonProperty("country")
    private String country;
    @JsonProperty("saleability")
    private String saleability;
    @JsonProperty("isEbook")
    private boolean isEbook;
    @JsonProperty("buyLink")
    private String buyLink;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3696708144993246207L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SaleInfo() {
    }

    /**
     * 
     * @param country
     * @param isEbook
     * @param saleability
     * @param buyLink
     */
    public SaleInfo(String country, String saleability, boolean isEbook, String buyLink) {
        super();
        this.country = country;
        this.saleability = saleability;
        this.isEbook = isEbook;
        this.buyLink = buyLink;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("saleability")
    public String getSaleability() {
        return saleability;
    }

    @JsonProperty("saleability")
    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    @JsonProperty("isEbook")
    public boolean isIsEbook() {
        return isEbook;
    }

    @JsonProperty("isEbook")
    public void setIsEbook(boolean isEbook) {
        this.isEbook = isEbook;
    }

    @JsonProperty("buyLink")
    public String getBuyLink() {
        return buyLink;
    }

    @JsonProperty("buyLink")
    public void setBuyLink(String buyLink) {
        this.buyLink = buyLink;
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
        sb.append(SaleInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("saleability");
        sb.append('=');
        sb.append(((this.saleability == null)?"<null>":this.saleability));
        sb.append(',');
        sb.append("isEbook");
        sb.append('=');
        sb.append(this.isEbook);
        sb.append(',');
        sb.append("buyLink");
        sb.append('=');
        sb.append(((this.buyLink == null)?"<null>":this.buyLink));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+(this.isEbook? 1 : 0));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.saleability == null)? 0 :this.saleability.hashCode()));
        result = ((result* 31)+((this.buyLink == null)? 0 :this.buyLink.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SaleInfo) == false) {
            return false;
        }
        SaleInfo rhs = ((SaleInfo) other);
        return ((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&(this.isEbook == rhs.isEbook))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.saleability == rhs.saleability)||((this.saleability!= null)&&this.saleability.equals(rhs.saleability))))&&((this.buyLink == rhs.buyLink)||((this.buyLink!= null)&&this.buyLink.equals(rhs.buyLink))));
    }

}
