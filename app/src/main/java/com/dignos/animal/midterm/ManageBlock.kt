package com.dignos.animal.midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dignos.animal.midterm.constants.Constants
import com.dignos.animal.midterm.databinding.ActivityManageBlockBinding

class ManageBlock : AppCompatActivity() {
    private lateinit var binding: ActivityManageBlockBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManageBlockBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val id = intent.getIntExtra(Constants.PARAM_ID, 0)

        val name = intent.getStringExtra(Constants.PARAM_NAME)

        val title = "[$id] $name"

        binding.blockanimal.text = title
    }
}