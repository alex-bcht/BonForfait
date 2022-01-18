package com.kamiath.projetdevmobile

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.text.style.StyleSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class OperatorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_main, container, false)

        this.setMainText(view)

        return view
    }

    private fun setMainText(view: View) {
        val textOperator: TextView = view.findViewById(R.id.resume_app_text)
        val txt = resources.getString(R.string.text_operator)
        val titleTxt = "Les opérateurs de téléphonie mobile"
        val blueTxt = "opérateurs"
        var spannable = SpannableString(txt)
        spannable.setSpan(
            RelativeSizeSpan(0.5f),
            0,
            txt.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannable.setSpan(
            RelativeSizeSpan(1.5f),
            txt.indexOf(titleTxt),
            txt.indexOf(titleTxt) + titleTxt.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannable.setSpan(
            ForegroundColorSpan(Color.parseColor("#2563eb")),
            txt.indexOf(blueTxt),
            txt.indexOf(blueTxt) + blueTxt.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        textOperator.text = spannable
    }
}