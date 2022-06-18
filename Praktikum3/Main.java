/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktugas3;

import java.util.*;
class Baju{
    String jenis;
    int harga;
    int jumlah;

    public Baju(String a, int b){
        this.jenis = a;
        this.jumlah = b;
    }
    
    int bajuA= 100000;
    int bajuB = 125000;
    int bajuC = 175000;

    void hargaA(){
        if(jumlah > 100){
        harga = 95000;
        }else
        harga = bajuA;
    }
    void hargaB(){
        if (jumlah > 100){
        harga = 120000;
        }else
        harga = bajuB;
    }
    void hargaC(){
        if (jumlah > 100){
        harga = 160000;
        }else
        harga = bajuC;
    }

    void display(){
        if(jenis.equalsIgnoreCase("a")) {
            hargaA();
        }else if(jenis.equalsIgnoreCase("b")) {
            hargaB();
        }else if(jenis.equalsIgnoreCase("c")){
            hargaC();
        }

        System.out.println("Jenis yang anda beli    : " + jenis);
        System.out.println("Harga per buah          : " + harga);
        System.out.println("Total harga             : " + harga*jumlah);

    }
}

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        System.out.print("Baju yang akan anda beli bertipe : ");
        String jenis = scan.nextLine();
        System.out.print("Jumlah baju yang akan anda beli : ");
        int jumlah = scan.nextInt();

    Baju diskon = new Baju (jenis, jumlah);
    diskon.display();
    }
}

