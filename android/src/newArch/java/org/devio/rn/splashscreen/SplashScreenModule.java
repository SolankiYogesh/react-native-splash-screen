package org.devio.rn.splashscreen;


import com.facebook.react.bridge.ReactApplicationContext;


public class SplashScreenModule extends NativeSplashScreenSpec{
    private final ReactApplicationContext context;
    public SplashScreenModule(ReactApplicationContext context) {
          super(context);
        this.context = context;
    }

    @Override
    public void hide() {
      SplashScreen.hide(this.context.getCurrentActivity());
    }
    @Override
    public void show() {
        SplashScreen.show(this.context.getCurrentActivity());
    }
}