package com.manijshrestha.kotlinmplogging.analytics

interface Event {

    fun eventName(): String

    fun eventProperties(): Map<String, String>?

}