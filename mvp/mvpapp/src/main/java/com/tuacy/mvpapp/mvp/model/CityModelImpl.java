package com.tuacy.mvpapp.mvp.model;

import android.content.Context;

import com.tuacy.network.ProtocolsClient;
import com.tuacy.network.callback.ProtocolsBaseCallback;
import com.tuacy.protocols.bean.response.CityResponse;
import com.tuacy.protocols.request.CityRequest;

public class CityModelImpl implements CityModel {

	@Override
	public void getCityList(Context context, String baseUrl, String key, String location, ProtocolsBaseCallback<CityResponse> callback) {
		CityRequest request = new CityRequest(baseUrl, key, location);
		ProtocolsClient.getInstance().protocolsRequest(context.getApplicationContext(), request, callback);
	}
}
