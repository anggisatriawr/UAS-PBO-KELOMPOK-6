/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uas_pbo2;

/**
 *
 * @author hiyer
 */
public interface PajakCalculator {
    double pajak = 0.01; // 1% PPN
    double pajak2 = 0.02; // 2% PPN
    double pajak5 = 0.05; // 5% PPN
    
    double hitungHargaSetelahPPN(double harga);
}
