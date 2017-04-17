package com.mhmt.boilerplate.main;

import com.mhmt.boilerplate.base.MvpPresenter;

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

  // Methods called by the View that are to be implemented in MainPresenter go here

  void buttonClicked();

}
