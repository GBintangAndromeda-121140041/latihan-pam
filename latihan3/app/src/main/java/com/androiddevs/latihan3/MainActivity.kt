package com.androiddevs.latihan3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import androidx.compose.ui.unit.dp
import com.androiddevs.latihan3.databinding.ActivityMainBinding
import com.androiddevs.latihan3.databinding.FragmentDasarBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val activity_main = binding.root

        binding.textView.text = "Hello View Binding"
        binding.button.setOnClickListener {
            Log.d("MainActivity", "Button clicked")
        }
        binding.imageView.maxWidth = 10

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, DasarFragment())
            .commit()

    }
}

