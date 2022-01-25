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

class ForfaitFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_forfait, container, false)

        Utiles().setMainText(view.findViewById(R.id.forfait_main_text),
            resources.getString(R.string.title_forfait),
            "Comparateur de Forfaits Mobile", "Forfaits Mobile")

        return view
    }
}