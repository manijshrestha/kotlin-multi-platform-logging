package com.manijshrestha.kotlinmplogging.analytics

data class ViewEvent(private val pageName: String) : Event {

    override fun eventName() = "Page_Viewed"

    override fun eventProperties() = mapOf(
        "page_name" to pageName
    )

}
