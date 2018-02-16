
package org.calber.journal.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InlineImage {

    @SerializedName("src")
    @Expose
    public String src;
    @SerializedName("width")
    @Expose
    public Integer width;
    @SerializedName("height")
    @Expose
    public Integer height;
    @SerializedName("alt")
    @Expose
    public String alt;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("caption")
    @Expose
    public String caption;
    @SerializedName("credit")
    @Expose
    public Credit credit;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("class")
    @Expose
    public String _class;
    @SerializedName("key")
    @Expose
    public String key;
    @SerializedName("object_id")
    @Expose
    public String objectId;
    @SerializedName("object_type")
    @Expose
    public String objectType;
    @SerializedName("version")
    @Expose
    public String version;

}
