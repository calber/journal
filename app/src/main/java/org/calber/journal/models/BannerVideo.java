
package org.calber.journal.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BannerVideo {

    @SerializedName("has_banner_video")
    @Expose
    public Boolean hasBannerVideo;
    @SerializedName("embed")
    @Expose
    public Object embed;

}
