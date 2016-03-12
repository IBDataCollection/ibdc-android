package com.aphoh.ibdatacollector.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.aphoh.ibdatacollector.App;
import com.aphoh.ibdatacollector.injection.component.ActivityComponent;
import com.aphoh.ibdatacollector.injection.component.DaggerActivityComponent;
import com.aphoh.ibdatacollector.injection.module.ActivityModule;

public class BaseActivity extends AppCompatActivity {

  private ActivityComponent mActivityComponent;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  public ActivityComponent getActivityComponent() {
    if (mActivityComponent == null) {
      mActivityComponent = DaggerActivityComponent.builder()
          .activityModule(new ActivityModule(this))
          .applicationComponent(App.get(this).getComponent())
          .build();
    }
    return mActivityComponent;
  }
}
