/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan45.pencetaknama;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan pencetak nama menggunakan konsep OOP
 * 
 */
public class PBO11K10118907Latihan45PencetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Aplikasi pencetak nama");
        System.out.print("Masukkan nama Anda : ");
        Scanner s = new Scanner(System.in);
        
        Printer p = new Printer();
        p.setNama(s.nextLine());
        
        System.out.print("Mau cetak nama berapa kali ?  ");
        Scanner s2 = new Scanner(System.in);
        
        p.setJmlCetak(Integer.parseInt(s2.next()));
        
        p.cetak(p.getNama());
        p.cetak(p.getJmlCetak(), p.getNama());
    }
    
}
