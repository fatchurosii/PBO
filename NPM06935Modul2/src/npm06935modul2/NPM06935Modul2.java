
package npm06935modul2;

import java.util.Scanner;
public class NPM06935Modul2 {

   
    public static void main(String[] args) {
     char yt='y';
     int pilih;
     proyek project = new proyek();
     Scanner in= new Scanner(System.in);
        System.out.println("1. Create Data");
        System.out.println("2. Read Data");
        System.out.println("3. Update Data");
        System.out.println("4. Delete Data");
     do{
         System.out.println("Masukkan Pilihan");
         pilih = in.nextInt();
         switch(pilih){
             
             case 1:
                System.out.println("1.Create Data");
                String nama=in.next();
                String desk=in.next();
                String stat=in.next();
                project.tambah(project, nama, desk, stat);
                 System.out.println("");
                 break;
             case 2:
                 System.out.println("2.Read Data");
                 project.view(project);
                 break;
             case 3:
                 System.out.println("3.Status Pekerjaan");
                 System.out.print("Masukkan nama pekerja : ");
                 String name = in.next();
                 project.update(project, name);
                 break;
              case 4:
                  String n=null ;
                  System.out.println("Menghapus data");
                  project.delete(project, null);
          
         }
         
     
         
         System.out.println("Apakah anda ingin mengulang?(y/t)");
         yt = in.next().charAt(0);
     }while(yt=='y');
    }
    
}
