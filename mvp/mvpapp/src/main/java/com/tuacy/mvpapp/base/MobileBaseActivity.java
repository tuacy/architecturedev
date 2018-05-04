package com.tuacy.mvpapp.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tuacy.mvpapp.widgets.WaitingDialog;

public abstract class MobileBaseActivity extends AppCompatActivity {

	protected Context  mContext;
	protected Activity mActivity;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mContext = this;
		mActivity = this;
	}

	private WaitingDialog mWaitingDialog;

	private boolean isWaitingDialogShowing() {
		return mWaitingDialog != null && mWaitingDialog.isShowing();
	}

	public void showWaitingDialog() {
		if (!isWaitingDialogShowing()) {
			mWaitingDialog = new WaitingDialog(this);
			mWaitingDialog.setCancelable(false);
			mWaitingDialog.show();
		}
	}

	public void dismissWaitingDialog() {
		if (isWaitingDialogShowing()) {
			mWaitingDialog.dismiss();
		}
	}
}
