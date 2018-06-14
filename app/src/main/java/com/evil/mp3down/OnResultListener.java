package com.evil.mp3down;

public interface OnResultListener {
    void seccess(String json);
    
    void error(String message);
}
