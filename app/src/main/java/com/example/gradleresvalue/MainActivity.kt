package com.example.gradleresvalue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.gradleresvalue.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bingding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bingding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)//setContentView(R.layout.activity_main)
        //bingding.act = this

        var stringBuffer:StringBuffer = StringBuffer("gradle 自定义资源展示\n")
        stringBuffer.append(resources.getString(R.string.app_token)).append("\n")
            .append(resources.getBoolean(R.bool.rel)).append("\n")
            .append(resources.getInteger(R.integer.num)).append("\n")

        bingding.tv.text = stringBuffer.toString()
    }
}