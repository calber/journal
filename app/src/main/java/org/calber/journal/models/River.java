
package org.calber.journal.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class River {

    @SerializedName("rendered")
    @Expose
    public Integer rendered;
    @SerializedName("status")
    @Expose
    public Boolean status;
    @SerializedName("response")
    @Expose
    public Response response;
    @SerializedName("version")
    @Expose
    public String version;
    @SerializedName("request")
    @Expose
    public Request request;

}
