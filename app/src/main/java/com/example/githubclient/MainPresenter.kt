package com.example.githubclient


val index_bth1 = 0
val index_bth2 = 1
val index_bth3 = 2
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

