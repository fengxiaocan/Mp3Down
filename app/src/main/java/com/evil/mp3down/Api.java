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
    String SEARCH_HASH_API = "http://media.store.kugou.com/v1/get_res_privilege/";
    String DOWN_URL = "http://m.kugou.com/app/i/";
    String d = "http://trackercdngz.kugou.com/i/" +
               "v2/?album_audio_id=101834667" +
               "&behavior=play" +
               "&module=" +
               "&cmd=26" +
               "&token=" +
               "&album_id=7547427" +
               "&hash=a2f12fe24d38e7a7fe60e2fb842c8e44" +
               "&userid=0" +
               "&pid=2" +
               "&vipType=65530" +
               "&version=8983" +
               "&area_code=1" +
               "&appid=1005" +
               "&mid=247127305044548635664623374101427795794" +
               "&key=61470838e8f8d2b907e0d5f360bacb5b" +
               "&pidversion=3001" +
               "&with_res_tag=1";

    @GET("song?showtype=14&highlight=em&tag_aggr=1&plat=0&sver=5&correct=1&api_ver=1&page=1&area_code=1&with_res_tag=1")
    Call<ResponseBody> search(
            @Query("version") int version,
            @Query("page") int page,
            @Query("pagesize") int pagesize,
            @Query("tagtype") String tagtype,
            @Query("keyword") String keyword
    );

    @POST(".")
    Call<ResponseBody> searchHase(
            @Header("User-Agent") String User_Agent,
            @Header("Content-Type") String Content_Type,
            @Header("Host") String Host,
            @Body SearchHash searchHash
    );

    @GET("getSongInfo.php?cmd=playInfo")
    Call<ResponseBody> downUrl(
            @Query("hash") String hash
    );
    //真正的搜索地址
    String searchApi = "http://m.kugou.com/app/i/getSongInfo.php?hash=2b616f6ab9f8655210fd823b900085cc&cmd=playInfo";
}
