package com.rolstudio.zone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.SystemClock
import com.rolstudio.zone.databinding.ActivityThirdBinding

open class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    private var timer: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        THIRD = this
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.breakButStart.apply {
            setOnClickListener {
                stopTimer().also {
                    startActivity(Intent(THIRD,FourthActivity::class.java))
                }
            }
        }

//        startActivities(countDownTimer(10000))

        binding.apply { THIRD.countDownTimer(11000) }
    }
    private fun countDownTimer(timeMillis: Long) {
        timer = object : CountDownTimer(timeMillis, 1){
            override fun onTick(millisUntilFinished: Long) {
                var diff = millisUntilFinished
                val secondsInMilli: Long = 1000
                val elapsedSeconds = diff / secondsInMilli
                binding.countTime.text = "00:0${elapsedSeconds}"
            }

            override fun onFinish() {
                Intent(THIRD,FourthActivity::class.java).also { startActivity(it) }
            }
        }.start()
    }

    private fun stopTimer() {
        timer?.cancel()
    }
}