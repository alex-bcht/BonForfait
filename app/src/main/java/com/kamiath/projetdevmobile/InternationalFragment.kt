package com.kamiath.projetdevmobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class InternationalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_international, container, false)

        Utiles().setMainText(view.findViewById(R.id.international_main_text),
            resources.getString(R.string.title_international),
            "Tarifs internationaux", "internationaux")

        return view
    }
}