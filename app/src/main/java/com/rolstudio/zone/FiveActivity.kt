package com.rolstudio.zone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rolstudio.zone.databinding.ActivityFiveBinding

open class FiveActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFiveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFiveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val finalScore = intent.getStringExtra("score")
        binding.finalScore.text = finalScore


        binding.breakButRefresh.setOnClickListener {
            Intent(this, SecondActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}