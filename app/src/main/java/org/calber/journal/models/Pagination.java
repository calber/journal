
package org.calber.journal.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagination {

    @SerializedName("total_results")
    @Expose
    public Integer totalResults;
    @SerializedName("results_per_page")
    @Expose
    public Integer resultsPerPage;
    @SerializedName("num_pages")
    @Expose
    public Integer numPages;
    @SerializedName("current_page")
    @Expose
    public Integer currentPage;
    @SerializedName("first_on_page")
    @Expose
    public Integer firstOnPage;
    @SerializedName("last_on_page")
    @Expose
    public Integer lastOnPage;
    @SerializedName("unpublished")
    @Expose
    public List<String> unpublished = null;

}
