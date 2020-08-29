package com.example.myappgd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import com.example.myappgd.fragments.FavoriteFragment
import com.example.myappgd.fragments.HomeFragment
import com.example.myappgd.fragments.TodayFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var homeFragment: HomeFragment
    lateinit var todayFragment: TodayFragment
    lateinit var favoriteFragment: FavoriteFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNaviga:BottomNavigationView = findViewById(R.id.bottom_nav)
        homeFragment = HomeFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_container,homeFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()

        bottomNaviga.setOnNavigationItemSelectedListener {item->
            when(item.itemId){

                R.id.home ->{
                    Toast.makeText(this,"home is pressed",Toast.LENGTH_SHORT).show()
                    homeFragment = HomeFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container,homeFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.today ->{
                    Toast.makeText(this,"today is pressed",Toast.LENGTH_SHORT).show()

                    todayFragment = TodayFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container,todayFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.favorite ->{
                    Toast.makeText(this,"favor is pressed",Toast.LENGTH_SHORT).show()

                    favoriteFragment = FavoriteFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container,favoriteFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
            }
            true
        }
    }
}