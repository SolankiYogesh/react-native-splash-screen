package org.devio.rn.splashscreen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = ImageCropPicker.NAME)
public class SplashScreenModule extends ReactContextBaseJavaModule{

    @NonNull
    @Override
    public String getName() {
        return "SplashScreen";
    }


     /**
     * 打开启动屏
     */
    @ReactMethod
    public void show() {
        SplashScreen.show(getCurrentActivity());
    }

    /**
     * 关闭启动屏
     */
    @ReactMethod
    public void hide() {
        SplashScreen.hide(getCurrentActivity());
    }
}