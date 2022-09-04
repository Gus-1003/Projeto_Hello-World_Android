package tads.eaj.ufrn.hellword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Caso a classe R não seja encontrada é causado por um erro em algum elemento no XML

        var editTextLogin: EditText = findViewById(R.id.editTextLogin)
        var editTextPassword: EditText = findViewById(R.id.editTextPassword)

        var buttonOK:Button = findViewById(R.id.buttonOK)

        buttonOK.setOnClickListener{
            // (it as button).text = "Sistema Incompleto"

            Log.i("Aula", editTextLogin.text.toString())
        }
    }
}