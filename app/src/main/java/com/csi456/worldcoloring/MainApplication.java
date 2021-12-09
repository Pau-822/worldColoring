package com.csi456.worldcoloring;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.camera.core.CameraXConfig;
import androidx.camera.camera2.Camera2Config;

public class MainApplication extends Application implements CameraXConfig.Provider{
    @NonNull
    @Override
    public CameraXConfig getCameraXConfig() {
        return Camera2Config.defaultConfig();
    }
}
