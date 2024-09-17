/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPBO5;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        Kucing kucing = new Kucing("Nekoya");
        Anjing anjing = new Anjing("Lamar");

        System.out.println("Informasi Kucing:");
        kucing.tampilkanInfo();
        System.out.println();

        System.out.println("Informasi Anjing:");
        anjing.tampilkanInfo();
    }
}
