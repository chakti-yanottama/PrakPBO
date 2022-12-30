/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TokoBuku;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * Chakti Yanottama
 * 21104410064/ TI b
 */
public class MainTokoBuku extends  TokoBuku {
    
private static final Scanner scanner = new Scanner(System.in);
        
//=> Kegunaan super perintah khusus untuk mengakses parent class. 
//    Perintah ini biasanya dipakai untuk mengakses method yang tertimpa 
//    (overridden) atau constructor milik parent class. Kata super sendiri 
//    berasal dari superclass yang menjadi sebutan lain dari parent class.
    @Override
    public String getJudul() {
        return super.getJudul();
    }

    @Override
    public void setJudul(String judul) {
        super.setJudul(judul);
    }

    @Override
    public String getNama_pengarang() {
        return super.getNama_pengarang();
    }

    @Override
    public void setNama_pengarang(String nama_pengarang) {
        super.setNama_pengarang(nama_pengarang);
    }

    @Override
    public String getPenerbit() {
        return super.getPenerbit();
    }

    @Override
    public void setPenerbit(String penerbit) {
        super.setPenerbit(penerbit);
    }

    @Override
    public int getTahun_cetak() {
        return super.getTahun_cetak();
    }

    @Override
    public void setTahun_cetak(int tahun_cetak) {
        super.setTahun_cetak(tahun_cetak);
    }

    @Override
    public String getKategori() {
        return super.getKategori();
    }

    @Override
    public void setKategori(String kategori) {
        super.setKategori(kategori);
    }
    
    public static void main(String[] args) {
        

        
//        memesan array menggunakan 3 dimensi dengan type data yang dibutuhkan untuk outputan 
        String[] judul = new String[3];
        String[] nama_pengarang = new String[3]; // => Penamaan objek disesuaikan dengan nama Data
        String[] penerbit = new String[3];          // yang akan di inputkan user    
        int [] tahun_cetak = new int [3];
        String[] kategori = new String[3];
        
//      mengambil fungsi pada class induk TokoBuku
        TokoBuku tokoBuku = new TokoBuku();
        
//      Inputan User 
         System.out.println(" ===== Selamat Datang di Aplikasi Toko Buku =====\n");
         System.out.println("Silahkan User Memasukkan Data Buku : \n");
         
//      menggunakan perulangan for untuk inputan yang sama data 3x
//          => Untuk memasukkan data user menggunakan teknologi scanner
         for (int i = 0; i < 3; i++){
             System.out.println("");
             System.out.println("\tData Buku -" + (i+1) );
             System.out.println("Judul Buku = ");
             judul[i] = scanner.nextLine();
             System.out.println("Nama Pengarang = ");
             nama_pengarang[i] = scanner.nextLine();
             System.out.println("Penerbit = ");
             penerbit[i] = scanner.nextLine();
             System.out.println("Tahun Cetak = ");
             tahun_cetak[i] = Integer.parseInt(scanner.nextLine());
             System.out.println("Kategori = ");
             kategori[i] = scanner.nextLine();     
   }
         System.out.println("");
         System.out.println("Buku yang Anda pilih : \n");

//         => Menampilkan Data Buku yang telah dinputkan user dengan perulangan for

        for (int i = 0; i < 3; i++)
        {
            tokoBuku.setJudul(judul[i]);
            tokoBuku.setNama_pengarang(nama_pengarang[i]);
            tokoBuku.setPenerbit(penerbit[i]);
            tokoBuku.setTahun_cetak(i);
            tokoBuku.setTahun_cetak(tahun_cetak[i]);
            tokoBuku.setKategori(kategori[i]);
            System.out.println("Data Buku ke-" + (i+1));
            System.out.println("Judul Buku = " + tokoBuku.getJudul());
            System.out.println("Nama Pengarang = " + tokoBuku.getNama_pengarang());
            System.out.println("Penerbit = " + tokoBuku.getPenerbit());
            System.out.println("Tahun Cetak = " + tokoBuku.getTahun_cetak());
            System.out.println("Kategori = " + tokoBuku.getKategori());
        }
         
        
    }
}

