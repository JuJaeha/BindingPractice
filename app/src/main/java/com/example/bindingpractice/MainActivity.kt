package com.example.bindingpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bindingpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //binding 변수 생성
    //Activity Main Biding 자동 import
    //private lateinit var binding: ActivityMainBinding

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.idHello.text = "bye world!"
    }
}