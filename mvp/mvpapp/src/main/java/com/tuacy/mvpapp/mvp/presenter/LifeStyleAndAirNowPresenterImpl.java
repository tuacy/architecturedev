package com.tuacy.mvpapp.mvp.presenter;

import android.content.Context;

import com.tuacy.mvpapp.mvp.model.LifeStyleAndAirNowModel;
import com.tuacy.mvpapp.mvp.model.LifeStyleAndAirNowModelImpl;
import com.tuacy.mvpapp.mvp.view.LifeStyleAndAirNowView;
import com.tuacy.network.callback.ProtocolsBaseCallback;
import com.tuacy.network.exception.ProtocolsException;
import com.tuacy.protocols.bean.LifeStyleAndAirNowBean;
import com.tuacy.protocols.bean.response.AirNowResponse;
import com.tuacy.protocols.bean.response.LifeStyleResponse;

import java.util.List;

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
												 List<LifeStyleResponse.HeWeather6Bean.LifestyleItem> lifestyleItemList = null;
												 List<AirNowResponse.HeWeather6Bean.AirNowItem> airNowItemList = null;
												 if (bean != null && bean.getLifeStyleResponse() != null &&
													 bean.getLifeStyleResponse().getHeWeather6() != null &&
													 !bean.getLifeStyleResponse().getHeWeather6().isEmpty()) {
													 lifestyleItemList = bean.getLifeStyleResponse().getHeWeather6().get(0).getLifestyle();
												 }
												 if (bean != null && bean.getAirNowResponse() != null &&
													 bean.getAirNowResponse().getHeWeather6() != null &&
													 !bean.getAirNowResponse().getHeWeather6().isEmpty()) {
													 airNowItemList = bean.getAirNowResponse().getHeWeather6().get(0).getAir_now_station();
												 }
												 getView().getLifeStyleAndAirNowViewSuccess(lifestyleItemList, airNowItemList);
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
