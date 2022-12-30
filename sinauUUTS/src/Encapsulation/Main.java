/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Encapsulation;

/**
 *
 * Chakti Yanottama
 * 21104410064/ TI b
 */
public class Main {
 String namadepan, namabelakang;

    public String getNamadepan() {
        return namadepan;
    }

    public void setNamadepan(String namadepan) {
        this.namadepan = namadepan;
    }

    public String getNamabelakang() {
        return namabelakang;
    }

    public void setNamabelakang(String namabelakang) {
        this.namabelakang = namabelakang;
    }

    public static void main(String[] args) {
        Main objek1 = new Main();
        objek1.setNamadepan("Chakti");
        System.out.println(objek1.getNamadepan());
    }
    
    }
 

