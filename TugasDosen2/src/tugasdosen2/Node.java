/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasdosen2;
import java.util.Scanner;

public class Node {
    Data data ;
    Node prev;
    Node next;
    
    public Node (Data datas){
        this.data= new Data(datas.namaPekerjaan, datas.deskripsiPekerjaan, datas.statusPekerjaan);
        this.next=null;
        this.prev=null;
        
    }
}
  
  