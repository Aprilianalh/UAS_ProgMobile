package com.example.uas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProfilAplikasi : AppCompatActivity() {
    // override untuk mengubah suatu fungsi pada parent
    // melakukan inisialisasi pada activity baru
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_aplikasi)

    }
}
