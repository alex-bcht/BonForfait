package com.kamiath.projetdevmobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class MainFragment : Fragment() {
    private lateinit var forfaitFragment: ForfaitFragment
    private lateinit var mButton: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_main, container, false)

        Utiles().setMainText(view.findViewById(R.id.resume_app_text),
            resources.getString(R.string.text_main),
            "Trouvez votre nouveau Forfait mobile", "Forfait mobile")
        mButton = view.findViewById(R.id.button_mainToforfait);
        mButton.setOnClickListener{this.configureAndShowForfaitFragment()}

        return view
    }

    private fun configureAndShowForfaitFragment() {
        forfaitFragment = ForfaitFragment()
        parentFragmentManager.beginTransaction()
            .replace(R.id.frame_layout_main, forfaitFragment)
            .commit();
    }
}