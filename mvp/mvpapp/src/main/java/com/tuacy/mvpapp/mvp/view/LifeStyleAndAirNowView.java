package com.tuacy.mvpapp.mvp.view;

import com.tuacy.protocols.bean.LifeStyleAndAirNowBean;

public interface LifeStyleAndAirNowView extends IBaseView {

	void getLifeStyleAndAirNowViewStart();

	void getLifeStyleAndAirNowViewSuccess(LifeStyleAndAirNowBean response);

	void getLifeStyleAndAirNowViewError();
}
