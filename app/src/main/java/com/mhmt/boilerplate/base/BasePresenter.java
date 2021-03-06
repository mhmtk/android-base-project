package com.mhmt.boilerplate.base;

public abstract class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

  private V mMvpView;

//  @Inject public EventBus eventBus;

  @Override
  public void onCreate(V mvpView) {
    mMvpView = mvpView;
  }

  @Override
  public void onDestroy() {
//    mCompositeDisposable.dispose();
    mMvpView = null;
  }

  public boolean isViewAttached() {
    return mMvpView != null;
  }

  public V getMvpView() {
    return mMvpView;
  }

  public void checkViewAttached() {
    if (!isViewAttached()) throw new MvpViewNotAttachedException();
  }

  public static class MvpViewNotAttachedException extends RuntimeException {
    public MvpViewNotAttachedException() {
      super("Please call Presenter.onCreate(MvpView) before" +
            " requesting data to the Presenter");
    }
  }
}