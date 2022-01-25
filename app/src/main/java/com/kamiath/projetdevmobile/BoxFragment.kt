package com.kamiath.projetdevmobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BoxFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_box, container, false)

        Utiles().setMainText(view.findViewById(R.id.box_main_text),
            resources.getString(R.string.title_box),
            "Comparateur de Box Internet", "Box Internet")

        return view
    }
}