
package Gudang;

import java.util.ArrayList;


public class AscendSort extends DescendSort {
    
public ArrayList<Data> SortName(ArrayList<Data>data){
    for(i=0;i < data.size();i++){
        for(j=1; j < data.size()-i;j++){
        if (data.get(j-1).getNamaBarang().compareTo(data.get(j).getNamaBarang())>0){
            temp = data.get(j-1);
            data.set(j-1,data.get(j));
            data.set(j, temp);
            }
            
        }
    }
    return data;
}
public ArrayList<Data> SortStock(ArrayList<Data>data){
    for(i=0;i < data.size();i++){
        for(j=1; j < data.size()-i;j++){
        if (data.get(j-1).getStock() > (data.get(j).getStock())){
            temp = data.get(j-1);
            data.set(j-1,data.get(j));
            data.set(j, temp);
            }
            
        }
    }
    return data;
}
public ArrayList<Data> SortHarga(ArrayList<Data>data){
    for(i=0;i < data.size();i++){
        for(j=1; j < data.size()-i;j++){
        if (data.get(j-1).getHarga()>(data.get(j).getHarga())){
            temp = data.get(j-1);
            data.set(j-1,data.get(j));
            data.set(j, temp);
            }
            
        }
    }
    return data;
}

}
