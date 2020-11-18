package com.example.remotepcswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    private val listAr = arrayOf("0", "1", "2", "3", "4", "5") //リストの中身
    private var select: Int = 0 //リスト選択時の番号

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.connSpinner) //connSpinnerを見つけておく
        val button = findViewById<Button>(R.id.mainButton) //mainButtonを見つけておく

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listAr) //adapterを作成
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) //選択肢の各項目をレイアウト
        spinner.adapter = adapter //spinnerのadapterとして設定


        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener { //spinnerの中身について
            override fun onItemSelected(parent: AdapterView<*>?,
                                        view: View?, position: Int, id: Long) { //リストの中身が選択された
                select = spinner.selectedItemPosition //選択された番号をselectに格納
                Toast.makeText(this@MainActivity, "接続先"+ select + "番が選択されました", Toast.LENGTH_SHORT).show() //格納した旨を表示
            }

            override fun onNothingSelected(parent: AdapterView<*>?) { //何も選択されなかった場合
              //
            }
        }

        button.setOnClickListener { //mainButton押したときの処理
            Toast.makeText(this, "Button pushed.", Toast.LENGTH_SHORT).show() //押した旨を表示
        }
    }

}