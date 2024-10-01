package ManajemenPegawainProduk;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import ManajemenPegawainProduk.Pegawai.Pegawai;
import ManajemenPegawainProduk.Pegawai.PegawaiKontrak;
import ManajemenPegawainProduk.Pegawai.PegawaiTetap;
import ManajemenPegawainProduk.Produk.Produk;
import ManajemenPegawainProduk.Produk.Elektronik;
import ManajemenPegawainProduk.Produk.Makanan;

/**
 *
 * @author Mai
 */

public class Main {
    public static void main(String[] args) {
        // Output Produk
        Produk laptop = new Elektronik("PC", 15000000, 3);
        System.out.println("1. Output Produk");
        laptop.tampilkanInfo();

        // Output Pegawai
        Pegawai pegawaiTetap = new PegawaiTetap("Mai", 5000000, 100000);
        System.out.println("\n2. Output Pegawai");
        pegawaiTetap.tampilkanInfo();

        // Output Polimorfisme
        Produk snack = new Makanan("Mie Instan", 5000, "2025-01-20");
        Pegawai pegawaiKontrak = new PegawaiKontrak("Mai", 300000, 6);

        System.out.println("\n3. Output Polimorfisme");
        snack.tampilkanInfo();
        pegawaiKontrak.tampilkanInfo();
    }
}