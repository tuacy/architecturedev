package com.tuacy.mvpapp.mvp.presenter;

import android.content.Context;

import com.tuacy.mvpapp.mvp.model.WeatherNowModel;
import com.tuacy.mvpapp.mvp.model.WeatherNowModelImpl;
import com.tuacy.mvpapp.mvp.view.WeatherNowView;
import com.tuacy.network.callback.ProtocolsBaseCallback;
import com.tuacy.network.exception.ProtocolsException;
import com.tuacy.protocols.bean.response.WeatherNowResponse;

public class WeatherNowPresenterImpl extends BasePresenter<WeatherNowView> implements WeatherNowPresenter {


	private Context         mContext;
	private WeatherNowModel mModel;

	public WeatherNowPresenterImpl(Context context) {
		mContext = context.getApplicationContext();
		mModel = new WeatherNowModelImpl();
	}


	@Override
	public void requestWeatherNow(String location) {
		mModel.getWeatherNow(mContext, "https://free-api.heweather.com/s6/", "ab91959227504934a70f45d912460ea8", location,
							 new ProtocolsBaseCallback<WeatherNowResponse>() {
								 @Override
								 public void onProtocolStart(Object tag) {
									 if (isAttachView()) {
										 getView().getWeatherNowInfoStart();
									 }
								 }

								 @Override
								 public void onProtocolSuccess(Object tag, WeatherNowResponse bean) {
									 if (isAttachView()) {
										 if (bean != null && bean.getHeWeather6() != null && !bean.getHeWeather6().isEmpty()) {
											 getView().getWeatherNowInfoSuccess(bean.getHeWeather6().get(0).getNow());
										 } else {
											 getView().getWeatherNowInfoSuccess(null);
										 }
									 }
								 }

								 @Override
								 public void onProtocolError(Object tag, ProtocolsException exception) {
									 if (isAttachView()) {
										 getView().getWeatherNowInfoError();
									 }
								 }
							 });
	}

}
