
package org.calber.journal.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("articles")
    @Expose
    public List<Article> articles = null;
    @SerializedName("pagination")
    @Expose
    public Pagination pagination;

}
