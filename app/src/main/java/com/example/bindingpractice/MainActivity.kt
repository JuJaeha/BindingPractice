package com.example.bindingpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
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

        var btnCh: Boolean = false

//        Toast 메세지 팝업 메세지는 아래와 같이 사용 할 수 있습니다.
//
//        구문 : Toast.makeText(context, text, duration).show()
//        context : applicationContext
//        text : String 타입의 문자열
//        duration : 팝업 메세지 지속 시간
//        Toast.LENGTH_SHORT : 2초
//        Toast.LENGTH_LONG : 3.5초
//        예시 : Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show()



        mBinding.btnHello.setOnClickListener {

            Toast.makeText(this@MainActivity, "button click",100000).show()
           if (btnCh == false) {
               mBinding.btnHello.text = "Hi"
               mBinding.idHello.text = "Hello world!"
               btnCh = true
           } else if (btnCh == true) {
               mBinding.btnHello.text = "Bye"
               mBinding.idHello.text = "Good Bye world!"
               btnCh = false
           }

        }

    }
}