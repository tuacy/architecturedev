package com.tuacy.mvpapp.mvp.model;

import android.content.Context;

import com.tuacy.network.callback.ProtocolsBaseCallback;
import com.tuacy.protocols.bean.response.CityResponse;

/**
 * 获取城市列表
 */
public interface CityModel {

	void getCityList(Context context, String baseUrl, String key, String location, ProtocolsBaseCallback<CityResponse> callback);

}
