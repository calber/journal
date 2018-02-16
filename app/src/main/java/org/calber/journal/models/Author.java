
package org.calber.journal.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Author {

    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("email")
    @Expose
    public String email;
    @SerializedName("twitter")
    @Expose
    public String twitter;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("googleplus")
    @Expose
    public String googleplus;
    @SerializedName("slug")
    @Expose
    public String slug;
    @SerializedName("publication")
    @Expose
    public String publication;
    @SerializedName("is_admin")
    @Expose
    public Boolean isAdmin;
    @SerializedName("avatar")
    @Expose
    public String avatar;
    @SerializedName("is_syndication")
    @Expose
    public Boolean isSyndication;

}
