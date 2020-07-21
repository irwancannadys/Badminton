package com.example.badminton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<DataListCustomer> data = new ArrayList<>();
        data.add(new DataListCustomer("Irwan Cannady", "21 Agustus 2020", "Saya bermain di hari jumat jam 9 malam", "jumlah pemain saya 8 orang"));
        data.add(new DataListCustomer("Abdul", "2 Agustus 2020", "Saya bermain di hari jumat jam 9 malam", "jumlah pemain saya 8 orang"));
        data.add(new DataListCustomer("Joko", "1 Agustus 2020", "Saya bermain di hari jumat jam 9 malam", "jumlah pemain saya 8 orang"));
        data.add(new DataListCustomer("Patrick", "10 Agustus 2020", "Saya bermain di hari jumat jam 9 malam", "jumlah pemain saya 8 orang"));
        data.add(new DataListCustomer("Ryan", "24 Agustus 2020", "Saya bermain di hari jumat jam 9 malam", "jumlah pemain saya 8 orang"));
        data.add(new DataListCustomer("Hana Team", "26 Agustus 2020", "Saya bermain di hari jumat jam 9 malam", "jumlah pemain saya 8 orang"));
        data.add(new DataListCustomer("Indonesia Team ", "16 Agustus 2020", "Saya bermain di hari jumat jam 9 malam", "jumlah pemain saya 8 orang"));

        recyclerView = findViewById(R.id.rv_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ListAdapter listAdapter = new ListAdapter(data, new ListAdapter.HandleClick() {
            @Override
            // cara pindah activity melalui onclick
            public void setClick(DataListCustomer dataListCustomer) {
                // set route atau tujuan kemana kita akan pindah
                Intent intent = new Intent(getApplicationContext(), DetailDataListCustomerActivity.class);
                // set data/packing data yang akan kita bawa ke activity berikutnya
                intent.putExtra("dataCustomer", (Serializable) dataListCustomer); // key nya "dataCustomer"
                // setelah siap saatnya kita start
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(listAdapter);

    }
}