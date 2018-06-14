package com.evil.mp3down;


import android.os.Handler;
import android.os.Message;
import android.util.Log;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static com.evil.mp3down.Constant.TAG_TYPE;
import static com.evil.mp3down.Constant.VERSION;

public class RetrofigUtils {

    private static OkHttpClient sOkHttpClient;

    static {
        OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
        builder.readTimeout(10,TimeUnit.SECONDS);
        builder.connectTimeout(9,TimeUnit.SECONDS);
        sOkHttpClient = builder.build();
    }

    private static Api search() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.SEARCH_API)
                                                  .client(sOkHttpClient)
                                                  .build();
        return retrofit.create(Api.class);
    }

    public static void search(int page,String keyworld,final OnResultListener listener) {
        search().search(VERSION,page,30,TAG_TYPE,keyworld).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(
                    Call<ResponseBody> call,Response<ResponseBody> response
            )
            {
                try {
                    if (response.isSuccessful()) {

                        listener.seccess(response.body().string());

                    } else {
                        listener.error(response.errorBody().string());

                    }
                } catch (IOException e) {
                    listener.error(e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call,Throwable t) {
                listener.error(t.getMessage());
            }
        });
    }


    private static Api down() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.DOWN_URL)
                                                  .client(sOkHttpClient)
                                                  .build();
        return retrofit.create(Api.class);
    }

    public static void downMp3(final String name,String hash,final Handler handler) {
        down().downUrl(hash).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call,Response<ResponseBody> response) {
                try {
                    String json = response.body().string();
                    json = json.replaceAll("<!--KG_TAG_RES_START-->","");
                    json = json.replaceAll("<!--KG_TAG_RES_END-->","");
                    UrlInfo info = GsonUtils.get(json,UrlInfo.class);
                    if (info != null) {
                        Message obtain = Message.obtain();
                        obtain.what = 3;
                        obtain.obj = info;
                        handler.sendMessage(obtain);
                    }
                } catch (IOException e) {
                    Message obtain = Message.obtain();
                    obtain.what = 0;
                    obtain.obj = "获取下载信息错误!";
                    handler.sendMessage(obtain);
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call,Throwable t) {
                Message obtain = Message.obtain();
                obtain.what = 0;
                obtain.obj = "获取下载信息错误!";
                handler.sendMessage(obtain);
            }
        });
    }
}
