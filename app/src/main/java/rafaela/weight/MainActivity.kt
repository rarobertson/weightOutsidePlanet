/*
 * Created by rrobertson
 * Copyright (c) 2018.
 */

package rafaela.weight

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , MainPresenter.OffPlanetWeight {

    var presenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var weight = enterWeightID.text

        showWeightId.setOnClickListener {
            enterWeightID.hideKeyboard()
            resultWeightId.text = calculateWeight(weight.toString().toDouble())
        }

    }

    override fun calculateWeight(userWeight: Double): String { // Can be decimal. Ex: 75
        return  presenter.calculateWeight(userWeight)
    }

    fun View.hideKeyboard() {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    }
}
