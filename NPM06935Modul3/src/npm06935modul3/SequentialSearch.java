
package npm06935modul3;

import java.util.ArrayList;
public class SequentialSearch extends BinarySearch {
  public void Sequential(int d, ArrayList<Data>data){
    for(i=0;i < data.size();i++){
    
            if( data.get(i).getNama().equals(d)){
                find = true;
                break;
            }
            else{
                System.out.println("Sorry, Data Not Found...!!!");
            }
        }
        System.out.println(d +"Data ditemukan di " + (i + 1) + ".");
        }
  
  
}

    

