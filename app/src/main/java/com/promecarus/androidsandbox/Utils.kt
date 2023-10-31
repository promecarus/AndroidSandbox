package com.promecarus.androidsandbox

import android.content.Context
import android.location.Geocoder
import java.io.IOException
import java.util.Locale

object Utils {
    @Suppress("DEPRECATION")
    fun getCity(context: Context, lat: Double?, lon: Double?): String? {
        if (lat == null || lon == null) return null
        try {
            val list = Geocoder(context, Locale.getDefault()).getFromLocation(lat, lon, 1)?.let {
                if (it.isNotEmpty()) it[0] else null
            }
            return when (list) {
                null -> null
                else -> "${list.adminArea?.let { "$it, " } ?: ""}${list.locality?.let { "$it, " } ?: ""}${list.postalCode?.let { "$it, " } ?: ""}${list.countryName ?: ""}"
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return null
    }
}
