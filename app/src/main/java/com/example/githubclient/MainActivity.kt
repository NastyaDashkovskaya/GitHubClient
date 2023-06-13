package com.gb.poplib.githubclient

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.githubclient.MainPresenter
import com.example.githubclient.MainView
import com.example.githubclient.databinding.ActivityMainBinding

val index_bth1 = 0
val index_bth2 = 1
val index_bth3 = 2

class MainActivity : AppCompatActivity(), MainView {
    private var vb: ActivityMainBinding? = null
    val presenter = MainPresenter(this)

    val counters = mutableListOf(0, 0, 0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        vb = ActivityMainBinding.inflate(layoutInflater)

        setContentView(vb?.root)


        vb?.btnCounter1?.setOnClickListener{presenter.counterOneClick()}
        vb?.btnCounter2?.setOnClickListener{presenter.counterTwoClick()}
        vb?.btnCounter3?.setOnClickListener{presenter.counterThreeClick()}
    }

    override fun setButtonOneText(text: String) {
       vb?.btnCounter1?.text = text}
    override fun setButtonTwoText(text: String) {
       vb?.btnCounter2?.text = text}
    override fun setButtonThreeText(text: String) {
        vb?.btnCounter3?.text = text
    }
}


