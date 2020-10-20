/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2_10119062_latihan2_deklarasidanpengaksesanvariabel;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Program : Program ini berisi program untuk menampilkan jenis-jenis
 * tipe data bilangan bulat  
 */
public class PBOIF2_10119062_Latihan2_DeklarasiDanPengaksesanVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi variabel
        int nilaiInt;
        final double PHI = 3.14; // konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        // Memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        // Menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel nilai = " + nilaiInt);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel logika = " + nilaiLogika);
        System.out.println("Isi variabel karakter = " + nilaiKarakter);
        
    }
    
}
