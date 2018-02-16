
package org.calber.journal.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DfpUnits {

    @SerializedName("dfp_footer")
    @Expose
    public Boolean dfpFooter;
    @SerializedName("dfp_logo")
    @Expose
    public Boolean dfpLogo;
    @SerializedName("dfp_mpu")
    @Expose
    public Boolean dfpMpu;

}
