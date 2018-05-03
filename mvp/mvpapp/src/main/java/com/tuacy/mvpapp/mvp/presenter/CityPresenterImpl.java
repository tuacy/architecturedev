package com.tuacy.mvpapp.mvp.presenter;

import android.content.Context;

import com.tuacy.mvpapp.mvp.model.CityModelImpl;
import com.tuacy.mvpapp.mvp.model.CityModel;
import com.tuacy.mvpapp.mvp.view.CityView;
import com.tuacy.network.callback.ProtocolsBaseCallback;
import com.tuacy.network.exception.ProtocolsException;
import com.tuacy.protocols.bean.response.CityResponse;

public class CityPresenterImpl extends BasePresenter<CityView> implements CityPresenter {

	private Context   mContext;
	private CityModel mModel;

	public CityPresenterImpl(Context context) {
		mContext = context.getApplicationContext();
		mModel = new CityModelImpl();
	}

	@Override
	public void requestCityList(String location) {
		mModel.getCityList(mContext, "https://search.heweather.com/", "ab91959227504934a70f45d912460ea8", location,
						   new ProtocolsBaseCallback<CityResponse>() {
							   @Override
							   public void onProtocolStart(Object tag) {
								   if (isAttachView()) {
									   getView().getCityListStart();
								   }
							   }

							   @Override
							   public void onProtocolSuccess(Object tag, CityResponse bean) {
								   if (isAttachView()) {
									   getView().getCityListSuccess(bean);
								   }
							   }

							   @Override
							   public void onProtocolError(Object tag, ProtocolsException exception) {
								   if (isAttachView()) {
									   getView().getCityListError();
								   }
							   }
						   });
	}
}
