/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPraktikumPBO;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Makanan makanan = new Makanan(10000);      // Harga makanan Rp 10.000
        Elektronik elektronik = new Elektronik(200000); // Harga elektronik Rp 200.000

        Pembayaran pembayaran = new Pembayaran();

        double totalMakanan = pembayaran.prosesPembayaranMakanan(makanan);
        double totalElektronik = pembayaran.prosesPembayaranElektronik(elektronik);

        System.out.println("Total harga setelah pajak untuk Makanan: Rp " + totalMakanan);
        System.out.println("Total harga setelah pajak untuk Elektronik: Rp " + totalElektronik);
    }
}

