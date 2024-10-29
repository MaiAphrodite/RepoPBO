/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPraktikumPBO;

/**
 *
 * @author ASUS
 */
public class Pembayaran {
    public double prosesPembayaranMakanan(Makanan makanan) {
        double pajak = makanan.hitungPajak();
        double totalHarga = makanan.getHarga() + pajak;
        return totalHarga;
    }

    public double prosesPembayaranElektronik(Elektronik elektronik) {
        double pajak = elektronik.hitungPajak();
        double totalHarga = elektronik.getHarga() + pajak;
        return totalHarga;
    }
}

