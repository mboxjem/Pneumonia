package com.pneumonia.detection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView1 = findViewById(R.id.cardView1);
        cardView2 = findViewById(R.id.cardView2);
        cardView3 = findViewById(R.id.cardView3);
        cardView4 = findViewById(R.id.cardView4);
        cardView5 = findViewById(R.id.cardView5);
        cardView6 = findViewById(R.id.cardView6);

        button = findViewById(R.id.button);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("Image", R.drawable.img1); // for image
                intent.putExtra("Title", "Pengertian Pneumonia"); //for text
                intent.putExtra("Desc",
                        "\tPneumonia atau paru-paru basah adalah peradangan jaringan di salah satu atau kedua paru-paru yang biasanya disebabkan oleh infeksi. Pada saat menderita pneumonia, sekumpulan kantong-kantong udara yang kecil di ujung saluran pernapasan dalam paru-paru akan bengkak dan penuh cairan.\n" +
                        "\n" +
                        "\tGejala umum pneumonia meliputi batuk, demam dan kesulitan bernapas. Bronkopneumonia, pneumonia lobular, dan pneumonia bilateral, ketiganya merujuk pada penyakit yang sama dengan penyebab dan pengobatan yang sejenis."); //for text
                startActivity(intent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("Image", R.drawable.img2); // for image
                intent.putExtra("Title", "Penderita Pneumonia di Indonesia"); //for text
                intent.putExtra("Desc",
                        "\tPneumonia merupakan penyebab kematian anak-anak tertinggi di dunia. Badan Kesehatan Dunia (WHO) memperkirakan terdapat sekitar 1,1 juta orang anak di dunia yang meninggal tiap tahun akibat penyakit ini.\n" +
                        "\n" +
                        "\tIndonesia sendiri menduduki peringkat ke-8 terbesar di dunia terkait angka kematian anak-anak karena pneumonia. Pada tahun 2008 saja, penyakit ini telah merenggut sekitar 38.000 jiwa anak Indonesia.\n" +
                        "\n" +
                        "\tPneumonia paling umum ditemukan dan berpotensi untuk bertambah parah pada bayi dan anak-anak (terutama, di bawah usia dua tahun), manula (terutama, di atas 65 tahun), orang dengan masalah kesehatan lain, seperti penyakit paru-paru atau sistem kekebalan tubuh yang lemah, serta perokok. Mereka cenderung memiliki risiko tinggi untuk memerlukan perawatan di rumah sakit.\n" +
                        "\n" +
                        "\tJika ada gejala pneumonia yang Anda alami, konsultasi kepada dokter karena mungkin Anda akan membutuhkan rontgen dada atau pemeriksaan lebih lanjut untuk memastikan diagnosis Anda. Segera cari bantuan medis jika Anda mengalami gejala yang parah seperti napas terengah-engah, dada sakit, atau kebingungan."); //for text
                startActivity(intent);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("Image", R.drawable.img3); // for image
                intent.putExtra("Title", "Penyebab dan Pencegahan Pneumonia"); //for text
                intent.putExtra("Desc",
                        "\tBakteri streptococcus pneumoniae sering menyebabkan pneumonia. Pneumonia sendiri juga bisa diakibatkan oleh virus dan bakteri lain. Penyakit ini dapat dicegah dengan menjaga kebersihan dan pola hidup sehat.\n" +
                        "\n" +
                        "\tTidak merokok juga akan menjauhkan Anda dari pneumonia karena rokok dapat merusak paru-paru dan mempertinggi risiko infeksi. Vaksin PCV (Pneumococcal Conjugate Vaccine) dan vaksin influenza sangat dianjurkan bagi orang yang berisiko tinggi terkena pneumonia."); //for text
                startActivity(intent);
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("Image", R.drawable.img4); // for image
                intent.putExtra("Title", "Pengobatan dan Komplikasi Pneumonia"); //for text
                intent.putExtra("Desc",
                        "\tPneumonia ringan umumnya bisa ditangani dengan antibiotik yang diresepkan dokter, istirahat, dan banyak minum tanpa perlu dirawat di rumah sakit. Orang dengan kondisi fisik yang biasanya sehat akan pulih secara normal.\n" +
                        "\n" +
                        "\tJika pengidap pneumonia memiliki penyakit lain, kondisinya bisa bertambah parah dan membutuhkan perawatan di rumah sakit. Kesehatan dan usia penderita akan memengaruhi risiko komplikasi akibat pneumonia. Beberapa komplikasi yang dapat berakibat fatal, antara lain infeksi atau bakteri dalam darah (septikemia) dan abses (pengumpulan nanah) pada paru-paru.\n"); //for text
                startActivity(intent);
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("Image", R.drawable.img5); // for image
                intent.putExtra("Title", "Gejala Pneumonia"); //for text
                intent.putExtra("Desc",
                        "\tGejala pneumonia atau paru-paru basah bisa muncul secara tiba-tiba (setelah satu atau dua hari) atau secara perlahan-lahan dalam waktu beberapa hari.\n" +
                        "\n" +
                        "\tPneumonia memiliki bermacam-macam gejala yang mungkin mirip dengan infeksi saluran pernapasan, seperti bronkitis akut.\n" +
                        "\n" +
                        "\tGejala umum yang biasanya muncul adalah:\n" +
                        "\n" +
                        "- Demam, berkeringat, dan menggigil.\n" +
                        "\n" +
                        "- Batuk kering atau batuk dengan dahak kental berwarna kuning atau hijau dan disertai darah.\n" +
                        "\n" +
                        "- Kesulitan bernapas berupa napas terengah-engah dan pendek serta mengalami sesak napas walau sedang beristirahat.\n" +
                        "\n" +
                        "- Rasa sakit di dada saat menarik napas dalam atau batuk.\n" +
                        "\n" +
                        "- Detak jantung yang cepat.\n" +
                        "\n" +
                        "- Nyeri pada sendi-sendi.\n" +
                        "\n" +
                        "- Kehilangan nafsu makan.\n" +
                        "\n" +
                        "- Mual dan muntah.\n" +
                        "\n" +
                        "- Sakit kepala.\n" +
                        "\n" +
                        "\tJika Anda mengalami gejala pneumonia, periksakanlah diri Anda ke dokter. Tetapi segera cari bantuan medis jika yang Anda alami adalah gejala yang parah, terutama napas terengah-engah, demam yang tidak kunjung turun, sakit dada, atau kebingungan."); //for text
                startActivity(intent);
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("Image", R.drawable.img6); // for image
                intent.putExtra("Title", "Penyebab Pneumonia"); //for text
                intent.putExtra("Desc",
                        "\tPenyebab pneumonia atau paru-paru basah pada umumnya adalah infeksi akibat bakteri, tapi juga bisa diakibatkan oleh banyak virus.\n" +
                        "\n" +
                        "\tLokasi penularan juga bisa memengaruhi jenis kumannya. Misalnya, kuman penyebab pneumonia yang didapat dari lingkungan umum berbeda dengan pneumonia yang didapat dari rumah sakit.\n"); //for text
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DataActivity.class);
                startActivity(intent);
            }
        });
    }
}