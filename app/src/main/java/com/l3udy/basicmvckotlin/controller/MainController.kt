package com.l3udy.basicmvckotlin.controller

import com.l3udy.basicmvckotlin.model.Data
import com.l3udy.basicmvckotlin.view.IMainView

class MainController(view: IMainView) : IMainController {
    private var view: IMainView

    init {
        this.view = view
    }

    override fun count(number1: Int, number2: Int) {
        val data = Data(number1, number2)
        view.onCountResult(data.result())
    }
}