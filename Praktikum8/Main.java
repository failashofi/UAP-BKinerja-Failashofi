/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum8;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 * Nama = Failashofi Nabila
 * NIM  = 215150601111020
 * Kelas= PTI-B
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Magician mag = new Magician(10, 60, 100);
        Healer heal = new Healer(10, 10, 70);
        Warrior war = new Warrior(30, 25, 80);
        Titan ti = new Titan(0, 45, 200);
 
        System.out.println("Selamat datang di game Defend FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = input.nextLine();
        int choose = 0;
        do{
            try{
                System.out.println("Silahkan pilih karakter yang anda inginkan :");
                String[] Role = {"1. Magician", "2. Healer", "3. Warrior"};
                for(String Hero : Role) {
                    System.out.println(Hero);
                }
                choose = input.nextInt();
                
                if (choose < 1 || choose > 3) throw new NumberFormatException();
                }catch (Exception e){
                if(e instanceof NumberFormatException) {
                    System.out.println("Silahkan masukan angka 1 - 3");
                }
                else{
                    System.err.println("Silahkan masukkan angka !!!");
                    input.next();
                }
             }
        }while (choose == 0);
            System.out.println("Selamat datang, " + nama + " !");
 
        switch(choose){
            case 1 :
                int i = 1;
                mag.info();
                while(mag.getHp() != 0 && ti.getHp() != 0){
                    System.out.println("==============" + " TURN " + i + " ==============");
                    
                    if(mag.attack()){
                        ti.receiveDamage(mag.getAttack());
                    }
                    if(ti.attack()){
                        mag.receiveDamage(ti.getAttack()); 
                    }
                    System.out.println("Enemy's HP\t: " + ti.getHp());
                    System.out.println(nama +"'s HP     \t: " + mag.getHp());
                    i++;
                }
                System.out.println("====================================");
                if(ti.getHp() == 0) {
                System.out.println(nama + " menang\n");
                }
                if(mag.getHp() == 0) {
                System.out.println("Titan menang\n");
                }
                System.out.println("============== PLAYER ==============");
                mag.info();
                System.out.println();
                System.out.println("=============== MUSUH ==============");
                ti.info();
            break;
 
            case 2 :
                int j = 1;
                heal.info();
                while(heal.getHp() != 0 && ti.getHp() != 0){
                System.out.println("==============" + " TURN " + j + " ==============");
                if(j % 2 == 0) {
                heal.Heal();
                }
                if(heal.attack()){
                ti.receiveDamage(ti.getAttack());
                }
                if(ti.attack()){
                heal.receiveDamage(ti.getAttack()); 
                }
                System.out.println("Enemy's HP\t: " + ti.getHp());
                System.out.println(nama +"'s HP     \t: " + heal.getHp());
                j++;
                }
                System.out.println("====================================");
                if(ti.getHp() == 0) System.out.println(nama + " menang\n");
                if(heal.getHp() == 0) System.out.println("Titan menang\n");
                System.out.println("============== PLAYER ==============");
                heal.info();
                System.out.println();
                System.out.println("=============== MUSUH ==============");
                ti.info();
            break;
 
            case 3 :
                int k = 1;
                war.info();
                while(war.getHp() != 0 && ti.getHp() != 0){
                System.out.println("==============" + " TURN " + k + " ==============");
                if(war.attack()){
                ti.receiveDamage(war.getAttack());
                }
                if(ti.attack()){
                war.receiveDamage(ti.getAttack()); 

                }
                System.out.println("Enemy's HP\t: " + ti.getHp());
                System.out.println(nama +"'s HP     \t: " + war.getHp());
                k++;
                }
                System.out.println("====================================");
                if(ti.getHp() == 0) System.out.println(nama + " menang\n");
                if(war.getHp() == 0) System.out.println("Titan menang\n");
                System.out.println("============= PLAYER ==============");
                war.info();
                System.out.println();
                System.out.println("=============== MUSUH ==============");
                ti.info();
                break;
            }
    }
    
}
