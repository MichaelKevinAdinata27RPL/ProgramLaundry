/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryutama;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class laundryAdmin {
    static int masuk;
    static int pendapatan;
    static int kode;
  
    public void proses2(){
        do{
        System.out.print("Masukkan kode : ");
        Scanner masukan=new Scanner(System.in);
        kode = masukan.nextInt();
         if(kode == 54321){
             System.out.println("Total pelanggan : " + laundryStaff.pelanggan);
             System.out.println("Total laundry (Kg) : " + laundryStaff.totalKg);
             masuk = laundryStaff.totalKg * 4000;
             pendapatan = masuk - laundryStaff.modal;
                    System.out.println("Pemasukkan hari ini : Rp" + masuk);
                    System.out.println("Pengeluaran hari ini : Rp" + laundryStaff.modal);
                    System.out.println("Pendapatan hari ini : Rp" + pendapatan);
                   
                }else
                    System.out.println("Kode yang anda masukkan salah");
    }while(kode!=54321);
        
        }
}
