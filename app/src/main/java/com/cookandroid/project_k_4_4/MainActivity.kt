package com.cookandroid.project_k_4_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cookandroid.project_k_4_4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        title = "애완동물 사진 보기"

        binding.switchStart.setOnCheckedChangeListener{
                _, b ->
            if (b) {
                binding.tv.visibility = android.view.View.VISIBLE
                binding.rGroup.visibility = android.view.View.VISIBLE
                binding.btnFinish.visibility = android.view.View.VISIBLE
                binding.btnReset.visibility = android.view.View.VISIBLE
            } else {
                binding.rGroup.clearCheck()
                binding.tv.visibility = android.view.View.INVISIBLE
                binding.rGroup.visibility = android.view.View.INVISIBLE
                binding.btnFinish.visibility = android.view.View.INVISIBLE
                binding.btnReset.visibility = android.view.View.INVISIBLE
            }
        }

        binding.rGroup.setOnCheckedChangeListener{
            _, i ->
            when(i) {
                R.id.rPuppy -> {
                    binding.imgView.setImageResource(R.drawable.dog2)
                    binding.imgView.visibility = android.view.View.VISIBLE
                }
                R.id.rCat -> {
                    binding.imgView.setImageResource(R.drawable.cat)
                    binding.imgView.visibility = android.view.View.VISIBLE
                }
                R.id.rRabbit -> {
                    binding.imgView.setImageResource(R.drawable.rabbit2)
                    binding.imgView.visibility = android.view.View.VISIBLE
                }
            }
        }

        binding.btnFinish.setOnClickListener {
            finish()
        }

        binding.btnReset.setOnClickListener {
            binding.rGroup.clearCheck()
            binding.tv.visibility = android.view.View.INVISIBLE
            binding.rGroup.visibility = android.view.View.INVISIBLE
            binding.btnFinish.visibility = android.view.View.INVISIBLE
            binding.btnReset.visibility = android.view.View.INVISIBLE
            binding.imgView.visibility = android.view.View.INVISIBLE
            binding.switchStart.isChecked = false
        }
    }
}