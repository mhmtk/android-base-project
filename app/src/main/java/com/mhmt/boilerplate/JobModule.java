package com.mhmt.boilerplate;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

@Module
public class JobModule {

  @Reusable
  @Provides
  Executor executor() {
    return Executors.newCachedThreadPool();
  }

}
