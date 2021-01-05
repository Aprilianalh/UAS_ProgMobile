package com.example.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_daftar_alat_musik.*

class DaftarAlatMusik : AppCompatActivity() {
    // override untuk mengubah suatu fungsi pada parent
    // melakukan inisialisasi pada activity baru
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_alat_musik)
        // deklarasi variabel
        val data = createFac()
        // menampilkan daftar
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = AlatMusikAdapter(data) { onItem: AlatMusik ->
            onItemClicked(onItem)

        }
    }
        // menampilkan sesuatu ketika item diklik
        private fun onItemClicked(onItem: AlatMusik) {
            val showDetailActivityIntent = Intent(this, AlatMusikDetail::class.java)
            showDetailActivityIntent.putExtra(Intent.EXTRA_REFERRER, onItem.picture)
            showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.name)
            showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.description)
            showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.descDet)
            showDetailActivityIntent.putExtra(Intent.ACTION_PICK, onItem.web)
            startActivity(showDetailActivityIntent)
        }
        private fun createFac(): List<AlatMusik> {
            // menyimpan data object
            val rvList = ArrayList<AlatMusik>()
            rvList.add(
                AlatMusik(
                    R.drawable.gong,
                    "GONG",
                    "\t\t Gong merupakan sebuah alat musik pukul yang terkenal di Asia Tenggara dan Asia Timur. Gong ini digunakan untuk alat musik tradisional. Saat ini tidak banyak lagi perajin gong seperti ini. ",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Jawa Barat \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Gong termasuk ke dalam alat musik idiofon, yang maksudnya menghasilkan suara dari getaran keseluruhan alat musik itu sendiri. Gong memiliki suara rendah, cara memainkan alat musik Gong di tabuh dengan menggunakan pemukul kayu yang ujungnya di balut dengan menggunakan karet ataupun benang. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=jdGQtL0vnQg \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.rebab,
                    "REBAB",
                    "\t\t Rebab merupakan jenis alat musik senar yang dinamakan demikian paling lambat dari abad ke-8 dan menyebar melalui jalur-jalur perdagangan Islam yang lebih banyak dari Afrika Utara, Timur Tengah, bagian dari Eropa, dan Timur Jauh.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Jawa Barat \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Alat musik rebab dimainkan dengan cara digesek pada dawai yang terbentang di atas resonator hingga lehernya. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=dFs2DOrVyLg \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.kecapi,
                    "KECAPI",
                    "\t\t Kecapi merupakan sebuah alat musik dawai yang dipetik dengan leher (baik ditekan atau tidak) dan punggung dalam yang melingkupi rongga berlubang, biasanya dengan lubang suara atau lubang di badan.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Sulawesi Barat \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Kecapi dipeptik dengan satu tangan sedangkan tangan lainnya \"fret\" (menekan ke bawah) string pada fingerboard leher. Dengan menekan senar pada tempat fingerboard yang berbeda, pemain dapat memperpendek atau memperpanjang bagian dari senar yang bergetar, sehingga menghasilkan nada yang lebih tinggi atau lebih rendah. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=T6gzeAwZJ94 \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.kolintang,
                    "KOLINTANG",
                    "\t\t Kolintang merupakan alat musik yang terdiri dari barisan gong kecil yang diletakkan mendatar. Alat musik ini dimainkan dengan diiringi oleh gong tergantung yang lebih besar dan drum. Alat musik ini berkembang dari tradisi pemberian isyarat sederhana menjadi bentuk seperti sekarang dan kegunaannya bergantung pada peradaban yang menggunakannya.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Sulawesi Utara \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Kolintang termasuk alat musik idiofon karena mengeluarkan suara dari getarannya sendiri. Cara memainkan alat musik kolinang adalah dengan cara dipukul menggunakan stik khusus. Agar suara yang dihasilkan terdengar bagus maka di unjung stik biasanya diberi bantalan kain, seperti halnya alat pukul musik Gamelan. Stik yang digunakan tersebut biasanya terdiri dari tiga stick yang diberi nomor tersendiri. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=dy4gt-IYpKs \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.bonang,
                    "BONANG",
                    "\t\t Bonang merupakan salah satu alat musik yang termasuk ke dalam gamelan. Alat musik Bonang biasanya terbuat dari perunggu. Namun ada juga yang dipalsukan yakni biasanya terbuat dari besi dan dicampur dengan logam. Biasanya bonang digunakan untuk memperingati upacara adat setempat.",
                    "• Berasal Dari : \n" +
                            "\t\t -> Jawa Tengah \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Dalam memainkan  alat musik bonang terdapat tiga teknis dalam Karawitan jawa yaitu Memukul secara bersamaan dua nada yang ada pada bonang, Memukul satu persatu nada yang terdapat pada bonang, teknik ini disebut Mipil, dan Teknik terakhir dalam memainkan alat musik Bonang yaitu dengan cara imbal imbalan. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=JG1u4Wd-S1E \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.demung,
                    "DEMUNG",
                    "\t\t Demung merupakan salah satu anggota dari instrumen gamelan yang tergolong juga dengan keluarga balungan sama seperti saron. Bentuk dari demung ini juga sama dengan saron, bahkan terlihat mirip. Demung juga mempunyai dua versi yaitu pelog dan slendro.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Jawa Tengah \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Untuk memainkan Demung adalah dengan cara ditabuh yang sesuai dengan nada, atau ditabuh bergantian antara demung 1 dan demun 2. Hal tersebut akan menghasilkan jalinan nada yang beragam, akan tetapi mengikuti pola tertentu. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=3LQ9z99g2Pc \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.kendang,
                    "KENDANG",
                    "\t\t Kendang merupakan salah satu instrumen musik yang sering digunakan dalam berbagai kesempatan. Tak hanya musik tradisional, kendang, sebutan lain dari gendang, kini juga sudah diadaptasi dalam beberapa instrumen musik modern dan dipertontonkan secara nasional.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Jawa Tengah dan Jawa Barat \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Untuk memainkan kendang secara sederhana adalah dengan dipukul atau ditepak menggunakan telapak tangan. Bagian yang ditepak adalah sisi kanan dan kiri yang terbuat dari kulit hewan. Jangan asal pukul, ada beberapa teknik dasar yang bisa dilakukan untuk bisa menghasilkan bunyi yang indah dari kendang. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=R89YSNBNTV4 \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.angklung,
                    "ANGKLUNG",
                    "\t\t Angklung merupakan alat musik bernada ganda yang telah dikenal sejak abad ke 11. Nama angklung sendiri berasal dari Bahasa Sunda yaitu angkleung-angkleungan. Angklung terdiri dari dua suku kata yaitu angka yang berarti nada dan lung yang berarti pecah.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Jawa Barat \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Cara memegang angklung adalah pegang angklung dengan tangan kiri dan kemudian pegang simpul pertemuan dua tiang angklung vertikal dan horizontal (yang berada di tengah), sehingga angklung dipegang tepat di tengah-tengah. Cara membunyikan angklung adalah pegang ujung tabung dasar angklung (horizontal) dengan tangan kanan dan getarkan dengan getaran ke kiri dan ke kanan, dengan posisi angklung tetap tegak (horizontal). \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=gErTXRdDJ40 \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.sampe,
                    "SAMPE",
                    "\t\t Sampe merupakan alat musik petik tradisional Suku Dayak, yang dibuat dari bahan kayu pilihan dengan kualitas terbaik. Nama lainnya, disebut juga dengan Sape atau Sampe, yang dalam bahasa lokal Dayak, dapat diartikan ‘memetik dengan jari’. Alat musik sampe mempunyai ciri khas bentuk yang ramping, bertangkai kecil, mempunyai dua senar atau tali dari bahan plastik, sepanjang satu meter.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Kalimantan Timur \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Cara memetik sampe adalah dengan jari-jari kedua tangan, baik tangan kiri maupun tangan kanan. Petikan ini akan menghasilkan bunyi accord . Pemetik sampe memainkan lagu hanya dengan berdasarkan perasaan sehingga bunyi yang dihasilkan pun akan mengena sesuai dengan perasaan si pemetik. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=rr_P6UPC1es \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.aramba,
                    "ARAMBA",
                    "\t\t Aramba merupakan salah satu alat musik yang terbuat dari tembaga, kuningan, suasa dan nikel. Alat ini dimainkan oleh satu orang. Fungsi aramba berperan sebagai pembawa pola irama. Aramba memiliki  fungsi khusus bagi  masyarakat masa prasejarah hingga kini. Yaitu, merupakan benda keramat, makanya diperlakukan istimewa.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Sumatra Utara \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Alat musik ini dimainkan dengan cara dipukul dengan menggunakan suatu alat yang terbuat dari kayu dan dibentuk sedemikian rupa. Bagian tengah menonjol pada Aramba yang biasanya dipukul. Tidak hanya itu, apabila bagian sisi-sisinya dipukul, alat musik ini juga bisa menghasilkan suara yang berbeda. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=iUelqb0KgjQ \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.dolidoli,
                    "DOLI-DOLI",
                    "\t\t Doli-doli merupakan alat musik yang memiliki bentuk cukup mirip dengan gendang. Namun jika gendang memiliki dua sisi yang bisa dipukul, doli-doli hanya memiliki satu di bagian atas. Sedangkan bagian bawah alat musik ini berbentuk bulat. Jadi jika dilihat secara keseluruhan alat musik ini memiliki bentuk setengah lingkaran.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Sumatra Utara \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Untuk memainkan Doli Doli adalah dengan cara dipukul dengan menggunakan alat pemukul yang terbuat dari dua batang kayu. Alat musik Doll dapat dimainkan dengan 3 (tiga) teknik, yaitu  teknik suwena, teknik tamatam, dan teknik suwari. Teknik ketiga ini dimainkan mengikuti dari suasana pertunjukan di mana Doll ini dimainkan. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=TjGgua6CFSc \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.ganda,
                    "GANDA",
                    "\t\t Ganda atau kanda merupakan nama alat musik yang memainkannya dengan cara dipukul dan biasa kita kenal dengan gendang yang memiliki dua buah kulit menutupi kedua sisinya. Secara umum alat musik ini terbuat dari kayu yang dilubangi bagian tengahnya, lalu kedua ujung lubang dibalut dengan kulit binatang yang dikeringkan. Bentuk Ganda sendiri sangat mirip dengan gendang, perbedaannya hanya dalam segi ukuran saja.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Sulawesi Tengah \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Alat musik ganda ini dimainkan sama dengan kendang yaitu dengan cara menepuk menggunakan telapak tangan, memiliki jenis bunyi membranofon. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=5SHKI8X8pHw \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.talindo,
                    "TALINDO",
                    "\t\t Talindo merupakan alat musik jenis sitar berdawai satu karena hanya memiliki satu senar saja. Uniknya yaitu resonatornya terbuat dari tempurung kelapa, ya bahan yang sangat mudah kita jumpai. Popondi atau Tolindo terbuat dari kayu, tempurung kelapa, dan senar. Berbentuk busur seperti tanduk kerbau atau tanduk sapi yang bertumpu pada sebuah tempurung kelapa.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Sulawesi Selatan \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Alat musik talindo dimainkan dengan cara dipetik di bagian senarnya, lalu fungsi dari tempurung kelapa adalah sebagai lubang resonansi. Biasanya alat musik ini dimainkan secara tunggal setelah para petani merayakan pesta panen dan untuk mengisi waktu senggang bagi para remaja. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=wxByALlDcAw \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.gesogeso,
                    "GESO-GESO",
                    "\t\t Geso-Geso merupakan alat musik yang umumnya terbuat dari kayu khusus yang sifatnya kuat dan keras, ditambah dengan tempurung yang dilapisi dengan kulit binatang yang berfungsi sebagai pengeras bunyi. Awalnya alat musik tradisional ini memiliki nama asli yaitu Pa’ Geso’ Geso. Namun masyarakat lebih mudah menyebutkannya sebagai Geso-Geso.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Sulawesi Tengah \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Untuk memainkannya, hanya perlu menggesek alat musik tradisional ini dengan sebuah alat khusus yang terbuat dari bilah bambu dan tali, serat kayu, atau bisa juga dengan ijuk. Walaupun alat musik ini hanya memiliki satu buah dawai saja namun tetap bisa dimainkan. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=Qhzd-K-2l4I \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.lalove,
                    "LALOVE",
                    "\t\t Lalove merupakan alat musik tiup tradisional berbahan dasar bambu. Lalove berasal dari kata Love bahasa kaili yang dulunya kira-kira berarti suara yang mengalun, sayup-sayup atau menerawang dari kejauhan. Sebetulnya lalove adalah alat musik yang sakral, karena tidak semua orang boleh memainkan alat musik ini. Dan biasanya lalove digunakan untuk mengiri tarian tradisional Balia yang merupakan ritual penyembuhan suku Kaili di Sulawesi Tengah.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Sulawesi Tengah \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Lalove dimainkan dengan cara ditiup seperti suling dan jari-jari tangan dapat bergerak tutup buka pada lubang-lubangnya. Jari-jari tanga kiri (3 jari), telunjuk, jari tengah, dan jari manis menutup tiga lubang bagian atas, begitu pula pada 3 (tiga) lubang pada bagian bawah. Kadang-kadang ibu jari tangan kanan digunakan, apabila Lalove tersebut agak panjang sehingga posisi kaki agak terjulur ke depan. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=q8_sVtIPKoE \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.pupuiktanduak,
                    "PUPUIK TANDUAK",
                    "\t\t Pupuik tanduak merupakan sejenis alat musik tiup tradisional minangkabau yaitu pupuik tanduak. Terbuat dari tanduak kerbau bentuk melengkung bagian ujung (runcing) dibuang sedikit hingga berlobang ujung pangkalnya. Fungsi dari Pupuik Tanduak lebih dominan sebagai kode atau isyarat bagi masyarakat setempat. Alat ini dibunyikan sebagai penanda waktu subuh dan maghrib. Pupuik Tanduak juga digunakan sebagai isyarat adanya pengumuman dari pemuka kepada warga kampung.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Sumatra Barat \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Pupuik Tanduak ini dibunyikan dengan cara ditiup. Suara yang dihasilkannya mirip bunyi terompet yang melengking. Pupuik Tanduak termasuk alat musik sederhana yang memiliki nada tunggal. Karena itulah instrumen ini tidak digunakan sebagai aransemen pengiring suatu tarian atau lagu. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=DfXmAK_lJ7c \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.suling,
                    "SULING",
                    "\t\t Suling merupakan alat musik dari keluarga alat musik tiup kayu atau terbuat dari bambu. Suara suling berciri lembut dan dapat dipadukan dengan alat musik lainnya dengan baik. Suling modern untuk para ahli umumnya terbuat dari perak, emas atau campuran keduanya. Sedangkan suling untuk pelajar umumnya terbuat dari nikel-perak, atau logam yang dilapisi perak.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Jawa Barat \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Alat ini dimainkan dengan cara memegangnya menggunakan 2 tangan, menempelkan lubang tiup seruling ke mulut kemudian meniup seruling secara ritmis dan jari-jari tangan dapat bergerak tutup buka pada lubang-lubangnya. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=oXTodMwDhPA \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.siter,
                    "SITER",
                    "\t\t Siter merupakan alat musik petik di dalam gamelan Jawa. Siter memiliki 11 dan 13 pasang senar, dan dimasukan ke dalam kotak resonantor. Senar siter dimainkan dengan ibu jari, sedangkan jari lain digunakan untuk menahan getaran ketika senar lain dipetik, ini biasanya merupakan ciri khas instrumen gamelan.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Jawa Tengah \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Alat ini dimainkan dengan cara dipetik oleh ibu jari kiri dan kanan. Juga bisa memainkan melodi sendiri. Siter juga terdapat dua sisi, atas dan bawah. Cara memainkannya dengan menggunakan ibu jari sedang jari lainnya digunakan untuk menahan getaran saat senar yang lain dipetik. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=SHJIPUfF07Q \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.gonrang,
                    "GONRANG",
                    "\t\t Gonrang merupakan alat musik yang terbuat dari bahan kayu pilihan yang pada bagian tengah dihilangkan. Nama Gonrang dalam bahasa Indonesia memiliki arti yakni gendang. Gonrang terdiri dari beberapa instrumen yang setiap alat musiknya memiliki sebuah makna tersendiri. Alat musik ini memiliki sifat yang sangat sakral, karena biasanya digunakan untuk mengiringi upacara adat suku Simalungun.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Sumatra Utara \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Alat musik tradisional Gonrang ini dimainkan dengan cara dipukul menggunakan sebuah kayu. Biasanya, gonrang dijadikan musik tabuh yang dimainkan secara bersama – sama dengan alat musik tradisional khas Simalungun yang lainnya. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=VElpDaA6KTQ \n\n"
                )
            )
            rvList.add(
                AlatMusik(
                    R.drawable.garantung,
                    "GARANTUNG",
                    "\t\t Garantung merupakan pembawa melodi yang terbuat dari kayu dan memiliki lima bilah nada. Klasifikasi instrument ini termasuk ke dalam kelompok xylophone. Selain berperan sebagai pembawa melodi, juga berperan sebagai pembawa ritem variable pada lagu-lagu tertentu, dimainkan dengan cara mamalu (memukul 5 bilah nada). Garantung terdiri dari 7 wilahan yang digantungkan di atas sebuah kotak yang sekaligus sebagai resonatornya.",
                    "• \t Berasal Dari : \n" +
                            "\t\t -> Sumatra Utara \n\n"+
                            "• Cara Memainkan Alat Musik : \n"+
                            "\t\t -> Alat musik ini dimainkan dengan menggunakan dua buah stik untuk tangan kiri dan tangankanan. Sementara tangan kiri berfungsi juga sebagai pembawa melodi dan pembawa ritme, yaitu tangan kiri memukul bagian tangkai garantung dan wilahan sekaligus dalam memainkan sebuah lagu. \n\n"+
                            "• Untuk cara memainkan lebih detailnya dapat dilihat pada link berikut : ",
                    "https://www.youtube.com/watch?v=rBEJO2mLvS8 \n\n"
                )
            )
            // mengembalikan nilai secara langsung
            return rvList
    }
}
