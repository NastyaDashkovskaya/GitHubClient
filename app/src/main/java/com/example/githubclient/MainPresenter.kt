package com.example.githubclient

import com.gb.poplib.githubclient.index_bth1
import com.gb.poplib.githubclient.index_bth2
import com.gb.poplib.githubclient.index_bth3

class MainPresenter(val view : MainView) {
        val model = CountersModel()

        fun counterOneClick() {
                    val nextValue = model.next(index_bth1)
                    view.setButtonOneText(nextValue.toString())
                }

        fun counterTwoClick() {
                    val nextValue = model.next(index_bth2)
                    view.setButtonTwoText(nextValue.toString())
                }

        fun counterThreeClick() {
                    val nextValue = model.next(index_bth3)
                    view.setButtonThreeText(nextValue.toString())
                }
            }

