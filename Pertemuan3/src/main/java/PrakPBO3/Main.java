/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakPBO3;

/**
 *
 * @author Mai
 */

public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Nekoya", 6);
        kucing.suara();
        kucing.info();
        kucing.berlari();

        Hewan anjing = new Hewan("Cupcake", 4);
        anjing.suara();
        anjing.info();
        anjing.berlari();
    }
}
