package com.tuacy.mvpapp.mvp.model;

import android.content.Context;

import com.tuacy.network.callback.ProtocolsBaseCallback;
import com.tuacy.protocols.bean.response.WeatherNowResponse;

/**
 * 获取实时天气信息
 */
public interface WeatherNowModel {

	void getWeatherNow(Context context, String baseUrl, String key, String location, ProtocolsBaseCallback<WeatherNowResponse> callback);

}
