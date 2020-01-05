package com.ds.jetpackcomposekinsight.utils

import java.math.RoundingMode
import java.text.DecimalFormat

private val df = DecimalFormat("00.00").apply {
    roundingMode = RoundingMode.CEILING
}

private val dfshort = DecimalFormat("#0.00").apply {
    roundingMode = RoundingMode.CEILING
}

fun getRoundedValue (value: Double): String {
   return if (value > 0.0 )  df.format(value) else " " + dfshort.format(value)
}