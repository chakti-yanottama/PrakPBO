/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArrayKomponen;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Chakti Yanottama
 * 21104410064/ TI b
 */
public class MainKomponen {
    List <Komponen> listData;
    
    public static void main(String[] args) {
        new MainKomponen().tambahData();
    }

    private void tambahData() {
        listData = new ArrayList ();
        listData.add(new Komponen ("Mouse LG",10000000));
        listData.add(new Komponen ("Mouse ROG",20000000));
        
        for (int i = 0; i < listData.size(); i++) {
            System.out.println(listData.get(1).namaKomponen+""+"Harganya"+listData.get(1).harga); 
            
        }
    }
}
