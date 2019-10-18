/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasdosen2;

import java.util.Scanner;

/**
 *
 * @author fatchurrosii
 */
public class LinkedList {
    Node head;
    Node tail;
    
    void tambah (LinkedList list,String nPekerjaan,String dPekerjaan,String sPekerjaan){
        Node data_proyek=new Node(new Data(nPekerjaan,dPekerjaan,sPekerjaan));
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
    void view(LinkedList list){
        Node lihat = list.head;
        System.out.println("Data Proyek");
        while(lihat!=null){
            System.out.println("Nama Pekerjaan      : "+lihat.data.namaPekerjaan);
            System.out.println("Deksripsi Pekerjaan : "+lihat.data.deskripsiPekerjaan);
            System.out.println("Status Pekerjaan    : "+lihat.data.statusPekerjaan);
            System.out.println("=============================================");
            lihat=lihat.next;
        }
    }
    void update (LinkedList list, String name){
        Node update = list.tail;
        Scanner in = new Scanner(System.in);
        while(update != null){
            if(update.data.namaPekerjaan.equals(name)){
            System.out.println("Status Pekerjaan    : ");
            String pkr = in.next();
            
            update.data.statusPekerjaan = pkr;
            }
            update=update.next;
        }
    }
   
    void delete (LinkedList list  ){
        Node del= list.tail;
        if (del==null){
            System.err.println("Data tidak terhapus!");
            return;
        }
        else if (head == del ){
            head = del.next;
//            list.tail=list.tail.prev;
//            list.tail.next=null;
        }
        else if ( del.next != null){
            del.next.prev =del.prev;
        }
        else if (del.prev !=null){
            del.prev.next = del.next;            
        }
        del = null;
    }
    
}
