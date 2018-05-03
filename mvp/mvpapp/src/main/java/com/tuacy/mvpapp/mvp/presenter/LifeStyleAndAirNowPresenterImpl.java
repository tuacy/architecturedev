package com.tuacy.mvpapp.mvp.presenter;

import android.content.Context;

import com.tuacy.mvpapp.mvp.model.LifeStyleAndAirNowModel;
import com.tuacy.mvpapp.mvp.model.LifeStyleAndAirNowModelImpl;
import com.tuacy.mvpapp.mvp.view.LifeStyleAndAirNowView;
import com.tuacy.network.callback.ProtocolsBaseCallback;
import com.tuacy.network.exception.ProtocolsException;
import com.tuacy.protocols.bean.LifeStyleAndAirNowBean;

public class LifeStyleAndAirNowPresenterImpl extends BasePresenter<LifeStyleAndAirNowView> implements LifeStyleAndAirNowPresenter {

	private Context                 mContext;
	private LifeStyleAndAirNowModel mModel;

	public LifeStyleAndAirNowPresenterImpl(Context context) {
		mContext = context.getApplicationContext();
		mModel = new LifeStyleAndAirNowModelImpl();
	}

	@Override
	public void requestLifeStyleAndAirNow(String location) {
		mModel.getLifeStyleAndAirNow(mContext, "https://free-api.heweather.com/s6/", "ab91959227504934a70f45d912460ea8", location,
									 new ProtocolsBaseCallback<LifeStyleAndAirNowBean>() {
										 @Override
										 public void onProtocolStart(Object tag) {
											 if (isAttachView()) {
												 getView().getLifeStyleAndAirNowViewStart();
											 }
										 }

										 @Override
										 public void onProtocolSuccess(Object tag, LifeStyleAndAirNowBean bean) {
											 if (isAttachView()) {
												 getView().getLifeStyleAndAirNowViewSuccess(bean);
											 }
										 }

										 @Override
										 public void onProtocolError(Object tag, ProtocolsException exception) {
											 if (isAttachView()) {
												 getView().getLifeStyleAndAirNowViewError();
											 }
										 }
									 });
	}
}
