package com.aphoh.ibdatacollector.injection.component;

import android.app.Application;
import android.content.Context;
import dagger.Component;
import javax.inject.Singleton;
import com.aphoh.ibdatacollector.data.DataManager;
import com.aphoh.ibdatacollector.injection.ApplicationContext;
import com.aphoh.ibdatacollector.injection.module.ApplicationModule;

@Singleton @Component(modules = ApplicationModule.class) public interface ApplicationComponent {

  @ApplicationContext Context context();

  Application application();

  DataManager dataManager();
}
