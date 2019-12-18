
package tugasdosen3;

import java.util.ArrayList;


public class SequentialSearch {
    boolean find;
    int i;
     public void Sequential(int d, ArrayList<Data>data){
    for(i=0;i < data.size();i++){
    
            if( data.get(i).getNama().equals(d)){
                find = true;
                break;
            }
           
        }
        System.out.println(d +"Data ditemukan di " + (i+1) + ".");
        }
}
