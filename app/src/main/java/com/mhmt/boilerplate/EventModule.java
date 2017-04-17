package com.mhmt.boilerplate;

import org.greenrobot.eventbus.EventBus;

import dagger.Module;
import dagger.Provides;

@Module
public class EventModule {

  @Provides EventBus eventBus() {
    return EventBus.getDefault();
  }
}
