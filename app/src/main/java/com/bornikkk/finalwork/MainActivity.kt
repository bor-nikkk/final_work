package com.bornikkk.finalwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView


private const val LAST_SELECT_ITEM="item"
class MainActivity : AppCompatActivity() {

    private lateinit var bottomMenu: BottomNavigationView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomMenu = findViewById(R.id.bottom_Menu)

        bottomMenu.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.recept -> {
                    val receptFragment = ReceptFragment()
                    replaceFragment(receptFragment)
                }
                R.id.about -> {
                    val aboutFragment = AboutFragment()
                    replaceFragment(aboutFragment)
                }
            }
            true
        }


        val receptFragment = ReceptFragment()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_recept_beer, receptFragment)
            .commit()

        bottomMenu.selectedItemId = if (savedInstanceState==null) R.id.recept else savedInstanceState.getInt(
            LAST_SELECT_ITEM)

    }



    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_recept_beer, fragment)
            .commit()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECT_ITEM, bottomMenu.selectedItemId)
        super.onSaveInstanceState(outState)
    }


}