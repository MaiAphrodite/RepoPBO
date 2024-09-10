/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_P4;

/**
 *
 * @author ASUS
 */
public class Pekerja extends Manusia {
    // Atribut tambahan dengan akses modifier private
    private double gaji;

    // Constructor untuk inisialisasi atribut termasuk dari kelas Manusia
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // Memanggil constructor dari kelas induk
        this.gaji = gaji;
    }

    // Getter dan Setter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString untuk menampilkan semua informasi pekerja
    @Override
    public String toString() {
        return "Nama: " + getNama() + ", Usia: " + usia + ", Pekerjaan: " + pekerjaan + ", Gaji: " + gaji;
    }
}

