/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasdosen3;

import java.util.ArrayList;
import java.util.Scanner;


public class App {

   
    public static void main(String[] args) {
         Scanner inn=new Scanner(System.in);
        ArrayList<Data> data = new ArrayList<>();
        Searching ctrl = new Searching();
        int pil,c=0;
        char ljt;
        int id,harga,d;
        String nama;
        do{
        System.out.println("=============Program Pencarian Data===============");
        System.out.println("Menu : \n1. Inputkan Data\n2. Search Binnary\n3. Search Sequential\n4. Cetak Data");
        System.out.println("==================================================");
        System.out.print("Pilihan : ");pil=inn.nextInt();
        
      switch(pil){
          case 1 :
              System.out.println("======== Input Data ======");
              System.out.println("ID      : ");
              id=inn.nextInt();
              System.out.println("Nama       : ");
              nama=inn.next();
              System.out.println("Harga      : ");
              harga=inn.nextInt();
              c++;
             data.add(new Data(id, nama, harga));
              System.out.println("Data input success...");
              break;
          case 2 :
              System.out.println("======= Binnary Search =======");
              System.out.println("Masukkan kata kunci : ");
              d=inn.nextInt();
              ctrl.Binary(d);
              break;
          case 3 :
              System.out.println("======= Sequential Search =======");
              System.out.println("Masukkan kata kunci : ");
              d=inn.nextInt();
              ctrl.Sequential(d);
              break;
          case 4 :
              System.out.println("=========== Cetak Data ===========");
                for(Data baru : ctrl.getList()){
                    System.out.println("Isi array : " + ctrl.getList().size());
                    System.out.println("Nama             : "+ baru.getId());
                    System.out.println("Nik        : "+ baru.getNama());
                    System.out.println("Antrian : "+ baru.getHarga());
                    System.out.println("------------------------------");
                }
                System.out.println("==================================");
              break;
      }
        System.out.print("\napakah anda ingin keluar program?\n(Y/N) = ");
        ljt = inn.next().charAt(0);
    }
        while(ljt == 'n'|| ljt == 'N');
}
    }
    

