/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06935modul4;






public class Karyawan {
    private String nama;
    private int gaji;
    private String status;
    private int anak;
    private String jabatan;

   public Karyawan(String nama, String jabatan, int gaji,String status,int anak){
       this.nama=nama;
       this.gaji=gaji;
       this.status=status;
       this.anak=anak;
       this.jabatan=jabatan;
   }
   public String getNama(){
       return nama;
   }
   public String getJabatan(){
       return jabatan;
   }
   public int getGaji(){
       return gaji;
   }
   public int getAnak(){
       return anak;
   }
   public String getStatus(){
       return status;
   }
       
}
