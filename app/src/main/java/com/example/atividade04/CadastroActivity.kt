package com.example.atividade04

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.widget.Button

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_cadastro)
        setTitle("Novo video")
        setSupportActionBar(findViewById(R.id.toolbar))

        val botaoSalvar = findViewById<Button>(R.id.btnSalvar)
        botaoSalvar.setOnClickListener {
            finish()
        }
    }
}