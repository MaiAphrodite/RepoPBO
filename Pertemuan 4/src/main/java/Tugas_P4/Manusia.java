/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_P4;

/**
 *
 * @author ASUS
 */
public class Manusia {
    // Atribut dengan akses modifier sesuai ketentuan
    private String nama;
    protected int usia;
    public String pekerjaan;

    // Constructor untuk inisialisasi atribut
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    // Getter dan Setter untuk atribut nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
