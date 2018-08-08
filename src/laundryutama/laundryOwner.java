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
public class laundryOwner {
    int kode;
    
    public void report(){
        System.out.println("===Owner===");
        do{
        System.out.print("Masukkan kode : ");
        Scanner masukan=new Scanner(System.in);
        kode = masukan.nextInt();
                if(kode == 12345){
                    System.out.println("Total pelanggan : " + laundryStaff.pelanggan);
                    System.out.println("Total laundry (Kg) : " + laundryStaff.totalKg);
                         System.out.println("Pemasukan = Rp" + laundryAdmin.masuk);
                         System.out.println("Pengeluaran = Rp" + laundryStaff.modal);
                         System.out.println("Pendapatan = Rp" + laundryAdmin.pendapatan);
                    

                }else
                    System.out.println("Kode yang anda masukkan salah");
                
    }while(kode!=12345);
        }
    
    
}
