package com.l3udy.basicmvckotlin.view

interface ILoginView {
    fun onLoginResult(isSuccess: Boolean, errorMessage: String)
}