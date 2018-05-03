package com.tuacy.network.callback;


import com.tuacy.network.exception.ProtocolsException;

/**
 * 网络请求的callback方法，都是异步请求数据
 */
public interface ProtocolsBaseCallback<T> {

	/**
	 * 开始网络请求
	 *
	 * @param tag 网络请求tag
	 */
	void onProtocolStart(Object tag);

	/**
	 * 网络请求成功
	 *
	 * @param tag  网络请求tag
	 * @param bean 网络请求返回数据
	 */
	void onProtocolSuccess(Object tag, T bean);

	/**
	 * 网络请求异常
	 *
	 * @param tag       网络请求tag
	 * @param exception 网络请求异常
	 */
	void onProtocolError(Object tag, ProtocolsException exception);

}
