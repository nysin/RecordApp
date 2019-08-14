package com.helijia.artisan.recordapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.helijia.artisan.recordapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_start.setOnClickListener(this)
        tv_pause.setOnClickListener(this)
        tv_stop.setOnClickListener(this)
        tv_list.setOnClickListener(this)

    }


    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.tv_start -> showToast("开始")
            R.id.tv_pause -> showToast("暂停")
            R.id.tv_stop -> showToast("停止")
            R.id.tv_list -> showToast("列表")


        }

    }

    private fun showToast(msg:String) {
        Toast.makeText(this.application,msg,Toast.LENGTH_SHORT).show();
    }
}
