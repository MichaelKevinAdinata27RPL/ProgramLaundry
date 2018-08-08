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
public class laundryPelanggan {
        static int anggota, hadiah;
        static double totalHarga, bayar, jml;
        static String nama;
    public void masuk(){
        
        Scanner masuk = new Scanner(System.in);
        System.out.println("====SELAMAT DATANG====");
            System.out.print("Silakan masukkan nama anda : ");
            nama = masuk.next();
            System.out.print("Silakan masukkan jumlah laundry (kg) : ");
            jml = masuk.nextDouble();
            System.out.println("Apakah punya kartu member?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("Jawab : ");
            anggota = masuk.nextInt();
            
            totalHarga = jml * 4000;
            
            if(anggota == 1){
                    System.out.println("Selamat anda mendapatkan hadiah (dlm tenggangn waktu 1 minggu)");    
                    System.out.println("Silakan pilih hadiah : ");    
                    System.out.println("1. Tas");    
                    System.out.println("2. Voucher belanja sebesar Rp30.000");
                    System.out.print("Pilih : ");
                    hadiah = masuk.nextInt();
                    System.out.println("Total harga = Rp" + totalHarga);
                    System.out.println("Terima kasih sudah memilih jasa Laundry kami");
                    System.out.println("Semoga hadiah ini berguna bagi anda");
                }else
                    System.out.println("Total yang harus anda bayar = Rp" + totalHarga);
            
            
        
    }
    
}
   
    
    

