
package tugasdosen3;

import java.util.ArrayList;


public class Searching {
     ArrayList<Data>data;
    SequentialSearch SeqSearch= new SequentialSearch();
    BinarySearch BinSearch= new BinarySearch();
    
  
    public ArrayList<Data>getList(){
        return data;
    }
    
    public void Sequential(int d){
        SeqSearch.Sequential(d,data);
    }
    public void Binary(int d){
        BinSearch.Binary(d, data);
    }
}
