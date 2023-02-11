package com.example.converttimetolocaltime

import org.ocpsoft.prettytime.PrettyTime
import java.util.*

object Utilities {

    fun returnTimeAgo(postedTime: String): String {
        val prettyTime = PrettyTime(Locale.getDefault())
        return prettyTime.format(Date(postedTime))
    }
}