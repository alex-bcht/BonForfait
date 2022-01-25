package com.kamiath.projetdevmobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class PromosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_promos, container, false)

        Utiles().setMainText(view.findViewById(R.id.promos_main_text),
            resources.getString(R.string.title_promos),
            "Les promos du moment", "promos")

        return view
    }
}