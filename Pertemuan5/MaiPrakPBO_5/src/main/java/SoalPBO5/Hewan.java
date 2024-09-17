/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPBO5;

/**
 *
 * @author ASUS
 */
public class Hewan {
    protected String nama;
    protected String jenis;

    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis Hewan: " + jenis);
    }

    public void suara() {
        System.out.println("Hewan ini tidak memiliki suara khusus.");
    }
}
