package com.pointlook;

import android.app.Application;
import android.util.Log;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

import io.underscope.react.fbak.RNAccountKitPackage;
import co.apptailor.Worker.WorkerPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.github.orhan.openpgp.RNOpenPGPPackage;
import com.transistorsoft.rnbackgroundgeolocation.RNBackgroundGeolocation;
import com.oblador.vectoricons.VectorIconsPackage;
import com.mapbox.reactnativemapboxgl.ReactNativeMapboxGLPackage;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    protected boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
          new ReactNativeMapboxGLPackage(),
          new RNBackgroundGeolocation(),
          new VectorIconsPackage(),
          new RNBackgroundGeolocation(),
          new RNAccountKitPackage(),
          new WorkerPackage(),
          new RNDeviceInfo(),
          new RNOpenPGPPackage()
      );
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
