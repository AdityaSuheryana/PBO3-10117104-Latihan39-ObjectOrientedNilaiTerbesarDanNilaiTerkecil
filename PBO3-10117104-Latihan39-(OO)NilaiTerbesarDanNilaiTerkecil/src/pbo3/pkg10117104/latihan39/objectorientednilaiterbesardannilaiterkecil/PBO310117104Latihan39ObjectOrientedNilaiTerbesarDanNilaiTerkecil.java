/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan39.objectorientednilaiterbesardannilaiterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Nim : 10117104
 * Kelas : IF-3/PBO3
 * Deskripsi Program : Menampilkan ilai terbesar dan terkecil dari 
 * nilai-nilai yang telah dimasukkan oleh User
 */
public class PBO310117104Latihan39ObjectOrientedNilaiTerbesarDanNilaiTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           String namaPetugas;
        int jmlMhs;

        Nilai hasil = new Nilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa :  ");
        jmlMhs = scn.nextInt();
        System.out.println();

        hasil.inputNilai(jmlMhs);
        System.out.println();
        hasil.tampilNilaiTerbesarTerkecil(jmlMhs);

        System.out.println("Nilai Terbesar : " + hasil.nilaiBesar);
        System.out.println("Nilai Terkecil : " + hasil.nilaiKecil);
        System.out.println();
        System.out.println("Nama Petugas : " + namaPetugas);
    }
}
    
