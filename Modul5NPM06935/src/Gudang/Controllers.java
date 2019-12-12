
package Gudang;

import java.util.ArrayList;
public class Controllers {
   public ArrayList<Data>data= new ArrayList<>();
    public DescendSort des = new DescendSort();
    public AscendSort asc = new AscendSort();
    
    
    public void SortbyNameDesc(){
        des.SortName(data);
    }
     public void SortbyStockDesc(){
        des.SortStock(data);
    }
     public void SortbyHargaDesc(){
        des.SortHarga(data);
    }
     public void SortbyNameAsc(){
        asc.SortName(data);
    }
     public void SortbyStockAsc(){
        asc.SortStock(data);
    }
     public void SortbHargaAsc(){
        asc.SortHarga(data);
    }
    public ArrayList<Data>getList(){
        return data;
    }
    
}
