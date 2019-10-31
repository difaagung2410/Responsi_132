package com.praktikum.difaagung.responsi132

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    val language = arrayOf<String>("Captain America","Iron Man",
                                   "Thor", "Black Widow",
                                   "Hawkeye", "Hulk",
                                   "Captain Marvel", "Spiderman",
                                   "Doctor Strange", "Falcon",
                                   "Thanos")
    val deskripsi = arrayOf<String>(
        "Pahlawan super dari kalangan tentara",
        "Pahlawan Super dari kepintarannya",
        "Pahlawan Super dari kalangan dewa",
        "Pahlawan Super dari kalangan mata-mata",
        "Pahlawan Super dari pemanah professional",
        "Pahlawan Super dari kekuatan serum",
        "Pahlawan Super dari ledakan power inti",
        "Pahlawan Super dari gigitan Laba Laba",
        "Pahlawan Super dari Belajar ilmu sihir",
        "Pahlawan Super dari mesin sayapnya",
        "Musuh para Pahlawan super dari planet Titan"
    )

    val imageId = arrayOf<Int>(
        R.drawable.captain,R.drawable.ironman,R.drawable.thos,
        R.drawable.widow,R.drawable.hawkeye,R.drawable.hulk,R.drawable.captainmarvel,
        R.drawable.spiderman, R.drawable.doctor, R.drawable.falcon, R.drawable.thanos
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val myListAdapter = HomeAdapter(this,language,deskripsi,imageId)
        list_view.adapter = myListAdapter

        list_view.setOnItemClickListener() { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
        btn_akun.setOnClickListener(){
            val bundle: Bundle? = intent.extras
            val hasil_nama = bundle?.get("nama").toString()
            val hasil_nim = bundle?.get("nim").toString()
            val hasil_email = bundle?.get("email").toString()
            val hasil_alamat = bundle?.get("alamat").toString()
            val hasil_hp = bundle?.get("hp").toString()

            val nama = arrayOf(hasil_nama)
            val nim = arrayOf(hasil_nim)
            val email = arrayOf(hasil_email)
            val alamat = arrayOf(hasil_alamat)
            val hp = arrayOf(hasil_hp)

            intent = Intent(this, AkunActivity::class.java)
            intent.putExtra("nama1", nama)
            intent.putExtra("nim1", nim)
            intent.putExtra("email1", email)
            intent.putExtra("alamat1", alamat)
            intent.putExtra("hp1", hp)
            startActivity(intent)
        }
    }
}
