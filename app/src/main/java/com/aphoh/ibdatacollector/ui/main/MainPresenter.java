package com.aphoh.ibdatacollector.ui.main;

import com.aphoh.ibdatacollector.data.DataManager;
import com.aphoh.ibdatacollector.ui.base.BasePresenter;
import javax.inject.Inject;
import rx.Subscription;

public class MainPresenter extends BasePresenter<MainMvpView> {

  private final DataManager mDataManager;
  private Subscription mSubscription;

  @Inject public MainPresenter(DataManager dataManager) {
    mDataManager = dataManager;
  }

  @Override public void attachView(MainMvpView mvpView) {
    super.attachView(mvpView);
  }

  @Override public void detachView() {
    super.detachView();
    if (mSubscription != null) mSubscription.unsubscribe();
  }
}
