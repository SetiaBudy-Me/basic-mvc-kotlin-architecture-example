package com.l3udy.basicmvckotlin.model

import android.text.TextUtils
import android.util.Patterns

class User(private val email: String, private val password: String) : IUser {
    override fun getEmail(): String {
        return email
    }

    override fun getPassword(): String {
        return password
    }

    override fun isValid(): Int {
        return if (TextUtils.isEmpty(getEmail())) {
            // 0 Email is Empty
            0
        } else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()) {
            // 1. Email not Match pattern
            1
        } else if (TextUtils.isEmpty(getPassword())) {
            // 2. Password is Empty
            2
        } else if (getPassword().length <= 6) {
            // Password length <= 6
            3
        } else -1
    }
}