
package org.calber.journal.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HideArticleImage {

    @SerializedName("image")
    @Expose
    public Object image;
    @SerializedName("width")
    @Expose
    public Object width;
    @SerializedName("height")
    @Expose
    public Object height;

}
