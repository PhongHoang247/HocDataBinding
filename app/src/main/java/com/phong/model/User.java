package com.phong.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class User extends BaseObservable {
    private String firstName;
    private String lastName;

    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Bindable
    public String getFirstName() {
        return firstName;
    }
    @Bindable
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Bindable
    public String getLastName() {
        return lastName;
    }
    @Bindable
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
