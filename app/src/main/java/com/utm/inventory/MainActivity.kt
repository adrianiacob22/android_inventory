package com.utm.inventory

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToAddProduct.setOnClickListener {
            startActivity(Intent(this, AddProductActivity::class.java))
        }

        val preferences = getSharedPreferences( "database", Context.MODE_PRIVATE)
        val savedName = preferences.getString("savedProductName", "Valoarea nu exista")
        d( "Adrian", "Mesajul salvat este: $savedName")

        lastSavedProduct.text = savedName



    }
}
