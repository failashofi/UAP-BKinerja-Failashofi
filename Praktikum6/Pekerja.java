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
public class Pekerja extends Manusia {
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;
    static int jumlah2 = 0;

    public Pekerja(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP) {
        super(nama, NIK, jenisKelamin, menikah);
        this.gaji = gaji;
        this.bonus = bonus;
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji(){
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja(){
        return jamKerja;
    }
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja(){
        return hariKerja;
    }
    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public double getGajii(){
        double getGajii = (getHariKerja() * getJamKerja() * 15);
        return getGajii;
    }

    public double getBonuss(){
        double bonuslembur = ((getHariKerja() / 7) * 7 + (getHariKerja() % 7)) * (getJamKerja() - 7) * 15;
        double bonuslibur = ((getHariKerja() / 7) * 2 * getJamKerja()  * 20);
        if (getJamKerja() <= 7 ){
            return bonuslibur;
        } else {
            return bonuslembur + bonuslibur;
        }
    
    }

    public String getStatus(){
        String kantor = "";
        String dep = "";
        String cab;
        
        switch (NIP.substring(0,1)){
            case "1" :
                    kantor = "Mondstadt";
                break;
            case "2" :
                    kantor = "Liyue";
                break;
            case "3" :
                    kantor = "Inazuma";
                break;
            case "4" :
                    kantor = "Sumeru";
                break;
            case "5" :
                    kantor = "Fontaine";
                break;
            case "6" :
                    kantor = "Natlan";
                break;
            case "7" :
                    kantor = "Snezhnaya";
                break;
        }
        cab = " cabang ke- " + (NIP.substring(2,3));
        
        
        switch (NIP.substring(6,7)){
            case "1" :
                    dep = "Pemasaran";
                break;
            case "2" :
                    dep = "Humas";
                break;
            case "3" :
                    dep = "Riset";
                break;
            case "4" :
                    dep = "Teknologi";
                break;
            case "5" :
                    dep = "Personalia";
                break;
            case "6" :
                    dep = "Akademik";
                break;
            case "7" :
                    dep = "Administrasi";
                break;
            case "8" :
                    dep = "Operasional";
                break;
            case "9" :
                    dep = "Pembangunan";
                break;
        }
        return dep + ", "+ kantor + cab;
    }
    

    public void totalPekerja(){
        System.out.println(jumlah2);
    }
    public String toString(){
        jumlah2++;
        String pattern = "##.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return
                "\nNama             : " + getNama()+
                "\nNIK              : " + getNIK()+
                "\nJenis Kelamin    : " + (getJenisKelamin()?"Laki-laki" : "Perempuan") +
                "\nPendapatan       : " + (getPendapatan() + getGajii() + getBonuss()) + "$" +
                "\nBonus            : " + getBonuss()+ "$" +
                "\nGaji             : " + getGajii()+ "$" +
                "\nStatus           : " + getStatus();
                

    }
}
