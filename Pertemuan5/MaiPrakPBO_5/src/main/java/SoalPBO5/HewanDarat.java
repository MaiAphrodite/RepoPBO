/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPBO5;

/**
 *
 * @author ASUS
 */
public class HewanDarat extends Hewan {

    public HewanDarat(String nama, String jenis) {
        super(nama, jenis);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Hewan ini adalah hewan darat.");
    }
}
