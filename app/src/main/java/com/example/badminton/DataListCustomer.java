package com.example.badminton;

import java.io.Serializable;

public class DataListCustomer implements Serializable {

    public String name;
    public String date;
    public String keterangan;
    public String jumlahPemain;

    public DataListCustomer(String name, String date, String keterangan, String jumlahPemain) {
        this.name = name;
        this.date = date;
        this.keterangan = keterangan;
        this.jumlahPemain = jumlahPemain;
    }
}
