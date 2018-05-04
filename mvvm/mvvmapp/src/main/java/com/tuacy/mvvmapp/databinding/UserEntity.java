package com.tuacy.mvvmapp.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.tuacy.mvvmapp.BR;

public class UserEntity extends BaseObservable {

	private String firstName;
	private String lastName;

	public UserEntity() {

	}

	public UserEntity(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Bindable
	public String getFirstName() {
		return firstName;
	}

	@Bindable
	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		notifyPropertyChanged(BR.firstName);
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		notifyPropertyChanged(BR.lastName);
	}
}
