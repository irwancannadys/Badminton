package com.example.badminton;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailDataListCustomerActivity extends AppCompatActivity {

    TextView name, date, keterangan, jumlahPemain;
    DataListCustomer dataListCustomer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_customer);

        name = findViewById(R.id.name);
        date = findViewById(R.id.date);
        keterangan = findViewById(R.id.keterangan);
        jumlahPemain = findViewById(R.id.jml_pemain);

        // cara get intent atau menangkap data dari activity sebelumnya
        dataListCustomer = (DataListCustomer) getIntent().getSerializableExtra("dataCustomer");
        //set data kedalam TextView yang sudah kita buat

        if (dataListCustomer != null) {
            name.setText(dataListCustomer.name);
            date.setText(dataListCustomer.date);
            keterangan.setText(dataListCustomer.keterangan);
            jumlahPemain.setText(dataListCustomer.jumlahPemain);
        }

    }
}
