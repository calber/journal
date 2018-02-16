
package org.calber.journal.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Credit {

    @SerializedName("source")
    @Expose
    public String source;
    @SerializedName("html")
    @Expose
    public String html;

}
