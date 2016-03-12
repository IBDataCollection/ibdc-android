package com.aphoh.ibdatacollector.ui.main;

import android.os.Bundle;
import javax.inject.Inject;
import com.aphoh.ibdatacollector.ui.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainMvpView {

  @Inject MainPresenter mMainPresenter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getActivityComponent().inject(this);
    mMainPresenter.attachView(this);
  }

  @Override protected void onDestroy() {
    super.onDestroy();

    mMainPresenter.detachView();
  }
}
