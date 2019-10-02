
package npm06935modul1;
import java.util.Scanner;
/**
 *
 * @author fatchurrosii
 */
public class NPM06935Modul1 {

    static int p,l,t;
    static int sisi;
    static int dm;
    static double pi=3.14;
    static char yt='y';
    
    static int kubus(int sisi){
        int hasilKubus= sisi*sisi*sisi;
        return hasilKubus;
    }
    static int balok(int p ,int l ,int t){
        int hasilBalok=p*l*t;
                return hasilBalok;
    }
    static double tabung(double dm, int t){
        double hasilTabung=(dm/2*pi*pi)*t;
        return hasilTabung;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.Hasil Kubus");
        System.out.println("2.Hasil Balok");
        System.out.println("3.Hasil Tabung");
        do{
        System.out.print("Masukkan Pilihan :");
        int pilihan = in.nextInt();
        switch(pilihan){
        case 1:
        System.out.print("Masukkan nilai sisi :");  
        sisi = in.nextInt();
        System.out.print("\nHasil Kubus : " + kubus(sisi));
        break;
        case 2:
        System.out.print("Masukkan nilai panjang :");
        p =in.nextInt();
        System.out.print("Masukkan nilai Lebar :");
        l =in.nextInt();
        System.out.print("Masukkan nilai Tinggi :");
        t =in.nextInt();
        System.out.print("\nHasil Balok :" + balok(p, l, t));
        break;
        case 3:
        System.out.print("Masukkan nilai diameter :");
        dm = in.nextInt();
        System.out.print("Masukkan nilai Tinggi:");
        t =in.nextInt();
        System.out.print("\nHasil Tabung :"+ tabung(dm,t));
        break;
        }
        System.out.println("\nApakah anda ingin mengulang (y/t)");
        yt = in.next().charAt(0);
        }while(yt=='y');
    }
}
