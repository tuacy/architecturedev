package com.tuacy.protocols.func;

import com.tuacy.network.functions.ProtocolsZipFunc;
import com.tuacy.protocols.bean.LifeStyleAndAirNowBean;
import com.tuacy.protocols.bean.response.AirNowResponse;
import com.tuacy.protocols.bean.response.LifeStyleResponse;

public class LifeStyleAndAirNowFunc implements ProtocolsZipFunc<LifeStyleResponse, AirNowResponse, LifeStyleAndAirNowBean> {

	@Override
	public LifeStyleAndAirNowBean call(LifeStyleResponse lifeStyleResponse, AirNowResponse airNowResponse) {
		return new LifeStyleAndAirNowBean(lifeStyleResponse, airNowResponse);
	}
}
