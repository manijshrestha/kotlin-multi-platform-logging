package com.manijshrestha.kotlinmplogging.analytics

data class ButtonClickEvent(private val buttonName: String) : Event {

    override fun eventName() = "Button_Clicked"

    override fun eventProperties() = mapOf(
        "button_name" to buttonName
    )
}