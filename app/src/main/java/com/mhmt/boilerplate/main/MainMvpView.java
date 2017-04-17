package com.mhmt.boilerplate.main;

import com.mhmt.boilerplate.base.MvpView;

public interface MainMvpView extends MvpView {

  // Methods called by the Presenter that are to be implemented in MainActivity go here

  void changeText(String text);

}
