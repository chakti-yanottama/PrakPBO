/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * Chakti Yanottama
 * 21104410064/ TI b
 */
public class ListArray {
    public static void main(String[] args) {
       ArrayList<String> listMakanan = new ArrayList<>();
       listMakanan.add("Bakso");
       listMakanan.add("Telor");
       listMakanan.add("Mie Ayam");
       
       
        System.out.println(listMakanan.get(0));
        
        ListIterator<String> iter = listMakanan.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
            
         listMakanan.remove(0);
         listIterator<string> iter = listMakanan.listIterator();
         while(iter.hasnext()){
             System.out.println(iter.next());
        }
    }

}
