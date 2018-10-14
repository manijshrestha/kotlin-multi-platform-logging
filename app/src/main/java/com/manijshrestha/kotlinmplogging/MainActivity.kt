package com.manijshrestha.kotlinmplogging

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.manijshrestha.kotlinmplogging.analytics.ButtonClickEvent
import com.manijshrestha.kotlinmplogging.analytics.ViewEvent

class MainActivity : AppCompatActivity() {

    private val analyticsManager = AndroidAnatlyicsManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        analyticsManager.report(ViewEvent("Main Page"))
    }

    fun onButtonClick(view: View) {
        when (view.id) {
            R.id.red_button -> analyticsManager.report(ButtonClickEvent("Red"))
            R.id.green_button -> analyticsManager.report(ButtonClickEvent("Green"))
            R.id.blue_button -> analyticsManager.report(ButtonClickEvent("Blue"))
        }
    }
}
