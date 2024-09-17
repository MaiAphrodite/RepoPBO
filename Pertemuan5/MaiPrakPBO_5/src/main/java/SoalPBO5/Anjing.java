/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPBO5;

/**
 *
 * @author ASUS
 */
public class Anjing extends HewanDarat {

    public Anjing(String nama) {
        super(nama, "Anjing");
    }

    @Override
    public void suara() {
        System.out.println(nama + " mengeluarkan suara: wenomechainsama");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suara();
    }
}
