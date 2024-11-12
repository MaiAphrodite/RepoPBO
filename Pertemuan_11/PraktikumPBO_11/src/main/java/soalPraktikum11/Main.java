/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalPraktikum11;

import soalPraktikum11.Buku;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("Ahmad Tohari");
        Pengarang pengarang2 = new Pengarang("Pramoedya Ananta Toer");
        Pengarang pengarang3 = new Pengarang("Andrea Hirata");

        Buku buku1 = new Buku("Ronggeng Dukuh Paruk", pengarang1);
        Buku buku2 = new Buku("Bumi Manusia", pengarang2);
        Buku buku3 = new Buku("Laskar Pelangi", pengarang3);

        Perpustakaan perpustakaan = new Perpustakaan();

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        System.out.println("Daftar Buku di Perpustakaan:");
        perpustakaan.tampilkanInfoBuku();
    }
}
