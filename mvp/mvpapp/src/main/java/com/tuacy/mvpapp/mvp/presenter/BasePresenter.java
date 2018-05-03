package com.tuacy.mvpapp.mvp.presenter;

import com.tuacy.mvpapp.mvp.view.IBaseView;

public class BasePresenter<V extends IBaseView> implements IPresenter<V> {

	private V mView;

	@Override
	public void attachView(V v) {
		mView = v;
	}

	@Override
	public void detachView(V v) {
		mView = null;
	}

	public boolean isAttachView() {
		return mView != null;
	}

	public V getView() {
		return mView;
	}

	/**
	 * 判断presenter和view是否已经建立了连接
	 */
	public void checkViewAttach() {
		if (!isAttachView()) {
			throw new NotAttachedException();
		}
	}

	/**
	 * 自定义异常
	 */
	static class NotAttachedException extends RuntimeException {

		NotAttachedException() {
			super("请求数据前请先调用attachView()方法与View建立连接");
		}
	}
}
