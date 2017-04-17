package com.mhmt.boilerplate.base;

public interface MvpPresenter<V extends MvpView> {

  void onCreate(V mvpView);

  void onResume();

  void onPause();

  void onDestroy();

}
