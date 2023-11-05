package com.dignos.animal.midterm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dignos.animal.midterm.constants.Constants
import com.dignos.animal.midterm.databinding.ActivityAnimalprofileBinding

class animalprofile : AppCompatActivity() {
    private lateinit var binding: ActivityAnimalprofileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimalprofileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val id = intent.getIntExtra(Constants.PARAM_ID, 0)

        val name = intent.getStringExtra(Constants.PARAM_NAME)
        val details = intent.getStringExtra(Constants.PARAM_DETAILS)

        val title = "[$id] $name"

        binding.name.text = title
        binding.details.text = details
        binding.block.setOnClickListener {
            val intent = Intent(this, ManageBlock::class.java)
            startActivity(intent)
        }
    }
}