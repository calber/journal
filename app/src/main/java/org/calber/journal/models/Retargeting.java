
package org.calber.journal.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Retargeting {

    @SerializedName("key")
    @Expose
    public String key;
    @SerializedName("bucket_ttl")
    @Expose
    public Integer bucketTtl;
    @SerializedName("threshold")
    @Expose
    public Integer threshold;
    @SerializedName("threshold_window")
    @Expose
    public Integer thresholdWindow;

}
