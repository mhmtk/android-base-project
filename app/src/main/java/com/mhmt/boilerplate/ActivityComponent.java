package com.mhmt.boilerplate;

import com.mhmt.boilerplate.base.BaseActivity;
import com.mhmt.boilerplate.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@PerActivity
@Singleton
@Component(modules = { JobModule.class, EventModule.class })
public interface ActivityComponent {

  void inject(BaseActivity activity);

  void inject(MainActivity activity);

}