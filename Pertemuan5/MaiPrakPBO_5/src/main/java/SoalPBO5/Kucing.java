/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPBO5;

/**
 *
 * @author ASUS
 */
public class Kucing extends HewanDarat {

    public Kucing(String nama) {
        super(nama, "Kucing");
    }

    @Override
    public void suara() {
        System.out.println(nama + " mengeluarkan suara: Meong!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suara();
    }
}
