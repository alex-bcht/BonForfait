package com.kamiath.projetdevmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface.BOLD
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.text.style.StyleSpan
import android.text.style.TypefaceSpan
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat.getSystemService



class MainActivity : AppCompatActivity() {
    private lateinit var mainFragment: MainFragment;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.configureAndShowMainFragment();
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.forfait_mobile -> {
                val forfaitActivityIntent = Intent(this@MainActivity, ForfaitActivity::class.java)
                startActivity(forfaitActivityIntent)
            }
            R.id.box_internet -> Toast.makeText(this, "@string/box_internet", Toast.LENGTH_SHORT)
            R.id.promos -> Toast.makeText(this, "@string/promos", Toast.LENGTH_SHORT)
            R.id.international -> Toast.makeText(this, "@string/international", Toast.LENGTH_SHORT)
            R.id.operateurs -> Toast.makeText(this, "@string/operateurs", Toast.LENGTH_SHORT)
        }
        return super.onOptionsItemSelected(item)
        /*return when (item.itemId) {
            R.id.forfait_mobile -> true
            else -> super.onOptionsItemSelected(item)
        }*/
    }

    private fun configureAndShowMainFragment() {
        mainFragment = MainFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.frame_layout_main, mainFragment)
            .commit();
    }
}
