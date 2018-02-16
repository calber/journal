
package org.calber.journal.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("views")
    @Expose
    public String views;
    @SerializedName("comments")
    @Expose
    public String comments;
    @SerializedName("facebook")
    @Expose
    public String facebook;
    @SerializedName("twitter")
    @Expose
    public String twitter;
    @SerializedName("email")
    @Expose
    public String email;
    @SerializedName("dislikes")
    @Expose
    public String dislikes;
    @SerializedName("likes")
    @Expose
    public String likes;

}
