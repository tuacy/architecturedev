package com.tuacy.mvpapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tuacy.mvpapp.base.MobileBaseActivity;
import com.tuacy.mvpapp.mvp.presenter.CityPresenterImpl;
import com.tuacy.mvpapp.mvp.presenter.LifeStyleAndAirNowPresenterImpl;
import com.tuacy.mvpapp.mvp.presenter.WeatherNowPresenterImpl;
import com.tuacy.mvpapp.mvp.view.CityView;
import com.tuacy.mvpapp.mvp.view.LifeStyleAndAirNowView;
import com.tuacy.mvpapp.mvp.view.WeatherNowView;
import com.tuacy.protocols.bean.response.AirNowResponse;
import com.tuacy.protocols.bean.response.CityResponse;
import com.tuacy.protocols.bean.response.LifeStyleResponse;
import com.tuacy.protocols.bean.response.WeatherNowResponse;

import java.util.List;

public class MainActivity extends MobileBaseActivity implements CityView, WeatherNowView, LifeStyleAndAirNowView {

	private Button                          mButtonCityList;
	private Button                          mButtonWeatherNow;
	private Button                          mButtonLifeStyleAndAirNow;
	private TextView                        mTextResult;
	private WeatherNowPresenterImpl         mWeatherNowPresenter;
	private CityPresenterImpl               mCityListPresenter;
	private LifeStyleAndAirNowPresenterImpl mLifeStyleAndAirNowPresenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mCityListPresenter = new CityPresenterImpl(getApplicationContext());
		mCityListPresenter.attachView(this);
		mWeatherNowPresenter = new WeatherNowPresenterImpl(getApplicationContext());
		mWeatherNowPresenter.attachView(this);
		mLifeStyleAndAirNowPresenter = new LifeStyleAndAirNowPresenterImpl(getApplicationContext());
		mLifeStyleAndAirNowPresenter.attachView(this);
		initView();
		initEvent();
		initData();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		mCityListPresenter.detachView();
	}

	private void initView() {
		mButtonCityList = findViewById(R.id.button_city_list);
		mButtonWeatherNow = findViewById(R.id.button_weather_now);
		mButtonLifeStyleAndAirNow = findViewById(R.id.button_request_together);
		mTextResult = findViewById(R.id.text_result);
	}

	private void initEvent() {
		mButtonCityList.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mCityListPresenter.requestCityList("宜春");
			}
		});

		mButtonWeatherNow.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mWeatherNowPresenter.requestWeatherNow("高安");
			}
		});

		mButtonLifeStyleAndAirNow.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mLifeStyleAndAirNowPresenter.requestLifeStyleAndAirNow("高安");
			}
		});
	}

	private void initData() {

	}

	@Override
	public void getCityListStart() {
		showWaitingDialog();
		mTextResult.setText("开始获取城市列表!!!!!!");
	}

	@Override
	public void getCityListSuccess(List<CityResponse.HeWeather6.CityItem> cityList) {
		dismissWaitingDialog();
		StringBuilder builder = null;
		if (cityList != null && !cityList.isEmpty()) {
			for (CityResponse.HeWeather6.CityItem cityItem : cityList) {
				if (builder == null) {
					builder = new StringBuilder(cityItem.getLocation());
				} else {
					builder.append(",").append(cityItem.getLocation());
				}

			}
		}
		if (builder != null) {
			mTextResult.setText(builder.toString());
		} else {
			mTextResult.setText("没有城市列表!!!!!!");
		}
	}

	@Override
	public void getCityListError() {
		dismissWaitingDialog();
		mTextResult.setText("获取城市列表失败!!!!!!");
	}

	@Override
	public void getWeatherNowInfoStart() {
		showWaitingDialog();
		mTextResult.setText("开始获取实时天气信息!!!!!!");
	}

	@Override
	public void getWeatherNowInfoSuccess(WeatherNowResponse.HeWeather6.WeatherNowInfo weatherNow) {
		dismissWaitingDialog();
		if (weatherNow != null) {
			mTextResult.setText("当前天气情况：" + weatherNow.getCond_txt());
		} else {
			mTextResult.setText("没有实时天气信息!!!!!!");
		}
	}

	@Override
	public void getWeatherNowInfoError() {
		dismissWaitingDialog();
		mTextResult.setText("获取实时天气信息失败!!!!!!");
	}

	@Override
	public void getLifeStyleAndAirNowViewStart() {
		showWaitingDialog();
		mTextResult.setText("开始获取生活指数和空气质量!!!!!!");
	}

	@Override
	public void getLifeStyleAndAirNowViewSuccess(List<LifeStyleResponse.HeWeather6Bean.LifestyleItem> lifestyleItemList,
												 List<AirNowResponse.HeWeather6Bean.AirNowItem> airNowItemList) {
		dismissWaitingDialog();
		StringBuilder builder = null;
		if (lifestyleItemList != null && !lifestyleItemList.isEmpty()) {
			builder = new StringBuilder();
			builder.append(lifestyleItemList.get(0).getTxt()).append("\n");
		}

		if (airNowItemList != null && !airNowItemList.isEmpty()) {
			if (builder == null) {
				builder = new StringBuilder();
			}
			builder.append(airNowItemList.get(0).getQlty());
		}
		if (builder != null) {
			mTextResult.setText(builder.toString());
		} else {
			mTextResult.setText("没有生活指数和空气质量信息!!!!!!");
		}
	}

	@Override
	public void getLifeStyleAndAirNowViewError() {
		dismissWaitingDialog();
		mTextResult.setText("获取生活指数和空气质量失败!!!!!!");
	}
}
