
package org.calber.journal.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrimaryImage {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("object_id")
    @Expose
    public Integer objectId;
    @SerializedName("object_type")
    @Expose
    public String objectType;
    @SerializedName("crops")
    @Expose
    public List<String> crops = null;
    @SerializedName("credit")
    @Expose
    public Credit_ credit;
    @SerializedName("version")
    @Expose
    public Integer version;

}
