/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalPraktikum11;

import soalPraktikum11.Buku;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
class Perpustakaan {
    private ArrayList<Buku> daftarBuku; // Komposisi: Perpustakaan memiliki daftar Buku

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanInfoBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku di perpustakaan.");
        } else {
            for (Buku buku : daftarBuku) {
                System.out.println(buku.infoBuku());
            }
        }
    }
}
