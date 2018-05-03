package com.tuacy.network;

import android.content.Context;


import com.tuacy.network.callback.ProtocolsBaseCallback;
import com.tuacy.network.exception.ProtocolsError;
import com.tuacy.network.exception.ProtocolsException;

import rx.Subscriber;

public final class ProtocolsSubscriber<T> extends Subscriber<T> {

	private Context                  mContext;
	private Object                   mTag;
	private ProtocolsBaseCallback<T> mCallback;

	public ProtocolsSubscriber(Context context, ProtocolsBaseCallback<T> callback) {
		this(context, null, callback);
	}

	public ProtocolsSubscriber(Context context, Object tag, ProtocolsBaseCallback<T> callback) {
		mContext = context;
		mTag = tag;
		mCallback = callback;
	}

	@Override
	public void onStart() {
		super.onStart();
		if (mCallback != null) {
			mCallback.onProtocolStart(mTag);
		}
	}

	@Override
	public void onCompleted() {
		//do noting
	}

	@Override
	public void onError(Throwable e) {
		if (mCallback != null) {
			if (e instanceof ProtocolsException) {
				mCallback.onProtocolError(mTag, (ProtocolsException) e);
			} else {
				mCallback.onProtocolError(mTag, new ProtocolsException(e, ProtocolsError.ERROR_UNKNOWN));
			}
		}
	}

	@Override
	public void onNext(T t) {
		if (mCallback != null) {
			mCallback.onProtocolSuccess(mTag, t);
		}
	}
}
