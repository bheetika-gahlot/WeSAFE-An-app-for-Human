package com.example.wesafe_humansafety

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomBar.setOnItemSelectedListener {

            if(it.itemId==R.id.nav_guard){
                inflateFragment(GuardFragment.newInstance())
            }else if(it.itemId==R.id.nav_home){
                inflateFragment(HomeFragment.newInstance())
     }


            true
        }
    }
    private fun inflateFragment(newInstance: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, newInstance)
        transaction.commit()

    }
}
