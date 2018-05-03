package com.tuacy.mvpapp.mvp.model;

import android.content.Context;

import com.tuacy.network.ProtocolsClient;
import com.tuacy.network.callback.ProtocolsBaseCallback;
import com.tuacy.protocols.bean.LifeStyleAndAirNowBean;
import com.tuacy.protocols.func.LifeStyleAndAirNowFunc;
import com.tuacy.protocols.request.AirNowRequest;
import com.tuacy.protocols.request.LifeStyleRequest;

public class LifeStyleAndAirNowModelImpl implements LifeStyleAndAirNowModel {

	@Override
	public void getLifeStyleAndAirNow(Context context,
									  String baseUrl,
									  String key,
									  String location,
									  ProtocolsBaseCallback<LifeStyleAndAirNowBean> callback) {
		LifeStyleRequest lifeStyleRequest = new LifeStyleRequest(baseUrl, key, location);
		AirNowRequest airNowRequest = new AirNowRequest(baseUrl, key, location);
		ProtocolsClient.getInstance()
					   .protocolsRequestZipWith(context.getApplicationContext(), lifeStyleRequest, airNowRequest,
												new LifeStyleAndAirNowFunc(), callback);
	}
}
