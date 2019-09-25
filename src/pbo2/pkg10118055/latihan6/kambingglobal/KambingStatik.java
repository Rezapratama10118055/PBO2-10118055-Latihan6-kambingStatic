/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan6.kambingglobal;

/**
 *
 NAMA:REZA PRATAMA
 * KELAS:PBO2
 * NIM:10118055
 * Deskripsi:program ini berisi program untuk menampilkan
 * jenis jenis data bilangan bulat
 */


   

public class KambingStatik {
      public static final String NAMA_KAMBING = "MIDUN";

      public static void main(String[]args)  {
          Mamalia.jumlahKambing = 485000;
          System.out.println(NAMA_KAMBING+"MEMILIKI KAMBING SEBANYAK=" +Mamalia.jumlahKambing);
    }
    
}
