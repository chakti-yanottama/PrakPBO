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
public class Tumbuhan {
    int  jumlahBiji;
    private String nama;
    protected String warna;

    public int getJunlahBiji() {
        return jumlahBiji;
    }

    public void setJunlahBiji(int junlahBiji) {
        this.jumlahBiji = junlahBiji;
    }

    private String getNama() {
        return nama;
    }

    private void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    
 void cetak (){
     System.out.println("Nama Tumbuhan : ");
 }
    public Tumbuhan() {
        System.out.println("constructor kosong di class tumbuhan ");
    }

    public Tumbuhan(int junlahBiji, String nama) {
        System.out.println("constructor 2 parameter di class tumbuhan");
    }    

}
