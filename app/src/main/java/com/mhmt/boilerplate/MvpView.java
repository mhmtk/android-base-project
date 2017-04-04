package com.mhmt.boilerplate;

public interface MvpView {

  void showProgressDialog();

  void dismissProgressDialog();

  boolean isConnectedToNetwork();

  void hideSoftKeyboard();

}
