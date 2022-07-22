package com.l3udy.basicmvckotlin.view

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.l3udy.basicmvckotlin.controller.IMainController
import com.l3udy.basicmvckotlin.controller.MainController
import com.l3udy.basicmvckotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), IMainView {
    private val tag = this::class.java.simpleName

    // View Binding
    private lateinit var binding: ActivityMainBinding

    // Controller
    private lateinit var controller: IMainController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize controller
        controller = MainController(this)

        setupClickListeners()
    }

    override fun onCountResult(result: Int) {
        binding.tvResult.text = result.toString()
    }

    private fun setupClickListeners() {
        binding.btnCount.setOnClickListener {
            try {
                // Initialize the number to be calculated
                val number1 = binding.etNumber1.text.toString().toInt()
                val number2 = binding.etNumber2.text.toString().toInt()

                // Calling a function inside the controller
                controller.count(number1, number2)
            } catch (e: Exception) {
                Log.e(tag, "Error Exception -> ${e.localizedMessage}")
                Toast.makeText(this, "Oops something wrong..!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}