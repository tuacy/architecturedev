package com.tuacy.mvpapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.tuacy.mvpapp.mvp.presenter.CityPresenterImpl;
import com.tuacy.mvpapp.mvp.presenter.LifeStyleAndAirNowPresenterImpl;
import com.tuacy.mvpapp.mvp.presenter.WeatherNowPresenterImpl;
import com.tuacy.mvpapp.mvp.view.CityView;
import com.tuacy.mvpapp.mvp.view.LifeStyleAndAirNowView;
import com.tuacy.mvpapp.mvp.view.WeatherNowView;
import com.tuacy.protocols.bean.LifeStyleAndAirNowBean;
import com.tuacy.protocols.bean.response.CityResponse;

public class MainActivity extends AppCompatActivity implements CityView, WeatherNowView, LifeStyleAndAirNowView {

	private Button                          mButtonCityList;
	private Button                          mButtonWeatherNow;
	private Button                          mButtonLifeStyleAndAirNow;
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
		Log.d("tuacy", "request start");
	}

	@Override
	public void getCityListSuccess(CityResponse response) {
		Log.d("tuacy", "request success");
	}

	@Override
	public void getCityListError() {
		Log.d("tuacy", "request error");
	}

	@Override
	public void getWeatherNowInfoStart() {
		Log.d("tuacy", "request weather now start");
	}

	@Override
	public void getWeatherNowInfoSuccess() {
		Log.d("tuacy", "request weather now success");
	}

	@Override
	public void getWeatherNowInfoError() {
		Log.d("tuacy", "request weather now error");
	}

	@Override
	public void getLifeStyleAndAirNowViewStart() {
		Log.d("tuacy", "request life style and air now start");
	}

	@Override
	public void getLifeStyleAndAirNowViewSuccess(LifeStyleAndAirNowBean response) {
		Log.d("tuacy", "request life style and air now success");
	}

	@Override
	public void getLifeStyleAndAirNowViewError() {
		Log.d("tuacy", "request life style and air now error");
	}
}
