
package org.calber.journal.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Article {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("slug")
    @Expose
    public String slug;
    @SerializedName("date")
    @Expose
    public String date;
    @SerializedName("date_modified")
    @Expose
    public String dateModified;
    @SerializedName("date_published")
    @Expose
    public String datePublished;
    @SerializedName("is_updated")
    @Expose
    public Boolean isUpdated;
    @SerializedName("excerpt")
    @Expose
    public String excerpt;
    @SerializedName("content")
    @Expose
    public String content;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("author")
    @Expose
    public Author author;
    @SerializedName("primary_image")
    @Expose
    public PrimaryImage primaryImage;
    @SerializedName("images")
    @Expose
    public Images images;

}
