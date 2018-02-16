
package org.calber.journal.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainStoryLink {

    @SerializedName("text")
    @Expose
    public String text;
    @SerializedName("url")
    @Expose
    public String url;

}
