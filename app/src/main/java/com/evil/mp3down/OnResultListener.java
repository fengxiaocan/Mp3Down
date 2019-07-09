package com.evil.mp3down;

public interface OnResultListener {
    void seccess(boolean isRefresh ,String json);
    
    void error(String message);
}
