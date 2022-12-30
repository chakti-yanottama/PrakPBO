/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package arrayOfObject;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * Chakti Yanottama
 * 21104410064/ TI b
 */
public class MainLaptop {
      public static void main(String[] args) {
         
          
          Laptop[] laptop = new Laptop[2] ;
         
         
          for (int i = 0; i < laptop.length; i++) {
              System.out.println("Model Laptop: ");
              Scanner sc = new Scanner (System.in);
              String brand = sc.next();
              
              laptop [i]= new Laptop();
              laptop [i].setBrand(brand);
              
              
              for (int j = 0; j < laptop.length; j++) {
                  
                  System.out.println("Output");
                  System.out.println(laptop[1].getBrand());
                  
              }
              
              
          }
    }
}
