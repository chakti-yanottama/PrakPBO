/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Overload;

/**
 *
 * Chakti Yanottama
 * 21104410064/ TI b
 */
public class Main {
    public static void main(String[] args) {
        Pangkat objek = new Pangkat();
        
        System.out.println(objek.pangkat(3));
        System.out.println(objek.pangkat(2, 2));
        
        Pangkat constuctor = new Pangkat();
        System.out.println(constuctor);
        
       Pangkat contructor2 = new Pangkat("Chakti");
        System.out.println(contructor2);
        
    }
}
