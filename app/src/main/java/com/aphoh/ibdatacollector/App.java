package com.aphoh.ibdatacollector;

import android.app.Application;
import android.content.Context;
import android.support.annotation.VisibleForTesting;
import com.aphoh.ibdatacollector.injection.component.ApplicationComponent;
import com.aphoh.ibdatacollector.injection.component.DaggerApplicationComponent;
import com.aphoh.ibdatacollector.injection.module.ApplicationModule;
import timber.log.Timber;

public class App extends Application {

  ApplicationComponent mApplicationComponent;

  public static App get(Context context) {
    return (App) context.getApplicationContext();
  }

  @Override public void onCreate() {
    super.onCreate();

    if (BuildConfig.DEBUG) {
      Timber.plant(new Timber.DebugTree());
    }
  }

  public ApplicationComponent getComponent() {
    if (mApplicationComponent == null) {
      mApplicationComponent = DaggerApplicationComponent.builder()
          .applicationModule(new ApplicationModule(this))
          .build();
    }
    return mApplicationComponent;
  }

  // Needed to replace the component with a test specific one
  @VisibleForTesting public void setComponent(ApplicationComponent applicationComponent) {
    mApplicationComponent = applicationComponent;
  }
}
