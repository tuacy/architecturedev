package com.tuacy.protocols.request;

import android.support.annotation.NonNull;

import com.tuacy.network.base.ProtocolsBaseRequest;
import com.tuacy.protocols.ProtocolsApi;
import com.tuacy.protocols.bean.response.AirNowResponse;

import retrofit2.Retrofit;
import rx.Observable;

public class AirNowRequest extends ProtocolsBaseRequest<AirNowResponse> {

	private String mKey;
	private String mLocation;

	public AirNowRequest(@NonNull String baseUrl, String key, String location) {
		super(baseUrl);
		mKey = key;
		mLocation = location;
	}

	@Override
	public Observable<AirNowResponse> getObservable(Retrofit retrofit) {
		return retrofit.create(ProtocolsApi.class).getAirNow(mKey, mLocation);
	}
}
