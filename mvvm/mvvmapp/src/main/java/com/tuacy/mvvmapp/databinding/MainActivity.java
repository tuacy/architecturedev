package com.tuacy.mvvmapp.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tuacy.mvvmapp.R;

public class MainActivity extends AppCompatActivity {

	private ActivityMainBinding mBinding;
	private UserEntity          mUserInfo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
		mBinding.setUser(mUserInfo = new UserEntity());
		initView();
		initEvent();
		initData();
	}

	private void initView() {

	}

	private void initEvent() {

	}

	private void initData() {
		mUserInfo.setFirstName("wu1111");
		mUserInfo.setLastName("yunxing1111");
	}
}
