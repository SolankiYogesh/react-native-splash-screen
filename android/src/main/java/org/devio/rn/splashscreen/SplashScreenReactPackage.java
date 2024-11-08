package org.devio.rn.splashscreen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.HashMap;
import java.util.Map;

/**
 * SplashScreen
 * 启动屏
 * from：http://www.devio.org
 * Author:CrazyCodeBoy
 * GitHub:https://github.com/crazycodeboy
 * Email:crazycodeboy@gmail.com
 */
public class SplashScreenReactPackage extends TurboReactPackage {
    @Nullable
    @Override
    public NativeModule getModule(@NonNull String name, @NonNull ReactApplicationContext reactContext) {
        if (name.equals(SplashScreen.NAME)) {
            return new SplashScreenModule(reactContext);
        } else {
            return null;
        }
    }

    @Override
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return ()->{
            final Map<String, ReactModuleInfo> moduleInfos = new HashMap<>();
            boolean isTurboModule = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED;
            moduleInfos.put(
                    SplashScreen.NAME,
                    new ReactModuleInfo(
                            SplashScreen.NAME,
                            SplashScreen.NAME,
                            false,
                            false,
                            false,
                            isTurboModule
                    ));
            return moduleInfos;
        };
    }

    // Deprecated RN 0.47
//    public List<Class<? extends JavaScriptModule>> createJSModules() {
//        return Collections.emptyList();
//    }
//
//    @Override
//    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
//        return Collections.emptyList();
//    }
//
//    @Override
//    public List<NativeModule> createNativeModules(
//            ReactApplicationContext reactContext) {
//        List<NativeModule> modules = new ArrayList<>();
//        modules.add(new SplashScreenModule(reactContext));
//        return modules;
//    }
}
