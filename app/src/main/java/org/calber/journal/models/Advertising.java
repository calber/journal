
package org.calber.journal.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Advertising {

    @SerializedName("targets")
    @Expose
    public List<Target> targets = null;
    @SerializedName("dfp_unit_template")
    @Expose
    public String dfpUnitTemplate;
    @SerializedName("dfp_units")
    @Expose
    public DfpUnits dfpUnits;

}
