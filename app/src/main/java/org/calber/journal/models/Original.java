
package org.calber.journal.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Original {

    @SerializedName("image")
    @Expose
    public String image;
    @SerializedName("width")
    @Expose
    public Boolean width;
    @SerializedName("height")
    @Expose
    public Boolean height;

}
