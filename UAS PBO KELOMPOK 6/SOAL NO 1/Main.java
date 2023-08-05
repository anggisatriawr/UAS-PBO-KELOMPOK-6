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
public class Main {
    public static void main(String[] args) {
        Android samsungA51 = new Android("Samsung", "A 51", 5000000);
        Android oppoReno5 = new Android("Oppo", "Reno 5", 4400000);
        Android xiaomiA1 = new Android("Xiaomi", "A1", 4100000);
        
        double hargaSamsungA51 = samsungA51.hitungHargaSetelahPPN(samsungA51.harga);
        double hargaOppoReno5 = oppoReno5.hitungHargaSetelahPPN(oppoReno5.harga);
        double hargaXiaomiA1 = xiaomiA1.hitungHargaSetelahPPN(xiaomiA1.harga);
        
        // Harga Barang Sebelum PPN
        System.out.println("Harga Barang Sebelum PPN");
        System.out.println("========================");
        System.out.println("Harga Samsung A51: Rp5.000.000,00");
        System.out.println("Harga Oppo Reno 5: Rp4.400.000,00");
        System.out.println("Harga Xiaomi A1: Rp4.100.000,00");
        
        System.out.println(" ");
        
        // Harga Barang Sesudah PPN
        System.out.println("Harga Barang Setelah PPN");
        System.out.println("========================");
        System.out.println("Harga Samsung A51 setelah PPN: Rp " + hargaSamsungA51);
        System.out.println("Harga Oppo Reno 5 setelah PPN: Rp " + hargaOppoReno5);
        System.out.println("Harga Xiaomi A1 setelah PPN: Rp " + hargaXiaomiA1);
    }
}
