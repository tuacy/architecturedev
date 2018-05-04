package com.tuacy.mvpapp.mvp.view;

import com.tuacy.protocols.bean.response.CityResponse;

import java.util.List;

public interface CityView extends IBaseView {

	void getCityListStart();

	void getCityListSuccess(List<CityResponse.HeWeather6.CityItem> cityList);

	void getCityListError();

}
