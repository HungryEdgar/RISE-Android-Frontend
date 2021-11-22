package com.example.al4t_claco

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.al4t_claco.databinding.ResourcesBinding
import com.example.al4t_claco.view.DataActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.resources)

        //TODO: method when an activity is selected

        val teachers = listOf("Lorge","Lurkin","Dekimpe")
        val activity = Activity("Informatique","4inf",teachers)
        activity.resources = listOf(File("a","pdf"),File("b","pdf"))


        val binding: ResourcesBinding = DataBindingUtil.setContentView(this, R.layout.resources)
        binding.resource = DataActivity(activity, "info")
        supportActionBar?.title = "Resources"







    }
}