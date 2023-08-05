/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package uas_pbo2;

/**
 *
 * @author : Mohammad Husaini Azhar
 * Nim     : 22104410093
 * Kelas   : Teknik Informatika 2B
 *
 */
public class Android implements PajakCalculator {
    public String vendor;
    public String tipe;
    public double harga;
    
    public Android(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }
    
    @Override
    public double hitungHargaSetelahPPN(double harga) {
        double ppn;
        if (harga > 4500000) {
            ppn = harga * pajak5;
        } else if (harga >= 4200000) {
            ppn = harga * pajak2;
        } else if (harga > 4000000) {
            ppn = harga * pajak;
        } else {
            ppn = 0;
        }
        return harga + ppn;
    }
}
