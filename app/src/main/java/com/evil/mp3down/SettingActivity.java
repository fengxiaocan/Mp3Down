package com.evil.mp3down;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;

import com.app.filepicker.FilePicker;

public class SettingActivity extends AppCompatActivity {
    private AppCompatRadioButton mThirdDown;
    private AppCompatRadioButton mSystemDown;
    private TextView mTvDownPath;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        initView();
    }

    private void initView() {
        mThirdDown = findViewById(R.id.third_down);
        mSystemDown = findViewById(R.id.system_down);
        mTvDownPath = findViewById(R.id.tv_down_path);

        mTvDownPath.setText("下载路径为:" + Setting.getInstance().getDownPath());
        mSystemDown.setChecked(Setting.getInstance().isSystemDown());
        mThirdDown.setChecked(!Setting.getInstance().isSystemDown());

        mTvDownPath.setOnClickListener(
                v -> FilePicker.chooseForBrowser().selectDirectory(directory -> {
                    Setting.getInstance().setDownPath(directory);
                    mTvDownPath.setText("下载路径为:" + Setting.getInstance().getDownPath());
                }).start(SettingActivity.this));
        mSystemDown.setOnCheckedChangeListener(
                (buttonView, isChecked) -> Setting.getInstance().setSystemDown(isChecked));
        mThirdDown.setOnCheckedChangeListener(
                (buttonView, isChecked) -> Setting.getInstance().setSystemDown(!isChecked));
    }
}
