package com.evil.mp3down;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface Api {
    String SEARCH_API = "http://mobilecdngz.kugou.com/api/v3/search/";
    String DOWN_URL = "http://m.kugou.com/app/i/";

    @GET("song")
    Call<ResponseBody> search(
            @Query("page") int page,
            @Query("pagesize") int pagesize,
            @Query("tagtype") String tagtype,
            @Query("keyword") String keyword
    );
    @GET("getSongInfo.php?cmd=playInfo")
    Call<ResponseBody> downUrl(
            @Query("hash") String hash
    );
}
