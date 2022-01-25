package com.kamiath.projetdevmobile

import android.graphics.Color
import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.text.style.StyleSpan
import android.view.View
import android.widget.TextView

class Utiles {
    public fun setMainText(textResume: TextView, txt: String, titleTxt: String, blueTxt: String) {
        var spannable = SpannableString(txt)
        spannable.setSpan(
            ForegroundColorSpan(Color.parseColor("#2563eb")),
            txt.indexOf(blueTxt),
            txt.indexOf(blueTxt) + blueTxt.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannable.setSpan(
            RelativeSizeSpan(1.5f),
            txt.indexOf(titleTxt),
            txt.indexOf(titleTxt) + titleTxt.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannable.setSpan(
            StyleSpan(Typeface.BOLD),
            txt.indexOf(titleTxt),
            txt.indexOf(titleTxt) + titleTxt.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        textResume.text = spannable
    }
}