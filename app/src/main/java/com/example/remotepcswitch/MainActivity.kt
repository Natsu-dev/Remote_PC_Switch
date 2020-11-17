package com.example.remotepcswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val listAr = arrayOf("1", "2", "3", "4", "5") //リストの中身

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.connSpinner) //connectSpinnerを見つけておく
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listAr) //adapterを作成
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) //選択肢の各項目をレイアウト
        spinner.adapter = adapter //spinnerのadapterとして設定

        val button = findViewById<Button>(R.id.mainButton) //mainButtonを見つけておく
        button.setOnClickListener {
            Toast.makeText(this, "Button pushed.", Toast.LENGTH_SHORT).show()
        }
    }

}