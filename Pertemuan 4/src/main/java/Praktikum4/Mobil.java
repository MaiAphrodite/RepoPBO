/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author ASUS
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merek, String model, String nama, 
            String jenisMesin, int tahun, int kecepatanMaks, int jumlahPintu) {
        super(merek, model, nama, jenisMesin, tahun, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfoMobil() {
        // Using the parent class method to display vehicle info
        tampilkanInfoKendaraan(); 
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
