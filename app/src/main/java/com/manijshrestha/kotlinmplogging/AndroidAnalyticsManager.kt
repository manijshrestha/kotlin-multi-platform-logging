package com.manijshrestha.kotlinmplogging

import android.util.Log
import com.manijshrestha.kotlinmplogging.analytics.AnalyticsManager
import com.manijshrestha.kotlinmplogging.analytics.Event

class AndroidAnalyticsManager : AnalyticsManager {

    override fun report(event: Event) {
        Log.d("AAM", "Interaction ${event.eventName()} happened with property ${event.eventProperties()}")
    }

}