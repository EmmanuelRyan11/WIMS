package com.earthsky.wims.ui.kategori.afiliasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.earthsky.wims.R;

public class KategoriAfiliasi extends AppCompatActivity {

    //kemungkinan gk dipake karena double (yang detail afiliasi sudah ada yg di navigation drawer utama)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_afiliasi);

    }
}