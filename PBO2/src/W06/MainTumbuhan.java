/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package W06;

/**
 *
 * Chakti Yanottama
 * 21104410064/ TI b
 */
public class MainTumbuhan extends Tumbuhan{

    
    // => Dipanggil dengan dua parameter
    public MainTumbuhan() {
        System.out.println("Warnanya "+ warna);
    }
    
    @Override
    public String getWarna (){
        return super.getWarna();
    }
    // => Dipanggil dengan fungsi dan object pada class tumbuhan 
    public static void main(String[] args) {
        MainTumbuhan mainTumbuhan = new MainTumbuhan();
        mainTumbuhan.cetak();
        mainTumbuhan.setWarna("hijau");
        System.out.println(mainTumbuhan.getWarna());
    }
    
    @Override
    public void cetak(){
     System.out.println("Nama Bunga");
 
 
 }
  
    
}