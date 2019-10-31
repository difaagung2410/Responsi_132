package com.praktikum.difaagung.responsi132

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val bundle: Bundle? = intent.extras
        val fix_nama = bundle?.get("nama").toString()
        val fix_nim = bundle?.get("nim").toString()
        val fix_email = bundle?.get("email").toString()
        val fix_alamat = bundle?.get("alamat").toString()
        val fix_hp = bundle?.get("hp").toString()

        btn_login.setOnClickListener(){

            var usernya: EditText = findViewById(R.id.user)
            var user_benar = usernya.getText().toString()
            var passnya: EditText = findViewById(R.id.pass)
            var pass_benar = passnya.getText().toString()

            if (user.text.isEmpty()) {
                user.setError("Username Harus Diisi!!")
            } else if (pass.text.isEmpty()) {
                pass.setError("Password Harus Diisi!!")
            } else if (user_benar == "difaagung"  && pass_benar == "difa240111") {
                intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("nama1", fix_nama)
                intent.putExtra("nim1", fix_nim)
                intent.putExtra("email1", fix_email)
                intent.putExtra("alamat1", fix_alamat)
                intent.putExtra("hp1", fix_hp)
                startActivity(intent)
            } else {
                user.setError("Username Salah")
                pass.setError("Password Salah")
            }
        }
        btn_regis.setOnClickListener(){
            intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
