package SuratKaisar;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String hurufdepan = input.nextLine();
        int geser = input.nextInt();
        System.out.println(konversi(hurufdepan,geser));
    }
    public static String konversi(String huruf, int geser){
        String enskripsi = "";
        char tempat;
        for(int i = 0; i < huruf.length(); ++i){
            tempat = huruf.charAt(i);
            if(tempat >= 'a' && tempat <= 'z'){
                tempat = (char)(tempat+geser);
                if(tempat > 'z'){
                    tempat = (char)(tempat - 'z' + 'a' - 1);
                }
                enskripsi = enskripsi + tempat;
            }
            else if(tempat >= 'A' && tempat <= 'Z'){
                tempat = (char)(tempat + geser);

                if(tempat > 'Z'){
                    tempat = (char)(tempat - 'Z' + 'A' - 1);
                }

                enskripsi = enskripsi + tempat;
            }
            else {
                enskripsi = enskripsi + tempat;
            }
        }
        return enskripsi;
    }
}
