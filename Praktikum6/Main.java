/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;

import java.util.ArrayList;
import static praktikum6.MahasiswaFilkom.jumlah1;
import static praktikum6.Manajer.jumlah3;
import static praktikum6.Manusia.jumlah;
import static praktikum6.Pekerja.jumlah2;

/**
 *
 *  Nama    = Failashofi Nabila
    NIM     = 215150601111020
 */
public class Main {
    public static void main(String[] args) {
	Manusia man1 = new Manusia("Jeandra Galuh", "3510125649090595", true, true);
        Manusia man2 = new Manusia("Ratna Anindia", "3510125649170797", false, true);
        Manusia man3 = new Manusia("Hema Gala", "3510125649251095", true, false);
            ArrayList<Manusia> output = new ArrayList<Manusia>();
                output.add(man1);
                output.add(man2);
                output.add(man3);
        System.out.println("=============== DAFTAR MANUSIA ===============");
            for(int i=0;i<output.size();i++){
                System.out.println(output.get(i).toString());
        }
        System.out.println("==============================================");

        MahasiswaFilkom mhs1 = new MahasiswaFilkom("Hadian Putra", "3510125649240103", true, false, "215150201111020", 3.4);
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Khail Adnan", "3510125649280900", true, false, "185150400111032", 4.0);
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Raisa Ranggo", "3510125649170300", false, false, "185150600111054", 2.0);
            ArrayList<MahasiswaFilkom> output1 = new ArrayList<MahasiswaFilkom>();
                output1.add(mhs1);
                output1.add(mhs2);
                output1.add(mhs3);
        System.out.println();
        System.out.println("=========== DAFTAR MAHASISWA FILKOM ===========");
            for(int i=0;i<output1.size();i++){
                System.out.println(output1.get(i).toString());
            }
        System.out.println("==============================================");

        Pekerja pkj1 = new Pekerja("Genta Ganendra", "3510125649140300", true, true, 7, 22, "1051854769");
        Pekerja pkj2 = new Pekerja("Adinda Valie", "3510125649141200", false, false, 9, 28, "5021857564");
        Pekerja pkj3 = new Pekerja("Sabiru Wistara", "3510125649050400", true, true, 10, 26, "6031853876");
            ArrayList<Pekerja> output2 = new ArrayList<Pekerja>();
                output2.add(pkj1);
                output2.add(pkj2);
                output2.add(pkj3);
        System.out.println();
        System.out.println("=============== DAFTAR PEKERJA ===============");
            for(int i=0;i<output2.size();i++){
                System.out.println(output2.get(i).toString());
            }
        System.out.println("==============================================");

        Manajer mnj1 = new Manajer("Kanala Adinata", "3510125649160700", false, false, 9, 21,"2141852543", 1500);
        Manajer mnj2 = new Manajer("Aidan Trisakti", "3510125649290499", true, false, 8, 20,"4061851295", 1800);
        Manajer mnj3 = new Manajer("Ashlan Ramadhan", "3510125649190399", true, true, 6, 21,"3011856627", 1600);
            ArrayList<Manajer> output3 = new ArrayList<Manajer>();
                output3.add(mnj1);
                output3.add(mnj2);
                output3.add(mnj3);
        System.out.println();
        System.out.println("=============== DAFTAR MANAJER ===============");
            for(int i=0;i<output3.size();i++){
                System.out.println(output3.get(i).toString());
            }
        System.out.println("==============================================");
        
        System.out.println();
        System.out.println("========= JUMLAH MASING-MASING KELAS =========");
        System.out.println("Manusia             : " + jumlah);
        System.out.println("Mahasiswa Filkom    : " + jumlah1);
        System.out.println("Pekerja             : " + jumlah2);
        System.out.println("Manajer             : " + jumlah3);
        System.out.println("---------------------------");
        System.out.println("Total               : " + (jumlah + jumlah1 + jumlah2 + jumlah3));
        System.out.println("==============================================");

    
    

    }
}
