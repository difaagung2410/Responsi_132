package com.praktikum.difaagung.responsi132

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var namaku : EditText = findViewById(R.id.nama1)
        var nimku : EditText = findViewById(R.id.nim1)
        var email : EditText = findViewById(R.id.email)
        var alamat : EditText = findViewById(R.id.alamat)
        var hp : EditText = findViewById(R.id.hp)

        daftar.setOnClickListener(){
            intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("nama", namaku.getText())
            intent.putExtra("nim", nimku.getText())
            intent.putExtra("email", email.getText())
            intent.putExtra("alamat", alamat.getText())
            intent.putExtra("hp", hp.getText())
            startActivity(intent)
        }
    }
}
