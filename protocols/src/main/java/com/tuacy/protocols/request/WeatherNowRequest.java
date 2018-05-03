package com.tuacy.protocols.request;

import android.support.annotation.NonNull;

import com.tuacy.network.base.ProtocolsBaseRequest;
import com.tuacy.protocols.ProtocolsApi;
import com.tuacy.protocols.bean.response.WeatherNowResponse;

import retrofit2.Retrofit;
import rx.Observable;

public class WeatherNowRequest extends ProtocolsBaseRequest<WeatherNowResponse> {

	private String mKey;
	private String mLocation;

	public WeatherNowRequest(@NonNull String baseUrl, String key, String location) {
		super(baseUrl);
		mKey = key;
		mLocation = location;
	}

	@Override
	public Observable<WeatherNowResponse> getObservable(Retrofit retrofit) {
		return retrofit.create(ProtocolsApi.class).getWeatherNow(mKey, mLocation);
	}
}
