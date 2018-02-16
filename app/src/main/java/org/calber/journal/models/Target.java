
package org.calber.journal.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Target {

    @SerializedName("key")
    @Expose
    public String key;
    @SerializedName("values")
    @Expose
    public List<String> values = null;

}
