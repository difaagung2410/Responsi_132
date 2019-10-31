package com.praktikum.difaagung.responsi132

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_akun.*

class AkunActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun)

        val bundle: Bundle? = intent.extras
        val fix_nama = bundle?.get("nama1").toString()
        val fix_nim = bundle?.get("nim1").toString()
        val fix_email = bundle?.get("email1").toString()
        val fix_alamat = bundle?.get("alamat1").toString()
        val fix_hp = bundle?.get("hp1").toString()


        hasil_nama.setText(fix_nama)
        hasil_nim.setText(fix_nim)
        hasil_email.setText(fix_email)
        hasil_alamat.setText(fix_alamat)
        hasil_hp.setText(fix_hp)
    }
}
