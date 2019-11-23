package br.com.senaijandira.primeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Define click do botão
        btOk.setOnClickListener {

            //Cria variável para guardar o nome
            val nome = etNome.text.toString()

            //Exibe o nome na tela
            tvResultado.text = "Boa tarde, $nome"

        }
    }
}
