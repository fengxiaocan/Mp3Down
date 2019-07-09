package com.evil.mp3down.interceptor;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonFormat {
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static String formatJson(String msg) {
        String message;
        try {
            if (msg.startsWith("{")) {
                JSONObject jsonObject = new JSONObject(msg);
                message = jsonObject.toString(4);//最重要的方法，就一行，返回格式化的json字符串，其中的数字4是缩进字符数
            } else if (msg.startsWith("[")) {
                JSONArray jsonArray = new JSONArray(msg);
                message = jsonArray.toString(4);
            } else {
                message = msg;
            }
        } catch (JSONException e) {
            message = msg;
        }

        return LINE_SEPARATOR + message;
    }

    public static void v(String TAG, String message) {
        String json = formatJson(message);
        String[] lines = json.split(LINE_SEPARATOR);
        for (String line : lines) {
            Log.v(TAG, line);
        }
    }

    public static void i(String TAG, String message) {
        String json = formatJson(message);
        String[] lines = json.split(LINE_SEPARATOR);
        for (String line : lines) {
            Log.i(TAG, line);
        }
    }

    public static void d(String TAG, String message) {
        String json = formatJson(message);
        String[] lines = json.split(LINE_SEPARATOR);
        for (String line : lines) {
            Log.d(TAG, line);
        }
    }

    public static void w(String TAG, String message) {
        String json = formatJson(message);
        String[] lines = json.split(LINE_SEPARATOR);
        for (String line : lines) {
            Log.w(TAG, line);
        }
    }

    public static void e(String TAG, String message) {
        String json = formatJson(message);
        String[] lines = json.split(LINE_SEPARATOR);
        for (String line : lines) {
            Log.e(TAG, line);
        }
    }
}
