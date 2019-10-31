
package npm06935modul3;

import java.util.*;
public class Sort {
    public void sorting(ArrayList<Data> data){
        Data temp;
        if(data.size()>1){
            for(int x =0; x<data.size();x++){
                for(int k=0;k<data.size()-k;k++){
                    if(data.get(k).getId()<data.get(k+1).getId()){
                       temp = data.get(k);
                       data.set(k,data.get(k+1));
                       data.set(k+1,temp);
                    }
                }
                
            }
        }
        
    }
}
