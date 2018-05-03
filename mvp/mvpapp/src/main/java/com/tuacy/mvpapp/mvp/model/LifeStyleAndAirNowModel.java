package com.tuacy.mvpapp.mvp.model;

import android.content.Context;

import com.tuacy.network.callback.ProtocolsBaseCallback;
import com.tuacy.protocols.bean.LifeStyleAndAirNowBean;

public interface LifeStyleAndAirNowModel {

	void getLifeStyleAndAirNow(Context context,
							   String baseUrl,
							   String key,
							   String location,
							   ProtocolsBaseCallback<LifeStyleAndAirNowBean> callback);
}
