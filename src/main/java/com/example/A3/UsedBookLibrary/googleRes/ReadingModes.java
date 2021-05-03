
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
    "text",
    "image"
})
@Generated("jsonschema2pojo")
public class ReadingModes implements Serializable
{

    @JsonProperty("text")
    private boolean text;
    @JsonProperty("image")
    private boolean image;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2229858657081926040L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReadingModes() {
    }

    /**
     * 
     * @param image
     * @param text
     */
    public ReadingModes(boolean text, boolean image) {
        super();
        this.text = text;
        this.image = image;
    }

    @JsonProperty("text")
    public boolean isText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(boolean text) {
        this.text = text;
    }

    @JsonProperty("image")
    public boolean isImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(boolean image) {
        this.image = image;
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
        sb.append(ReadingModes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("text");
        sb.append('=');
        sb.append(this.text);
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(this.image);
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
        result = ((result* 31)+(this.image? 1 : 0));
        result = ((result* 31)+(this.text? 1 : 0));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReadingModes) == false) {
            return false;
        }
        ReadingModes rhs = ((ReadingModes) other);
        return (((this.image == rhs.image)&&(this.text == rhs.text))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
