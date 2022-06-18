/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7;

/**
 *
 * @author LENOVO
 */
public class Main {
   public static void main(String[] args) {

            PegawaiTetap p1 = new PegawaiTetap("Failashofi", "3510124142985476", 9000000);
            PegawaiTetap p2 = new PegawaiTetap("Khail Adnan", "3510124142739828", 2000000);
            PegawaiTetap p3 = new PegawaiTetap("Zidane Hamizan", "3510124142156302", 5400000);
            System.out.println(p1.toString());
            System.out.println(p2.toString());
            System.out.println(p3.toString());

            PegawaiHarian ph1 = new PegawaiHarian("Hananta", "3510124142592749", 8500, 40);
            PegawaiHarian ph2 = new PegawaiHarian("Jiandra", "3510124142119204", 5000, 45);
            PegawaiHarian ph3 = new PegawaiHarian("Shaka", "3510124142140300", 30000, 30);
            System.out.println(ph1.toString());
            System.out.println(ph2.toString());
            System.out.println(ph3.toString());

            Sales s1 = new Sales("Raisa", "3510124142862593", 50, 50000);
            Sales s2 = new Sales("Giani", "3510124142193765", 45, 60000);
            Sales s3 = new Sales("Nadira", "3510124142038729", 90, 50000);
            System.out.println(s1.toString());
            System.out.println(s2.toString());
            System.out.println(s3.toString());
        } 
}
