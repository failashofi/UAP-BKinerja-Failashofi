/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;

import java.text.DecimalFormat;

/**
 *
 * @author LENOVO
 */
public class Manajer extends Pekerja{
    public int lamaKerja;
    static int jumlah3 = 0;

    public Manajer(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP, int lamaKerja) {
        super(nama, NIK, jenisKelamin, menikah, jamKerja, hariKerja, NIP);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja(){
        return lamaKerja;
    }
    public void setLamaKerja(int jamKerja) {
        this.lamaKerja = lamaKerja;
    }
    public double bonusManajer(){
        return getBonuss() * 0.30;
    }
    public double getTunjangan(){
        if (getMenikah() == true && getJenisKelamin() == true){
            return 25 + 15;
        } else if (getMenikah() == true && getJenisKelamin() == false){
            return 20 + 15;
        } else {
            return 15 + 15;
        }
    }
    public void totalManajer(){
        System.out.println(jumlah3);
    }

    public String toString(){
        jumlah3++;
        String pattern = "##.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return
                "\nNama             : " + getNama()+
                "\nNIK              : " + getNIK()+
                "\nJenis Kelamin    : " + (getJenisKelamin()?"Laki-laki" : "Perempuan") +
                "\nPendapatan       : " + (getBonuss() + getGajii() + getTunjangan()) + "$" +
                "\nBonus            : " + (getBonuss()) + "$" +
                "\nGaji             : " + getGajii()+ "$" +
                "\nStatus           : " + getStatus() +
                "\nLama Kerja       : " + getLamaKerja()+ " hari";

    }


}
