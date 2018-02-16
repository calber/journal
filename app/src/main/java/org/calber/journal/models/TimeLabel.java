
package org.calber.journal.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TimeLabel {

    @SerializedName("is_displayed")
    @Expose
    public Boolean isDisplayed;
    @SerializedName("is_replaced")
    @Expose
    public Boolean isReplaced;
    @SerializedName("replacement_text")
    @Expose
    public Object replacementText;

}
