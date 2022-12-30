    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Code_PraktikumPBO;

/**
 *
 * Chakti Yanottama
 * 21104410064/ TI b
 */
public class ContohVMI {
    public static void main(String[] args) {
        HitungLuas hitungLuas = new PersegiPanjang ();
        // function hitungLuas => persegiPanjang
        System.out.println("Panjang = " + hitungLuas.panjang);
        System.out.println("Lebar = " + hitungLuas.lebar);
        hitungLuas.luas();
        
       //MVI =>
        // yang dipanggil variable yang dipanggil induknya
        // yang dipanggil functionnya yang dipanggil turunannya
    }

}
