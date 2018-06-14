package com.evil.mp3down;

import com.google.gson.Gson;


public class GsonUtils {
    /**
     * 把json解析成T类型
     *
     * @param json 哟啊解析的json
     *
     * @return 返回结果
     */
    public static <T> T get(String json, Class<T> clazz) {
        try {
            Gson gson = new Gson();
            return (T) gson.fromJson(json, clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T get(String json, T t) {
        try {
            Gson gson = new Gson();
            return (T) gson.fromJson(json, t.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> String toJson(T t) {
        Gson   gson = new Gson();
        String json = gson.toJson(t);
        return json;
    }
}

