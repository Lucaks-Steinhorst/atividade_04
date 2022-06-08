package com.example.atividade04

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("TwitchTV")
        setContentView(R.layout.layout_lista)
        setSupportActionBar(findViewById(R.id.toolbar))

        val fab = findViewById<FloatingActionButton>(R.id.fabAdicionar)
        fab.setOnClickListener {
            val intent = Intent(applicationContext,
                CadastroActivity::class.java)
            startActivity(intent)
        }
    }
}