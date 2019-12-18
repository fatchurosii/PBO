
package npm06935modul3;

import java.util.ArrayList;
public class Controllers{
    
    ArrayList<Data>data;
    SequentialSearch SeqSearch= new SequentialSearch();
    BinarySearch BinSearch= new BinarySearch();
    

    public Controllers() {
        data=new ArrayList<>();
    }
    public void input(int Id,String Nama,int Harga){
         Data datas =new Data (Id,Nama,Harga);
         data.add(datas);
    
    }
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
