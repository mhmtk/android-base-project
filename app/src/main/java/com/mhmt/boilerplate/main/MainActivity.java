package com.mhmt.boilerplate.main;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.mhmt.boilerplate.Injector;
import com.mhmt.boilerplate.R;
import com.mhmt.boilerplate.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainMvpView {

  @Inject protected MainPresenter<MainMvpView> presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    Injector.getActivityComponent().inject(this);

    presenter.onCreate(this);
  }

  @Override protected void onResume() {
    super.onResume();
    presenter.onResume();
  }

  @Override protected void onPause() {
    super.onPause();
    presenter.onPause();
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    presenter.onDestroy();
  }

  @Override public void changeText(final String text) {

  }


}
