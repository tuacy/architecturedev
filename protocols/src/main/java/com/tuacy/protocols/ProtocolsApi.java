package com.tuacy.protocols;

import com.tuacy.protocols.bean.response.AirNowResponse;
import com.tuacy.protocols.bean.response.CityResponse;
import com.tuacy.protocols.bean.response.LifeStyleResponse;
import com.tuacy.protocols.bean.response.WeatherNowResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ProtocolsApi {

	/**
	 * 获取城市列表
	 */
	@GET("find")
	Observable<CityResponse> getCityList(@Query("key") String key, @Query("location") String location);

	/**
	 * 实况天气
	 */
	@GET("weather/now")
	Observable<WeatherNowResponse> getWeatherNow(@Query("key") String key, @Query("location") String location);

	/**
	 * 生活指数
	 */
	@GET("weather/lifestyle")
	Observable<LifeStyleResponse> getLifeStyle(@Query("key") String key, @Query("location") String location);

	/**
	 * 空气质量实况
	 */
	@GET("air/now")
	Observable<AirNowResponse> getAirNow(@Query("key") String key, @Query("location") String location);

}
