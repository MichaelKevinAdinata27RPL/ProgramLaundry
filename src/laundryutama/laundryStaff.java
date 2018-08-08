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
public class laundryStaff {
    static int pelanggan;
    static int totalKg;
    static int modal;
    
    public void proses1(){
        Scanner masukan=new Scanner(System.in);
        System.out.print("Total pelanggan hari ini : ");
        pelanggan = masukan.nextInt();
        System.out.print("Total laundry hari ini (Kg) : ");
        totalKg = masukan.nextInt();
        System.out.print("Modal hari ini : Rp");
        modal = masukan.nextInt();
                    
    }
    
}
