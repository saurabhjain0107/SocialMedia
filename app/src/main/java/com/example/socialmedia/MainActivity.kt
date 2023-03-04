package com.example.socialmedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialmedia.Fragment.HomeFragment
import com.example.socialmedia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, HomeFragment()).commit()

        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, HomeFragment()).commit()
                    true
                }
//                R.id.search -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.container, SearchFragment()).commit()
//                    true
//                }
//                R.id.notification -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.container, NotificationFragment()).commit()
//                    true
//                }
//                R.id.profile -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.container,ProfileFragment()).commit()
//                    true
//                }

            }
            true
        }
    }
}