package com.mhmt.boilerplate.base;

public interface MvpView {

  void showProgressDialog();

  void dismissProgressDialog();

  boolean isConnectedToNetwork();

  void hideSoftKeyboard();

}
