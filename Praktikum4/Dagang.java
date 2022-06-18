package com.company;


public class Dagang {
    String namaDagang,namaProduk;
    double hargaMakanan;

    Dagang(String namaDagang, String namaProduk, double hargaMakanan){
        this.namaDagang   = namaDagang;
        this.namaProduk   = namaProduk;
        this.hargaMakanan = hargaMakanan;
    }

    public String getNamaDagang(){
        return namaDagang;
    }
    public void setNamaDagang(String namaDagang){
        this.namaDagang = namaDagang;
    }
    public String getNamaProduk(){
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    public double getHargaMakanan(){
        return hargaMakanan;
    }
    public void setHargaMakanan(double hargaMakanan){
        this.hargaMakanan = hargaMakanan;
    }
}
