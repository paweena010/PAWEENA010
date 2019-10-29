package com.example.paweena_010

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ซ่อนไตเติ้ลบาร์
        supportActionBar?.hide()

        btn_trad.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.trad_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_narathiwat),getString(R.string.history_trad)) }
        })
        btn_narathiwat.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.narathiwat_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_narathiwat),getString(R.string.history_narathiwat)) }
        })
        btn_sakaeo.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.sakaeo_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_sakaeo),getString(R.string.history_sakaeo)) }
        })
        btn_uthaithani.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.uthaithani_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_uthaithani),getString(R.string.history_uthaithani)) }
        })
    }
    fun setProvice (drawable : Drawable, header:String, content:String ){

        img_pv.setImageDrawable(drawable) //เปลี่ยนรูปภาพ
        tv_header.setText("ข้อมูลจังหวัด "+header) // ส่วนหัวของเนื้อหา
        tv_his.setText(content) // เปลี่ยนประวัติของแพร่

        Toast.makeText(this,
            "นี่คือ ข้อมูลจังหวัด "+header,Toast.LENGTH_LONG).show()
    }
}