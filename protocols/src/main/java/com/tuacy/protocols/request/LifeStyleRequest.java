package com.tuacy.protocols.request;

import android.support.annotation.NonNull;

import com.tuacy.network.base.ProtocolsBaseRequest;
import com.tuacy.protocols.ProtocolsApi;
import com.tuacy.protocols.bean.response.LifeStyleResponse;

import retrofit2.Retrofit;
import rx.Observable;

public class LifeStyleRequest extends ProtocolsBaseRequest<LifeStyleResponse> {

	private String mKey;
	private String mLocation;

	public LifeStyleRequest(@NonNull String baseUrl, String key, String location) {
		super(baseUrl);
		mKey = key;
		mLocation = location;
	}

	@Override
	public Observable<LifeStyleResponse> getObservable(Retrofit retrofit) {
		return retrofit.create(ProtocolsApi.class).getLifeStyle(mKey, mLocation);
	}
}
