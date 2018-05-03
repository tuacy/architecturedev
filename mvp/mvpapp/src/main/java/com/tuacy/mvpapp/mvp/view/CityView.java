package com.tuacy.mvpapp.mvp.view;

import com.tuacy.protocols.bean.response.CityResponse;

public interface CityView extends IBaseView {

	void getCityListStart();

	void getCityListSuccess(CityResponse response);

	void getCityListError();

}
