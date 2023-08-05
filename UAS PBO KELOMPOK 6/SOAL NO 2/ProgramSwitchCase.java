package Prak3;

import javax.swing.JOptionPane;

/**
 *
 * @author Anggi Satria Wiranata
 *  
 */
public class ProgramSwitchCase {
    
    public static void main(String[] args) {
        int a=100, b=25;
        int hasil;
        System.out.println("Menu Pilihan");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        String input = JOptionPane.showInputDialog("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(input);
        switch (pilihan){
            case 1 -> {
                hasil = a+b;
                System.out.println("Penjumlahan a:"+a+ "+ b:"+b+" = "+hasil);
            }
            case 2 -> {
                hasil = a-b;
                System.out.println("Pengurangan a:"+a+ "- b:"+b+" = "+hasil);
            }
            default -> System.out.println("Pilihan anda salah");
        }
    }
}
    

