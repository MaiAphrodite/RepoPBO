/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author ASUS
 */
public class Kendaraan {
    private String merek;
    private String model;
    private int tahun;
    private String nama;
    protected int kecepatanMaks;
    public String jenisMesin;
    
    public Kendaraan(String merek, String model, String nama, 
            String jenisMesin, int tahun, int kecepatanMaks) {
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setNama() {
        this.nama = nama;
    }
    public void tampilkanInfoKendaraan(){
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks + " Km/h");
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
    public String getMerek() {
        return merek;
    }
    public void setMerek(String merek) {
        this.merek = merek;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}
