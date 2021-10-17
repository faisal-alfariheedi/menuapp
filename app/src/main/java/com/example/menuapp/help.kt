package com.example.menuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class help : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.men, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        val item1 = menu!!.getItem(0)

        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.m1 -> {
                intent= Intent(this,MainActivity::class.java)
                startActivity(intent)

                return true
            }
            R.id.m2 -> {
                null

                return true
            }
            R.id.m3 -> {
                intent= Intent(this,about::class.java)
                startActivity(intent)

                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}