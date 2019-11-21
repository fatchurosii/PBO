
package npm06935modul4;

import java.util.Scanner;
public class App {

    public static void main(String[] args) {
     Scanner in= new Scanner(System.in);
     String nama, jabatan, status;
     int anak,menu,id=0;
     int gaji=0;
     char ljt ='y';
     Controllers ctrl = new Controllers();
        do {
            System.out.println("Sistem Penggajian Karyawan!");
            
            System.out.println("\n====Menu====");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Hitung Gaji");
            System.out.println("3. Lihat Data Karyawan");
            System.out.println("4. EXIT!");
            System.out.println("===================");
            
            System.out.println("Masukkan Nomor Menu :");
            menu=in.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Tambah Data Karyawan");
                    System.out.println("Nama    : ");
                    nama = in.next();
                    System.out.println("Jabatan : \n (ceo/cfo/cto)");
                    jabatan=in.next();
                    System.out.println("Status Pernikahan \n (Sudah/Belum)");
                    status = in.next();
                    System.out.println("Anak    : ");
                    anak= in.nextInt();
                    ctrl.insert(nama,jabatan,gaji,status,anak);
                    break;
                case 2:
                    System.out.println("Gaji Karyawan");
                    for(Karyawan view : ctrl.getAll()){
                        System.out.println("index : "+ id);
                        System.out.println("Nama  : "+view.getNama());
                        id++;
                    }
                    System.out.println("Masukkan index data Karyawan    :");
                    id = in.nextInt();
                    ctrl.hitungGaji(id);
                    System.out.println("Gaji :"+ ctrl.karyawan.get(id).getNama());
                    
                   break;
                case 3:
                    System.out.println("View Data");
                    for(Karyawan view :ctrl.getAll()){
                        System.out.println("id      : " +id);
                        System.out.println("Nama    : "+view.getNama());
                        System.out.println("Jabatan : "+view.getJabatan());
                        System.out.println("Status  : "+view.getStatus());
                        System.out.println("Anak    : "+view.getAnak());
                        System.out.println("Gaji    : "+view.getGaji());
                        System.out.println("==========================");
                    }
                    break;
                    case 4:
                        System.out.println("Terima kasih");
                        int sure =0;
                        System.exit(sure);
                        break;
            }
          
            }while(ljt=='y');
        }
        
        } 
    
