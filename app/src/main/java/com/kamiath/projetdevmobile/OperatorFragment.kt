package com.kamiath.projetdevmobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class OperatorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_operator, container, false)

        Utiles().setMainText(view.findViewById(R.id.operator_main_text),
            resources.getString(R.string.title_operator),
            "Les opérateurs de téléphonie mobile", "opérateurs")

        return view
    }
}