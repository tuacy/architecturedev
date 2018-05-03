package com.tuacy.mvpapp.mvp.presenter;

import com.tuacy.mvpapp.mvp.view.IBaseView;

public interface IPresenter<T extends IBaseView> {

	/**
	 * presenter和对应的view绑定
	 */
	void attachView(T t);

	/**
	 * presenter和对应的view解绑
	 */
	void detachView();

}
