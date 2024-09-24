/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakPBO_6;

/**
 *
 * @author Mai
 */
class Elektronik extends Produk {
    public Elektronik(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public int hitungDiskon() {
        return harga * 15 / 100; // Diskon 15%
    }
}
