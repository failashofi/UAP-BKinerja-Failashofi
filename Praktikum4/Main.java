package com.company;

public class Main {
    public static void main(String[] args) {
        DataDagang.dag = DataDagang.tambahDagang(new Dagang("Bakso Pak Sahid", "Bakso", 8000));
        DataDagang.dag = DataDagang.tambahDagang(new Dagang("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataDagang.dag = DataDagang.tambahDagang(new Dagang("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataDagang.dag = DataDagang.tambahDagang(new Dagang(DataDagang.in.nextLine(),DataDagang.in.nextLine(),DataDagang.in.nextDouble()));
        DataDagang.tampilData();
    }
}
