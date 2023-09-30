package com.rolstudio.zone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.rolstudio.zone.databinding.ActivityFourthBinding

open class FourthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFourthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.b1.setBackgroundResource(R.color.Purple2)
        binding.b2.setBackgroundResource(R.color.Purple2)
        binding.b3.setBackgroundResource(R.color.Purple2)
        binding.b4.setBackgroundResource(R.color.Purple2)
        binding.b5.setBackgroundResource(R.color.Purple2)
        binding.b6.setBackgroundResource(R.color.Purple2)
        binding.b7.setBackgroundResource(R.color.Purple2)
        binding.b8.setBackgroundResource(R.color.Purple2)
        binding.b9.setBackgroundResource(R.color.Purple2)
        binding.b10.setBackgroundResource(R.color.Purple2)
        binding.b11.setBackgroundResource(R.color.Purple2)
        binding.b12.setBackgroundResource(R.color.Purple2)


        startActivity(game())
    binding.but3.setOnClickListener{
        Intent(this,FiveActivity::class.java).putExtra(
            "score", binding.points.text.toString())
            .also {
            startActivity(it)
        }
    }
}

    private fun startActivity(game: Unit) {}

    private var point = 0
    private var numOn = 1
    //        1=9, 2=10, 3=11, 4=7, 5=8, 6=12
    private fun game() {
        val c1 = arrayListOf(binding.points)
        val c2 = arrayListOf(binding.points)

        fun solution() {
            binding.b1.text = "1"; binding.b9.text = "1"
            binding.b2.text = "2"; binding.b10.text = "2"
            binding.b3.text = "3"; binding.b11.text = "3"
            binding.b4.text = "4"; binding.b7.text = "4"
            binding.b5.text = "5"; binding.b8.text = "5"
            binding.b6.text = "6"; binding.b12.text = "6"
        }
        solution()


        fun check(){
            if(c1[0].text == c2[0].text){c1[0].text = ""; c2[0].text = ""; point++; binding.points.text = point.toString()}
            else {Handler().postDelayed({c1[0].setBackgroundResource(R.color.Purple2); c2[0].setBackgroundResource(R.color.Purple2)}, 1500)}

            Handler().postDelayed({c1.remove(c1[0]);c2.remove(c2[0])}, 2500)

            if (point==6){
                Handler().postDelayed({game()}, 1000)
            }
        }

        c1.remove(c1[0]);c2.remove(c2[0])

        binding.b1.setOnClickListener{binding.b1.setBackgroundResource(R.drawable.clock_choice1); if (binding.b1.text!=""){ if (numOn==1){numOn=2;c1.add(binding.b1)} else if (c1[0]!=binding.b1){c2.add(binding.b1);check();numOn=1} } }
        binding.b2.setOnClickListener{binding.b2.setBackgroundResource(R.drawable.clock_choice2); if (binding.b2.text!=""){ if (numOn==1){numOn=2;c1.add(binding.b2)} else if (c1[0]!=binding.b2){c2.add(binding.b2);check();numOn=1} } }
        binding.b3.setOnClickListener{binding.b3.setBackgroundResource(R.drawable.clock_choice3); if (binding.b3.text!=""){ if (numOn==1){numOn=2;c1.add(binding.b3)} else if (c1[0]!=binding.b3){c2.add(binding.b3);check();numOn=1} } }
        binding.b4.setOnClickListener{binding.b4.setBackgroundResource(R.drawable.clock_choice4); if (binding.b4.text!=""){ if (numOn==1){numOn=2;c1.add(binding.b4)} else if (c1[0]!=binding.b4){c2.add(binding.b4);check();numOn=1} } }
        binding.b5.setOnClickListener{binding.b5.setBackgroundResource(R.drawable.clock_choice5); if (binding.b5.text!=""){ if (numOn==1){numOn=2;c1.add(binding.b5)} else if (c1[0]!=binding.b5){c2.add(binding.b5);check();numOn=1} } }
        binding.b6.setOnClickListener{binding.b6.setBackgroundResource(R.drawable.clock_choice6); if (binding.b6.text!=""){ if (numOn==1){numOn=2;c1.add(binding.b6)} else if (c1[0]!=binding.b6){c2.add(binding.b6);check();numOn=1} } }
        binding.b7.setOnClickListener{binding.b7.setBackgroundResource(R.drawable.czech_image); if (binding.b7.text!=""){ if (numOn==1){numOn=2;c1.add(binding.b7)} else if (c1[0]!=binding.b7){c2.add(binding.b7);check();numOn=1} } }
        binding.b8.setOnClickListener{binding.b8.setBackgroundResource(R.drawable.ictanbul_image); if (binding.b8.text!=""){ if (numOn==1){numOn=2;c1.add(binding.b8)} else if (c1[0]!=binding.b8){c2.add(binding.b8);check();numOn=1} } }
        binding.b9.setOnClickListener{binding.b9.setBackgroundResource(R.drawable.london_image); if (binding.b9.text!=""){ if (numOn==1){numOn=2;c1.add(binding.b9)} else if (c1[0]!=binding.b9){c2.add(binding.b9);check();numOn=1} } }
        binding.b10.setOnClickListener{binding.b10.setBackgroundResource(R.drawable.moscow_image); if (binding.b10.text!=""){ if (numOn==1){numOn=2;c1.add(binding.b10)} else if (c1[0]!=binding.b10){c2.add(binding.b10);check();numOn=1} } }
        binding.b11.setOnClickListener{binding.b11.setBackgroundResource(R.drawable.parish_image); if (binding.b11.text!=""){ if (numOn==1){numOn=2;c1.add(binding.b11)} else if (c1[0]!=binding.b11){c2.add(binding.b11);check();numOn=1} } }
        binding.b12.setOnClickListener{binding.b12.setBackgroundResource(R.drawable.yerevan_image); if (binding.b12.text!=""){ if (numOn==1){numOn=2;c1.add(binding.b12)} else if (c1[0]!=binding.b12){c2.add(binding.b12);check();numOn=1} } }

    }
}