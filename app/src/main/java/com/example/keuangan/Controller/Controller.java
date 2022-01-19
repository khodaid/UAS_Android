package com.example.keuangan.Controller;

import com.example.keuangan.Model.Pendapatan;

import java.util.ArrayList;

public class Controller {

    private static ArrayList<Pendapatan> p = new ArrayList<>();

    public static ArrayList<Pendapatan> getP() {
        return p;
    }

    public static void add(String cat, String rek, String date, int jml, boolean status){
        p.add(new Pendapatan(jml, cat, rek, date, status));
    }
}
