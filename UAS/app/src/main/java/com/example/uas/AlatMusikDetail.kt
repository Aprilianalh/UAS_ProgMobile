package com.example.uas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_alat.*

class AlatMusikDetail : AppCompatActivity() {
    // override untuk mengubah suatu fungsi pada parent
    // melakukan inisialisasi pada activity baru
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_alat)
        val intentThatStartedThisActivity = intent
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            val imgF = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_REFERRER, 0)
            val nameF =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            val deskF =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            val deskS =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            val webF =
                intentThatStartedThisActivity.getStringExtra(Intent.ACTION_PICK)
            image_detail.setImageResource(imgF)
            name_detail.text = nameF
            desc_detail.text = deskF
            short_detail.text = deskS
            youtube_detail.text = webF
            youtube_detail.setOnClickListener{
                openWeb(webF.toString())
            }
        }
    }

    // membuka situs web dari url yang dituliskan
    private fun openWeb(url: String) {
        val showWebActivity = Intent(this, AlatMusikYoutube::class.java)
        showWebActivity.putExtra(Intent.ACTION_VIEW, url)
        startActivity(showWebActivity)
    }
}
