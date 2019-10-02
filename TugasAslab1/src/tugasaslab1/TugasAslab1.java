/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasaslab1;

import java.util.Scanner;


/**
 *
 * @author fatchurrosii
 */
public class TugasAslab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char yt= 'y';
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
        int sisi = in.nextInt();   
        VolumeKubus kubus=new VolumeKubus(sisi);
      
        System.out.print("\nHasil Kubus : " + kubus.volKub());
        break;
        case 2:
        System.out.print("Masukkan nilai panjang :");
        int p =in.nextInt();
        System.out.print("Masukkan nilai Lebar :");
        int l =in.nextInt();
        System.out.print("Masukkan nilai Tinggi :");
        int t =in.nextInt();
        VolumeBalok balok = new VolumeBalok(p,l,t);
        System.out.print("\nHasil Balok :" + balok.volBalok());
        break;
        case 3:
             double pi =3.14;
        System.out.print("Masukkan nilai diameter :");
        int dm = in.nextInt();
        System.out.print("Masukkan nilai Tinggi:");
        int ta =in.nextInt();
        VolumeTabung tabung = new VolumeTabung(dm,ta);
       
        System.out.print("\nHasil Tabung :"+ tabung.volumeTabung());
        break;
        
       
    
        }
        System.out.println("\nApakah anda ingin mengulang (y/t)");
        yt = in.next().charAt(0);
        }while(yt=='y');
         
    }
    }
    

