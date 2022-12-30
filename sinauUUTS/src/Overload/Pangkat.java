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
public class Pangkat {
    double result;
    
    public double pangkat(double b){
        return result = Math.pow(2, b);
        
    }
    public double pangkat(double a, double b){
        return result = Math.pow(a, b);
    }
    
    
//  constructo
    public Pangkat() {
        System.out.println("Constructor");
    }

    public Pangkat(String nama) {
        System.out.println("Constructor"+nama);
    }
    
    
}

