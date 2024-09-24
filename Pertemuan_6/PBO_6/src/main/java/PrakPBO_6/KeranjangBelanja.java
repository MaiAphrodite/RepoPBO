/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakPBO_6;

/**
 *
 * @author Mai
 */
import java.util.ArrayList;
import java.util.List;

class KeranjangBelanja {
    private List<Produk> produkList;

    public KeranjangBelanja() {
        produkList = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        produkList.add(produk);
    }

    public int hitungTotalHargaSetelahDiskon() {
        int total = 0;
        for (Produk produk : produkList) {
            total += produk.getHarga() - produk.hitungDiskon();
        }
        return total;
    }

    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Buku buku = new Buku("Java For Dummies", 50000);
        Elektronik elektronik = new Elektronik("Smartphone - ROG Phone 8", 11275000);
        Pakaian pakaian = new Pakaian("T-Shirt Polos", 100000);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        System.out.println("Total harga setelah diskon: " + keranjang.hitungTotalHargaSetelahDiskon());
    }
}
