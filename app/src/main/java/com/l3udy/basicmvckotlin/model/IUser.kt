package com.l3udy.basicmvckotlin.model

interface IUser {
    fun getEmail(): String?
    fun getPassword(): String?
    fun isValid(): Int
}