package org.calber.journal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSyntaxException;

import org.calber.journal.models.Images;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by calber on 2/2/18.
 */

class ApiController {

    private static final String APIURL = "http://api.thejournal.ie/v3/";
    public final JournalApi api;

    public ApiController() {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")

                .registerTypeAdapter(Images.class, (JsonDeserializer<Images>) (json, typeOfT, context) -> {
                    try {
                        return new Gson().fromJson(json, Images.class);
                    } catch (JsonSyntaxException e) {
                        return new Images();
                    }
                })
                .create();

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.HEADERS))
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(APIURL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        api = retrofit.create(JournalApi.class);
    }

    /**
     * https://developer.android.com/training/testing/espresso/idling-resource.html
     */
    private void prepareIdlingResource() {
        if (Application.getApiIdlingResource() != null) {
            Application.apiIdlingResource.setIdleState(false);
        }
    }

    /**
     * https://developer.android.com/training/testing/espresso/idling-resource.html
     */
    private void removeIdlingResource() {
        if (Application.getApiIdlingResource() != null) {
            Application.apiIdlingResource.setIdleState(true);
        }
    }


}
