package com.mhmt.boilerplate;

public final class Injector {

  private static ActivityComponent activityComponent;

  public static ActivityComponent getActivityComponent() {
    if (activityComponent == null) {
      activityComponent = DaggerActivityComponent.create();
    }
    return activityComponent;
  }
}
