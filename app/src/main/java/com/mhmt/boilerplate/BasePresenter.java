package com.mhmt.boilerplate;

public abstract class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

  private V mMvpView;

  public EventBus eventBus;

  @Inject
  public BasePresenter(final EventBus eventBus) {
    this.eventBus = eventBus;
  }

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