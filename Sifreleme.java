/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sifreleme;

/**
 *
 * @author SONY
 */
import java.util.Scanner;

public class Sifreleme {

    /**
     * @param args the command line arguments
     */
    public static void dogrusalSifreleme(int a, int b, int number, int mod) {

        System.out.println(((a * number) + b) % mod);

    }

    public static void dogurusalSifreCoz(int a, int b, int number, int mod) {
        int aMinus = 0;
        for (int i = 1; i < mod; i++) {
            if ((i * a) % mod == 1) {
                aMinus = i;
            }
        }
        System.out.println(aMinus * (number - b) % 29);

    }

    public static void sezar(int value, int number, int mod) {
        number += value;
        int result = number % mod;
        if (result == 0) {
            result = mod;
        }
        System.out.println(result);

    }

    public static void sezarCoz(int value, int number, int mod) {
        //int gap = Math.abs(number - value);
        int result = 0;
        if (value > number) {
            for (int i = 0; i < value; i++) {
                //--number;
                if (number == 0) {
                    number = 29;

                }
                --number;
            }
            result = number % mod;
            if (result == 0) {
                result = mod;
            }

        } else {
            number -= Math.abs(value);
            result = number % mod;
            if (result == 0) {
                result = mod;
            }
        }

        System.out.println(result);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            System.out.println("Enter a number: ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            //sifreCoz(6, 5, number);
            //dogrusalSifreleme(4, 9, number,31);
            sezarCoz(5, number, 29);
            if (number == 0) {
                break;
            }
        }
    }

}
