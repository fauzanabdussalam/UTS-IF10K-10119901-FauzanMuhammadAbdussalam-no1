/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119901.fauzanmuhammadabdussalam.no1;

import java.util.Scanner;
import java.util.Calendar;
/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : UTS No.1 (Menghitung Umur)
 *
 */
public class UTSIF10K10119901FauzanMuhammadAbdussalamNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Age a           = new Age(Calendar.getInstance().get(Calendar.YEAR));
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        a.setYearBirth(scanner.nextInt());
        
        System.out.println("\n ======Hasil Perhitungan Umur======");
        System.out.println("Tahun Lahir Anda : " + a.getYearBirth());
        System.out.println("Hari Ini Tahun \t : " + a.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + a.hitungUmur() + " tahun");
        System.out.println(a.tandanyaKamu(a.hitungUmur()));   
    }
}
