package com.example.utspember

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.utspember.databinding.ActivityMainBinding
import com.example.utspember.databinding.FragmentGridBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityMainBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)

//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        val toolbar = findViewById<Toolbar>(R.id.my_toolbar)
//        setSupportActionBar(toolbar)
//
//        val navController = findNavController(R.id.fragmentContainerView)
//        val config = AppBarConfiguration(navController.graph)
//
//        binding.myToolbar.setupWithNavController(navController, config)

//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_rv,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.listFragment -> {
                val listFragment = ListFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_host_fragment, listFragment)
                    .addToBackStack(null)
                    .commit()
                true
            } R.id.gridFragment -> {
                val gridFragment = GridFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_host_fragment, gridFragment)
                    .addToBackStack(null)
                    .commit()
                true
            } else -> super.onOptionsItemSelected(item)
        }
    }

//    private lateinit var navController: NavController
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        setSupportActionBar(findViewById(R.id.my_toolbar))
//
//        navController = findNavController(R.id.nav_host_fragment)
//        findViewById<Toolbar>(R.id.my_toolbar).setupWithNavController(navController)
//    }
//
//    override fun onSupportNavigateUp(): Boolean {
//        return navController.navigateUp() || super.onSupportNavigateUp()
//    }
}