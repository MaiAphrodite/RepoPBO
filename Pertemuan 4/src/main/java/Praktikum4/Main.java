/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Create an instance of Mobil with the required parameters
        Mobil mobil = new Mobil("Toyota", "Avanza", "Kentang", "2NR-VE", 2020, 180, 4);

        // Display information about the car
        System.out.println("Merek: " + mobil.getMerek());
        System.out.println("Model: " + mobil.getModel());
        System.out.println("Tahun: " + mobil.getTahun());

        mobil.setModel("Innova");
        mobil.setTahun(2021);

        System.out.println("Model baru: " + mobil.getModel());
        System.out.println("Tahun baru: " + mobil.getTahun());

        // Call the method to display specific info for Mobil
        mobil.tampilkanInfoMobil();
    }
}