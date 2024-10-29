/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPraktikumPBO;

/**
 *
 * @author ASUS
 */
public class Elektronik {
    private double harga;

    public Elektronik(double harga) {
        this.harga = harga;
    }

    public double hitungPajak() {
        return harga * 0.10; // Pajak 10% untuk elektronik
    }

    public double getHarga() {
        return harga;
    }
}

