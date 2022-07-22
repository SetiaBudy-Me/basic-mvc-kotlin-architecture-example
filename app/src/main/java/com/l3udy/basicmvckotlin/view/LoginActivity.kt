package com.l3udy.basicmvckotlin.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.l3udy.basicmvckotlin.controller.ILoginController
import com.l3udy.basicmvckotlin.controller.LoginController
import com.l3udy.basicmvckotlin.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), ILoginView {
    private val tag = "SetBud" + this::class.java.simpleName

    // View Binding
    private lateinit var binding: ActivityLoginBinding

    // Controller
    private lateinit var controller: ILoginController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        // Initialize binding
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize controller
        controller = LoginController(this)

        setupClickListeners()
    }

    override fun onLoginResult(isSuccess: Boolean, errorMessage: String) {
        Log.d(tag, "isSuccess: $isSuccess, errorMessage: $errorMessage")

        if(isSuccess) {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }else {
            Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
        }
    }

    // Setup the button in our activity
    private fun setupClickListeners() {
        binding.btnLogin.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()

            controller.login(email, password)
        }
    }
}