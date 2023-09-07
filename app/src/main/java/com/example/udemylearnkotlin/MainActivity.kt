package com.example.udemylearnkotlin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User("bob", 10)
        val btn = findViewById<Button>(R.id.start_green_activity)
        btn.setOnClickListener() {
            val intent = Intent(this, GreenActivity::class.java)
            intent.putExtra("user", user)
            startActivity(intent)
        }

        val btn2 = findViewById<Button>(R.id.show_dialog_button)
        btn2.setOnClickListener() {
            val fragment = ConfirmDeletDialogFragment()
            fragment.listener = object : ConfirmDeletDialogFragment.ConfirmDeletListener {
                override fun onDialogPositiveClick() {
                    Log.i("MainActivity", "onDialogPositiveClick()")
                    val fileListFragment = FileListDialogFragment()
                    fileListFragment.show(supportFragmentManager, "fileList")
                }

                override fun onDialogNegativeClick() {
                    Log.i("MainActivity", "onDialogNegativeClick()")
                }
            }
            fragment.show(supportFragmentManager, "confirmDelet")
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_add -> {
                Toast.makeText(this, "Ajouter", Toast.LENGTH_LONG).show()
                true
            }

            R.id.action_delet -> {
                Toast.makeText(this, "Supprimer", Toast.LENGTH_LONG).show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }


}