
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
    "isAvailable",
    "downloadLink"
})
@Generated("jsonschema2pojo")
public class Epub implements Serializable
{

    @JsonProperty("isAvailable")
    private boolean isAvailable;
    @JsonProperty("downloadLink")
    private String downloadLink;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7962800176132117088L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Epub() {
    }

    /**
     * 
     * @param isAvailable
     * @param downloadLink
     */
    public Epub(boolean isAvailable, String downloadLink) {
        super();
        this.isAvailable = isAvailable;
        this.downloadLink = downloadLink;
    }

    @JsonProperty("isAvailable")
    public boolean isIsAvailable() {
        return isAvailable;
    }

    @JsonProperty("isAvailable")
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @JsonProperty("downloadLink")
    public String getDownloadLink() {
        return downloadLink;
    }

    @JsonProperty("downloadLink")
    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
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
        sb.append(Epub.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isAvailable");
        sb.append('=');
        sb.append(this.isAvailable);
        sb.append(',');
        sb.append("downloadLink");
        sb.append('=');
        sb.append(((this.downloadLink == null)?"<null>":this.downloadLink));
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
        result = ((result* 31)+(this.isAvailable? 1 : 0));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.downloadLink == null)? 0 :this.downloadLink.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Epub) == false) {
            return false;
        }
        Epub rhs = ((Epub) other);
        return (((this.isAvailable == rhs.isAvailable)&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.downloadLink == rhs.downloadLink)||((this.downloadLink!= null)&&this.downloadLink.equals(rhs.downloadLink))));
    }

}
