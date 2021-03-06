package com.tuacy.protocols.request;

import android.support.annotation.NonNull;

import com.tuacy.network.base.ProtocolsBaseRequest;
import com.tuacy.protocols.ProtocolsApi;
import com.tuacy.protocols.bean.response.CityResponse;

import retrofit2.Retrofit;
import rx.Observable;

public class CityRequest extends ProtocolsBaseRequest<CityResponse> {

	private String mKey;
	private String mLocation;

	public CityRequest(@NonNull String baseUrl, String key, String location) {
		super(baseUrl);
		mKey = key;
		mLocation = location;
	}

	@Override
	public Observable<CityResponse> getObservable(Retrofit retrofit) {
		return retrofit.create(ProtocolsApi.class).getCityList(mKey, mLocation);
	}
}
