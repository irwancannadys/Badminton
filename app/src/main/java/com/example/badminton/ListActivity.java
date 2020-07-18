package com.example.badminton;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<DataListCustomer> data = new ArrayList<>();
        data.add(new DataListCustomer("Irwan Cannady", "21 Agustus 2020"));
        data.add(new DataListCustomer("Abdul", "2 Agustus 2020"));
        data.add(new DataListCustomer("Joko", "1 Agustus 2020"));
        data.add(new DataListCustomer("Patrick", "10 Agustus 2020"));
        data.add(new DataListCustomer("Ryan", "24 Agustus 2020"));
        data.add(new DataListCustomer("Hana Team", "26 Agustus 2020"));
        data.add(new DataListCustomer("Indonesia Team ", "16 Agustus 2020"));

        recyclerView = findViewById(R.id.rv_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ListAdapter listAdapter = new ListAdapter(data);
        recyclerView.setAdapter(listAdapter);

    }
}
