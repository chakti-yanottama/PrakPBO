/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bangunDatar;

import java.util.Scanner;

/**
 *
 * Chakti Yanottama
 * 21104410064/ TI b
 */
public class Main {
        public static void main(String[] args) {
        double panjang, lebar;
        double result;
            Scanner scanner = new Scanner(System.in);
            System.out.println("panjang :");
            panjang = scanner.nextDouble();
            
            System.out.println("Lebar : ");
            lebar = scanner.nextDouble();
            
            PersegiPanjang persegipanjang = new PersegiPanjang();
            persegipanjang.setLuas(panjang, lebar);//Menghitung Luas//
            
            System.out.println("Luas "+ persegipanjang.getLuas() );
    }
}
