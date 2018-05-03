package com.tuacy.mvpapp.mvp.presenter;

import com.tuacy.mvpapp.mvp.view.IBaseView;

import java.lang.ref.WeakReference;

public class BasePresenter<V extends IBaseView> implements IPresenter<V> {

	private WeakReference<V> mViewRef;

	@Override
	public void attachView(V v) {
		mViewRef = new WeakReference<>(v);
	}

	@Override
	public void detachView() {
		if (mViewRef != null) {
			mViewRef.clear();
			mViewRef = null;
		}
	}

	protected boolean isAttachView() {
		return mViewRef != null && mViewRef.get() != null;
	}

	public V getView() {
		return mViewRef.get();
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
