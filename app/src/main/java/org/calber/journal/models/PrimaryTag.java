
package org.calber.journal.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrimaryTag {

    @SerializedName("slug")
    @Expose
    public String slug;
    @SerializedName("name")
    @Expose
    public String name;

}
