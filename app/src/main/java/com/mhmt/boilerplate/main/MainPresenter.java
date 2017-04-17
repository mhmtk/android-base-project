package com.mhmt.boilerplate.main;

import com.mhmt.boilerplate.base.BasePresenter;

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

  @Override public void buttonClicked() {

  }

  @Override public void onCreate(final V mvpView) {
    super.onCreate(mvpView);
  }


  @Override public void onResume() {

  }

  @Override public void onPause() {

  }

  @Override public void onDestroy() {
    super.onDestroy();
  }
}
