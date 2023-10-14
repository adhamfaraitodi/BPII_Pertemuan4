package com.example.bp2_pertemuan4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.bp2_pertemuan4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit private var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFragmentSatu.setOnClickListener{
            gantiFragment(FragmentSatu())
        }
        binding.btnFragmentDua.setOnClickListener{
            gantiFragment(FragmentDua())
        }
    }

    private fun gantiFragment(fragment: Fragment){
        val fragmentManager =supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container,fragment)
            fragmentTransaction.commit()
    }
}