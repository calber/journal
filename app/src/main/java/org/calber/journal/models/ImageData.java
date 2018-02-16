
package org.calber.journal.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageData {

    @SerializedName("orientation")
    @Expose
    public String orientation;
    @SerializedName("credit")
    @Expose
    public String credit;
    @SerializedName("caption")
    @Expose
    public String caption;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("raw_source")
    @Expose
    public String rawSource;
    @SerializedName("raw_source_url")
    @Expose
    public Boolean rawSourceUrl;

}
