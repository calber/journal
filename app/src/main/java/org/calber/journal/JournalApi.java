package org.calber.journal;


import org.calber.journal.models.River;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by calber on 13/2/18.
 */

public interface JournalApi {

    public final String[] PUBSTAG = {"thejournal", "thescore", "thedailyedge", "businessetc"};
    public final String[] SLUGSTAG = {"google", "apple", "hogan-knows-best"};

    @Headers("Authorization: Basic c2FtcGxlOmVmZXJ3NXdyMzM1wqM2NQ==")
    @GET("sample/{publication}")
    Observable<River> publication(@Path("publication") String publication);

    @Headers("Authorization: Basic c2FtcGxlOmVmZXJ3NXdyMzM1wqM2NQ==")
    @GET("sample/tag/{slug}")
    Observable<River> slug(@Path("slug") String slug);

}
