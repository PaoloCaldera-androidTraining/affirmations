package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmations.data.Datasource
import com.example.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the layout through the viewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}