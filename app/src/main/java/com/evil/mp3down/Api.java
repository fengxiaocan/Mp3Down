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

    @GET("song?showtype=14&highlight=em&tag_aggr=1&plat=0&sver=5&correct=1&api_ver=1&page=1&area_code=1&with_res_tag=1")
    Call<ResponseBody> search(
            @Query("version") int version,
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
