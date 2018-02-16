
package org.calber.journal.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Categories_ {

    @SerializedName("thejournal")
    @Expose
    public List<Thejournal_> thejournal = null;

}
