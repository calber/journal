
package org.calber.journal.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images {

    @SerializedName("thumbnail")
    @Expose
    public Thumbnail thumbnail;
    @SerializedName("medium")
    @Expose
    public Medium medium;
    @SerializedName("large")
    @Expose
    public Large large;
    @SerializedName("original")
    @Expose
    public Original original;

}
