package com.aphoh.ibdatacollector.injection.module;

import android.app.Activity;
import android.content.Context;
import com.aphoh.ibdatacollector.data.DataManager;
import com.aphoh.ibdatacollector.injection.ActivityContext;
import com.aphoh.ibdatacollector.ui.main.MainPresenter;
import dagger.Module;
import dagger.Provides;

@Module public class ActivityModule {

  private Activity mActivity;

  public ActivityModule(Activity activity) {
    mActivity = activity;
  }

  @Provides Activity provideActivity() {
    return mActivity;
  }

  @Provides @ActivityContext Context providesContext() {
    return mActivity;
  }

}
