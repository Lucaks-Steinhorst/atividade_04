package com.example.atividade04

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MinhaAtividade : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        println("onCreate executado...")
        super.onCreate(savedInstanceState)
        setTitle("Minha Atividade")
    }

    override fun onStart() {
        println("onStart executado...")
        super.onStart()

    }

    override fun onResume() {
        println("onResume executado...")
        super.onResume()

    }

    override fun onPause() {
        println("onPause executado...")
        super.onPause()

    }

    override fun onStop() {
        println("onStop executado...")
        super.onStop()

    }

    override fun onRestart() {
        println("onRestart executado...")
        super.onRestart()

    }

    override fun onDestroy() {
        println("onDestroy executado...")
        super.onDestroy()

    }
}