package com.example.keuangan.Model;

public class Pendapatan {

    private int jumlah;
    private String kategory, rekening, date;
    private boolean status;

    public Pendapatan(int jumlah, String kategory, String rekening, String date, boolean status) {
        this.jumlah = jumlah;
        this.kategory = kategory;
        this.rekening = rekening;
        this.date = date;
        this.status = status;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getKategory() {
        return kategory;
    }

    public void setKategory(String kategory) {
        this.kategory = kategory;
    }

    public String getRekening() {
        return rekening;
    }

    public void setRekening(String rekening) {
        this.rekening = rekening;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
