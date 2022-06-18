package com.company;
import java.util.Scanner;

public class DataDagang {
        static Scanner in = new Scanner(System.in);
        static Dagang[] dag = new Dagang[0];

        public static Dagang[] tambahDagang(Dagang dagang){
            Dagang temp[]=new Dagang[DataDagang.dag.length+1];
            for (int i = 0; i < DataDagang.dag.length; i++){
                temp[i]=DataDagang.dag[i];
            }
            temp[DataDagang.dag.length]=dagang;
            return temp;
        }

        public static void tampilData(){
            for (Dagang mch1 : dag){
                System.out.println("---Dagangan UBFood---");
                System.out.println("Nama Dagangan   : "+mch1.getNamaDagang());
                System.out.println("Nama Produk     : "+mch1.getNamaProduk());
                System.out.println("Harga           : "+(int)mch1.getHargaMakanan());
            }
        }
        public static Dagang cariWarung (String nama){
            for (int i = 0; i < DataDagang.dag.length; i++){
                if (nama.equalsIgnoreCase(DataDagang.dag[i].getNamaDagang())){
                    return DataDagang.dag[i];
                }
            }
            return null;
        }
    }


