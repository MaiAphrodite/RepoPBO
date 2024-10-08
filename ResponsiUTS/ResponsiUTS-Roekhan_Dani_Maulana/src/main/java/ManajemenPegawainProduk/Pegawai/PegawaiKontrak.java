/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenPegawainProduk.Pegawai;

import ManajemenPegawainProduk.Pegawai.Pegawai;

/**
 *
 * @author Mai
 */
public class PegawaiKontrak extends Pegawai {
    private int lamaKontrak; // dalam bulan

    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }

    public int getLamaKontrak() { return lamaKontrak; }
    public void setLamaKontrak(int lamaKontrak) { this.lamaKontrak = lamaKontrak; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
    }
}

