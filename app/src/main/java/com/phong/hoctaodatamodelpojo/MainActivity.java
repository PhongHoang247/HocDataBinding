package com.phong.hoctaodatamodelpojo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.phong.hoctaodatamodelpojo.databinding.ActivityMainBinding;
import com.phong.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        User user = new User("Phong","Hoàng");
        binding.setUser(user);
    }
}
