package com.alice.guessmynumberapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.Result.Companion.success

class MainActivity : AppCompatActivity() {

    var number: Int = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        printTheQuestion()

    }
    private fun success(){
        question_text_view.visibility = View.INVISIBLE
        result_text_view.visibility = View.VISIBLE
        result_text_view.text = String.format(resources.getString(R.string.str_success), number)

    }

    fun clickDownArrow(view : View) {

        when (number) {
            5 -> {
                number = 3
                printTheQuestion()

            }
            3 -> {
                number = 2
                printTheQuestion()
            }
            2 -> {
                number = 1
                success()
            }
            8->{
                number = 7
                printTheQuestion()

            }
            7->{
                number = 6
                printTheQuestion()

            }
            6-> {
                number = 5
                printTheQuestion()
            }
        }
    }


    fun clickUpArrow(view: View) {
        when (number) {
            5 -> {
                number = 8
                printTheQuestion()

            }
            8 -> {
                number = 9
                printTheQuestion()
            }
            9 -> {
                number = 10
                success()

            }
            3->{
                number = 4
                printTheQuestion()
            }
        }
    }

    fun clickSuccess(view: View) {
        success()
    }

    fun clickResetButton(view: View) {
        question_text_view.visibility = View.VISIBLE
        result_text_view.visibility = View.INVISIBLE
        number = 5
        printTheQuestion()
    }

    fun printTheQuestion() {
        question_text_view.text = String.format(resources.getString(R.string.str_question), number)
    }

}