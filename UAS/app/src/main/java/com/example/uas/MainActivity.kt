package com.example.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var mToggle : ActionBarDrawerToggle
    // override untuk mengubah suatu fungsi pada parent
    // melakukan inisialisasi pada activity baru
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // memunculkan tombol burger menu
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // untuk toggle open dan close navigation
        mToggle = ActionBarDrawerToggle(this, drawer_layout, R.string.open, R.string.close)

        // tambahkan mToggle ke drawer_layout sebagai pengendali open dan close drawer
        drawer_layout.addDrawerListener(mToggle)
        mToggle.syncState()

        // menghandle click navigation menunya
        nav_view.setNavigationItemSelectedListener(this)
    }

    // memilih item dari menu opsi
    override fun onOptionsItemSelected(item: android.view.MenuItem): Boolean {
        return mToggle.onOptionsItemSelected(item)
    }

    // menangani klik item tampilan navigasi
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val i = Intent()
        when (item.itemId) {
            R.id.daftarAlatMusik -> {
                i.setClass(this, DaftarAlatMusik::class.java)
                startActivity(i)
            }
            R.id.profilAplikasi -> {
                i.setClass(this, ProfilAplikasi::class.java)
                startActivity(i)
            }
        }
        // wadah top-level untuk konten jendela
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
