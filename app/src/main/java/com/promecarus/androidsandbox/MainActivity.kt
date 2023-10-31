package com.promecarus.androidsandbox

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.promecarus.androidsandbox.Utils.getCity
import com.promecarus.androidsandbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.button.isEnabled = false
            binding.textView.text = getCity(this, -7.9208177, 112.5918766)
        }

        binding.textView.text = getCity(this, 2.0, 2.0)

        Log.d(this::class.java.simpleName, "onCreate: called")
    }

    override fun onStart() {
        super.onStart()
        Log.d(this::class.java.simpleName, "onStart: called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(this::class.java.simpleName, "onResume: called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(this::class.java.simpleName, "onPause: called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(this::class.java.simpleName, "onStop: called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(this::class.java.simpleName, "onDestroy: called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(this::class.java.simpleName, "onRestart: called")
    }
}
