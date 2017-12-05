package com.example.zhujh.test

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ImageView.ScaleType
import kotlinx.android.synthetic.main.activity_image.*

class MainActivity : Activity() {

    lateinit var mDefaultScaleType: ScaleType

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        mDefaultScaleType = iv_first.scaleType

        // TODO
        spinnerScaleType.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                update()
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                update()
            }

        }
        update()
    }

    private fun update() {
        val selectedScaleType = spinnerScaleType.selectedItem as String
        if (selectedScaleType == "DEFAULT") {
            iv_first.scaleType = mDefaultScaleType
            iv_second.scaleType = mDefaultScaleType
        } else {
            val scaleType = ScaleType.valueOf(selectedScaleType)
            iv_first.scaleType = scaleType
            iv_second.scaleType = scaleType
        }
    }
}

