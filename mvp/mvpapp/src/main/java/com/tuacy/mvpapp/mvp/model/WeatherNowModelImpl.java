package com.tuacy.mvpapp.mvp.model;

import android.content.Context;

import com.tuacy.network.ProtocolsClient;
import com.tuacy.network.callback.ProtocolsBaseCallback;
import com.tuacy.protocols.bean.response.WeatherNowResponse;
import com.tuacy.protocols.request.WeatherNowRequest;

public class WeatherNowModelImpl implements WeatherNowModel {


	@Override
	public void getWeatherNow(Context context,
							  String baseUrl,
							  String key,
							  String location,
							  ProtocolsBaseCallback<WeatherNowResponse> callback) {
		WeatherNowRequest request = new WeatherNowRequest(baseUrl, key, location);
		ProtocolsClient.getInstance().protocolsRequest(context.getApplicationContext(), request, callback);
	}
}
