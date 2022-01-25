package com.kamiath.projetdevmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button


class MainActivity : AppCompatActivity() {
    private lateinit var mainFragment: MainFragment
    private lateinit var forfaitFragment: ForfaitFragment
    private lateinit var operatorFragment: OperatorFragment
    private lateinit var promosFragment: PromosFragment
    private lateinit var boxFragment: BoxFragment
    private lateinit var internationalFragment: InternationalFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.configureAndShowMainFragment()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.forfait_mobile -> this.configureAndShowForfaitFragment()
            R.id.box_internet -> this.configureAndShowBoxFragment()
            R.id.promos -> this.configureAndShowPromosFragment()
            R.id.international -> this.configureAndShowInternationalFragment()
            R.id.operateurs -> this.configureAndShowOperatorFragment()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun configureAndShowMainFragment() {
        mainFragment = MainFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout_main, mainFragment)
            .commit();
    }

    private fun configureAndShowForfaitFragment() {
        forfaitFragment = ForfaitFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout_main, forfaitFragment)
            .commit();
    }

    private fun configureAndShowOperatorFragment() {
        operatorFragment = OperatorFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout_main, operatorFragment)
            .commit();
    }

    private fun configureAndShowBoxFragment() {
        boxFragment = BoxFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout_main, boxFragment)
            .commit();
    }

    private fun configureAndShowInternationalFragment() {
        internationalFragment = InternationalFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout_main, internationalFragment)
            .commit();
    }

    private fun configureAndShowPromosFragment() {
        promosFragment = PromosFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout_main, promosFragment)
            .commit();
    }
}