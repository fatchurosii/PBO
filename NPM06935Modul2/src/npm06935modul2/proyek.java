/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06935modul2;
import java.util.Scanner;

public class proyek {
    private static class node{
    String namaPekerjaan;
    String deskripsiPekerjaan;
    String statusPekerjaan;
    node prev;
    node next;
    
    node (String nPekerjaan,String dPekerjaan , String sPekerjaan){
        this.namaPekerjaan=nPekerjaan;
        this.deskripsiPekerjaan=dPekerjaan;
        this.statusPekerjaan=sPekerjaan;
        this.next=null;
        this.prev=null;
        
    }
    }
    node head;
    node tail;
    
    void tambah (proyek list,String nPekerjaan,String dPekerjaan,String sPekerjaan){
        node data_proyek=new node(nPekerjaan,dPekerjaan,sPekerjaan);
        if (list.head==null){
            list.head=data_proyek;
            list.tail=data_proyek;
            
        }
        else{
        data_proyek.prev=list.tail;
        data_proyek.next=null;
        list.tail.next=data_proyek;
        list.tail=data_proyek;
        }
       
        
    }
    void view(proyek list){
        node lihat = list.head;
        System.out.println("Data Proyek");
        while(lihat!=null){
            System.out.println("Nama Pekerjaan      : "+lihat.namaPekerjaan);
            System.out.println("Deksripsi Pekerjaan : "+lihat.deskripsiPekerjaan);
            System.out.println("Status Pekerjaan    : "+lihat.statusPekerjaan);
            System.out.println("=============================================");
            lihat=lihat.next;
        }
    }
    void update (proyek list, String name){
        node update = list.tail;
        Scanner in = new Scanner(System.in);
        while(update != null){
            if(update.namaPekerjaan.equals(name)){
            System.out.println("Status Pekerjaan    : ");
            String pkr = in.next();
            
            update.statusPekerjaan = pkr;
            }
            update=update.next;
        }
    }
   
    void delete (proyek list,String n){
        node del= list.tail;
        if (del==null){
            System.err.println("Data tidak terhapus!");
        }
        else{
            list.tail=list.tail.prev;
            list.tail.next=null;
        }
    }
    
}
