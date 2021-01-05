package com.example.uas

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.webkit.JsResult
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AlatMusikYoutube : AppCompatActivity() {
    // menonaktifkan pemeriksaan lint khusus untuk class
    @SuppressLint("SetJavaScriptEnabled")

    // override untuk mengubah suatu fungsi pada parent
    // melakukan inisialisasi pada activity baru
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.youtube_view)
        val webView = findViewById<WebView>(R.id.youtubeView)
        val intentThatStartedThisActivity = intent

        if (intentThatStartedThisActivity.hasExtra(Intent.ACTION_VIEW)) {
            val webF = intentThatStartedThisActivity.getStringExtra(Intent.ACTION_VIEW)
            webView.settings.javaScriptEnabled = true
            webView.webViewClient = object : WebViewClient() {
                override fun onPageFinished(view: WebView, url: String) {
                    view.loadUrl("javascript:alert('Showing...')")
                }
            }
            // menampilkan objek seperti video dan lain-lain
            webView.webChromeClient = object : WebChromeClient() {
                // membuat pesan pada halaman web
                override fun onJsAlert(
                    view: WebView, url: String,
                    message: String,
                    result: JsResult
                ): Boolean {
                    Toast.makeText(this@AlatMusikYoutube, message, Toast.LENGTH_LONG).show()
                    result.confirm()
                    return true
                }
            }
            // memuat halaman web
            webView.loadUrl(webF.toString())
        }
    }
}
