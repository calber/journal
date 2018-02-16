
package org.calber.journal.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PublicationData {

    @SerializedName("primary")
    @Expose
    public String primary;
    @SerializedName("all")
    @Expose
    public List<String> all = null;
    @SerializedName("categories")
    @Expose
    public Categories_ categories;

}
