package com.tuacy.mvpapp.mvp.view;

import com.tuacy.protocols.bean.response.AirNowResponse;
import com.tuacy.protocols.bean.response.LifeStyleResponse;

import java.util.List;

public interface LifeStyleAndAirNowView extends IBaseView {

	void getLifeStyleAndAirNowViewStart();

	void getLifeStyleAndAirNowViewSuccess(List<LifeStyleResponse.HeWeather6Bean.LifestyleItem> lifestyleItemList,
										  List<AirNowResponse.HeWeather6Bean.AirNowItem> airNowItemList);

	void getLifeStyleAndAirNowViewError();
}
