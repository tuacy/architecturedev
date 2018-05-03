package com.tuacy.protocols.bean;

import com.tuacy.protocols.bean.response.AirNowResponse;
import com.tuacy.protocols.bean.response.LifeStyleResponse;

public class LifeStyleAndAirNowBean {

	private LifeStyleResponse mLifeStyleResponse;
	private AirNowResponse    mAirNowResponse;

	public LifeStyleAndAirNowBean(LifeStyleResponse lifeStyleResponse, AirNowResponse airNowResponse) {
		mLifeStyleResponse = lifeStyleResponse;
		mAirNowResponse = airNowResponse;
	}

	public LifeStyleResponse getLifeStyleResponse() {
		return mLifeStyleResponse;
	}

	public void setLifeStyleResponse(LifeStyleResponse lifeStyleResponse) {
		mLifeStyleResponse = lifeStyleResponse;
	}

	public AirNowResponse getAirNowResponse() {
		return mAirNowResponse;
	}

	public void setAirNowResponse(AirNowResponse airNowResponse) {
		mAirNowResponse = airNowResponse;
	}
}
