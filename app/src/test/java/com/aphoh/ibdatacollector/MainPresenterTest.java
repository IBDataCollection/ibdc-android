package com.aphoh.ibdatacollector;

import com.aphoh.ibdatacollector.data.DataManager;
import com.aphoh.ibdatacollector.ui.main.MainMvpView;
import com.aphoh.ibdatacollector.ui.main.MainPresenter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(MockitoJUnitRunner.class) public class MainPresenterTest {
  @Mock MainMvpView mMockMainMvpView;
  @Mock DataManager mMockDataManager;
  private MainPresenter mMainPresenter;

  @Before public void setUp() throws Exception {
    mMainPresenter = new MainPresenter(mMockDataManager)
  }

  @Test public void testDetachesView() throws Exception {
    mMainPresenter.attachView(mMockMainMvpView);

    assertNotNull(mMainPresenter.getMvpView());

    mMainPresenter.detachView();

    assertNull(mMainPresenter.getMvpView());
  }
}
