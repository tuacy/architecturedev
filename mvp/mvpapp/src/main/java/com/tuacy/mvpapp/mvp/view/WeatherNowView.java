package com.tuacy.mvpapp.mvp.view;

import com.tuacy.protocols.bean.response.WeatherNowResponse;

public interface WeatherNowView extends IBaseView {

	void getWeatherNowInfoStart();

	void getWeatherNowInfoSuccess(WeatherNowResponse.HeWeather6.WeatherNowInfo weatherNow);

	void getWeatherNowInfoError();

}
