/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO3;

/**
 *
 * @author Mai
 */
public class Main {
    public static void main(String[] args) {  
        // Add data
        Mobil mobil1 = new Mobil("Toyota", "Corolla", 2020, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2019, "Putih");

        // Display Data
        mobil1.displayInfo();
        mobil1.startEngine();
        System.out.println();
        mobil2.displayInfo();
        mobil2.startEngine();

        // Los Santos Customs
        mobil1.setWarna("Merah");
        mobil2.setWarna("hijau");
        System.out.println("\nSetelah mengubah warna:");
        mobil1.displayInfo();
        mobil2.displayInfo();
    }
}