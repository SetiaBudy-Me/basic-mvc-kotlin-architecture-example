package com.l3udy.basicmvckotlin.controller

import com.l3udy.basicmvckotlin.model.User
import com.l3udy.basicmvckotlin.view.ILoginView

class LoginController(view: ILoginView) : ILoginController {
    private var view: ILoginView

    init {
        this.view = view
    }

    override fun login(email: String?, password: String?) {
        val user = User(email!!, password!!)
        when (user.isValid()) {
            0 -> view.onLoginResult(false, "Please enter Email")
            1 -> view.onLoginResult(false, "Please enter A valid Email")
            2 -> view.onLoginResult(false, "Please enter Password")
            3 -> view.onLoginResult(false, "Please enter Password greater the 6 char")
            else -> view.onLoginResult(true, "Login Successful")
        }
    }
}