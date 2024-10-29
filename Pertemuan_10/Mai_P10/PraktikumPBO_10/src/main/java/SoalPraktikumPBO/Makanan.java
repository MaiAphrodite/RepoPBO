/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPraktikumPBO;

/**
 *
 * @author ASUS
 */
public class Makanan {
    private double harga;

    public Makanan(double harga) {
        this.harga = harga;
    }

    public double hitungPajak() {
        return harga * 0.05; // Pajak 5% untuk makanan
    }

    public double getHarga() {
        return harga;
    }
}