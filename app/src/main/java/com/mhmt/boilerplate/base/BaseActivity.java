package com.mhmt.boilerplate.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.mhmt.boilerplate.Injector;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

public class BaseActivity extends AppCompatActivity{

  @Inject EventBus eventBus;

  @Override protected void onCreate(@Nullable final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Injector.getActivityComponent().inject(this);
  }

  @Override protected void onResume() {
    super.onResume();
    eventBus.register(this);
  }

  @Override protected void onPause() {
    super.onPause();
    eventBus.unregister(this);
  }

  public void showProgressDialog() {

  }

  public void dismissProgressDialog() {

  }

  public boolean isConnectedToNetwork() {
    return false;
  }

  public void hideSoftKeyboard() {

  }
}
