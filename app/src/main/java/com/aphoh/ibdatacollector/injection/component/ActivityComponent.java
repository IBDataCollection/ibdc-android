package com.aphoh.ibdatacollector.injection.component;

import dagger.Component;
import com.aphoh.ibdatacollector.injection.PerActivity;
import com.aphoh.ibdatacollector.injection.module.ActivityModule;
import com.aphoh.ibdatacollector.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity @Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

  void inject(MainActivity mainActivity);
}
