
package tugasaslab2;

import java.util.Scanner;
public class TugasAslab2 {

   
    public static void main(String[] args) {
     char yt='y';
     int pilih;
     String nama;
     String desk;
     String stat;
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
                nama=in.next();
                desk=in.next();
                stat=in.next();
                project.tambah(project, nama, desk, stat);
                 System.out.println("");
                 break;
             case 2:
                 System.out.println("2.Read Data");
                 project.view(project);
                 break;
             case 3:
                 String name;
                 System.out.println("3.Status Pekerjaan");
                 System.out.print("Masukkan nama pekerja : ");
                 name = in.next();
                 project.update(project, name);
                 break;
              case 4:
                  
                  System.out.println("Menghapus data");
                  project.delete(project);
          
         }
         
     
         
         System.out.println("Apakah anda ingin mengulang?(y/t)");
         yt = in.next().charAt(0);
     }while(yt=='y');
    }
    
}
