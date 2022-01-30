package com.kamiath.projetdevmobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

import com.bumptech.glide.Glide


class MainFragment : Fragment() {
    private lateinit var forfaitFragment: ForfaitFragment
    private lateinit var mButton: Button
    private lateinit var mImage: ImageView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(com.kamiath.projetdevmobile.R.layout.fragment_main, container, false)

        Utiles().setMainText(view.findViewById(com.kamiath.projetdevmobile.R.id.resume_app_text),
            resources.getString(com.kamiath.projetdevmobile.R.string.text_main),
            "Trouvez votre nouveau Forfait mobile", "Forfait mobile")
        mButton = view.findViewById(com.kamiath.projetdevmobile.R.id.button_mainToforfait);
        mButton.setOnClickListener{this.configureAndShowForfaitFragment()}

        displayMainImages(view)
        /*val aq = AQuery(view.context) com.kamiath.projetdevmobile.R.id.img_main_1
        aq.id(R.id.img_main_1).image("http://www.vikispot.com/z/images/vikispot/android-w.png")*/

        return view
    }

    private fun configureAndShowForfaitFragment() {
        forfaitFragment = ForfaitFragment()
        parentFragmentManager.beginTransaction()
            .replace(com.kamiath.projetdevmobile.R.id.frame_layout_main, forfaitFragment)
            .commit();
    }

    private fun displayMainImages(view: View) {
        var imgUrls = arrayOf(
            "https://i.ibb.co/t2r8VKK/sans-engagement.png",
            "https://i.ibb.co/kQwVjpW/moins-cheres.png",
            "https://i.ibb.co/KxzT56T/forfait5-G.png",
            "https://i.ibb.co/jy1Vnrh/client-box-internet.png"
        )

        for(i in imgUrls.indices){
            var name = "img_main_$i"
            var resID = resources.getIdentifier(name, "id", view.context.packageName)
            mImage = view.findViewById(resID)
            Glide.with(mImage.context)
                .load(imgUrls[i])
                .into(mImage);
        }
    }
}