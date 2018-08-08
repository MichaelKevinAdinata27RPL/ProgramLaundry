package laundryutama;
import java.util.Scanner;
public class laundryUtama {
    static int pilih;
    static int menu;
    static Scanner masuk = new Scanner(System.in);
    static public void menu() {
        System.out.println("===Selamat Datang===");
        System.out.println("Apa jabatan anda?");
        System.out.println("1. Pelanggan");
        System.out.println("2. Staff");
        System.out.println("3. Administrator");
        System.out.println("4. Owner");
        System.out.println("5. Keluar");
        System.out.print("Jawab : ");
        pilih = masuk.nextInt();
    }
    public static void main(String[] args) {
        menu();
        switch(pilih){
            case 1 :
                laundryPelanggan pelanggan = new laundryPelanggan();
                pelanggan.masuk();
                System.out.println("Kembali ke menu?");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Jawab : ");
                menu = masuk.nextInt();
                if(menu == 1){
                    menu();
                }else
                    System.exit(0);
            case 2 :
                laundryStaff staff = new laundryStaff();
                staff.proses1();
                System.out.println("Kembali ke menu?");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Jawab : ");
                menu = masuk.nextInt();
                if(menu == 1){
                    menu();
                }else
                    System.exit(0);
            case 3 :     
                laundryAdmin admin = new laundryAdmin();
                admin.proses2();
                System.out.println("Kembali ke menu?");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Jawab : ");
                menu = masuk.nextInt();
                if(menu == 1){
                    menu();
                }else
                    System.exit(0);
            case 4 : 
                laundryOwner pemilik = new laundryOwner();
                pemilik.report();
                System.out.println("Kembali ke menu?");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Jawab : ");
                menu = masuk.nextInt();
                if(menu == 1){
                    menu();
                }else
                    System.exit(0);
            case 5 : 
                System.exit(0);
            default : 
                System.out.println("Pilihan yang anda masukkan salah");
                menu();
        }
        
    }
    
}
