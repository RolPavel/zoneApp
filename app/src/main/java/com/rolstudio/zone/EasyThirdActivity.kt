package com.rolstudio.zone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rolstudio.zone.databinding.ActivityEasyThirdBinding
import com.rolstudio.zone.databinding.ActivityThirdBinding

class EasyThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEasyThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEasyThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.butStart2.setOnClickListener {
            Intent(this,FourthActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}