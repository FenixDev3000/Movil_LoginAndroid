package com.example.movil_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val btnIniciar : Button = findViewById(R.id.btn_IniciarSesion)

    }

    fun iniciarSesion( view: View){
        val etUsuario : EditText = findViewById(R.id.et_user)
        val etPass : EditText = findViewById(R.id.et_pass)
       if(etUsuario.text.toString() == "Daniel"){
           if(etPass.text.toString() == "1234"){
               Toast.makeText(this,"Iniciando Sesion...",Toast.LENGTH_LONG).show()
           }else{
               Toast.makeText(this,"Usuario o contraseña incorrectos...",Toast.LENGTH_LONG).show()
           }
       }
    }
}