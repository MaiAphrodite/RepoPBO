/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_P4;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Pekerja
        Pekerja pekerja = new Pekerja("John Doe", 30, "Software Developer", 15000000);

        // Menampilkan informasi pekerja menggunakan metode toString
        System.out.println(pekerja.toString());

        // Mengubah nama pekerja menggunakan setter
        pekerja.setNama("Jane Doe");
        
        // Menampilkan ulang informasi pekerja setelah nama diubah
        System.out.println(pekerja.toString());

        // Mencoba akses langsung ke atribut nama, usia, dan gaji
        // System.out.println(pekerja.nama); // Akan error karena 'nama' private
        // System.out.println(pekerja.usia); // Bisa diakses karena 'usia' protected
        // System.out.println(pekerja.gaji); // Akan error karena 'gaji' private
    }
}

