package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val RB: Button = findViewById(R.id.done_button)
        RB.setOnClickListener{
            addNickname(it)
        }

        /*val NN: TextView=findViewById(R.id.nickname_text)
        NN.setOnClickListener{
            updateNickname(it)
        }*/


    }

    private fun addNickname(view: View){

        val editText= findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView= findViewById<TextView>(R.id.nickname_text)
        nicknameTextView.text=editText.text
        editText.visibility=View.GONE
        view.visibility=View.GONE
        nicknameTextView.visibility= View.VISIBLE
        val inputMethodManager=getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
    }

    /*private fun updateNickname(view: View){
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val doneButton = findViewById<Button>(R.id.done_button)
        editText.visibility = View.VISIBLE
        doneButton.visibility = View.VISIBLE
        view.visibility = View.GONE
        editText.requestFocus()
        val vis = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        vis.showSoftInput(editText, 0)



    }*/
}
