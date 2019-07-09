package com.evil.mp3down;

import android.os.Environment;

public class Setting {
    private static Setting sSetting;
    private String downPath;
    private boolean isSystemDown = false;

    private Setting() {
        downPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                              .getAbsolutePath();
    }

    public static synchronized Setting getInstance() {
        if (sSetting == null) {
            sSetting = new Setting();
        }
        return sSetting;
    }

    public String getDownPath() {
        return downPath;
    }

    public void setDownPath(String downPath) {
        this.downPath = downPath;
    }

    public boolean isSystemDown() {
        return isSystemDown;
    }

    public void setSystemDown(boolean systemDown) {
        isSystemDown = systemDown;
    }
}
