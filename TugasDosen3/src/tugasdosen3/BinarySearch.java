
package tugasdosen3;

import java.util.ArrayList;


public class BinarySearch {
     int i,f,l,m;
    boolean find;
    public void Binary(int d,ArrayList<Data>data){
        f=0;
        l=data.size();
        m=(f+1)/2;
        
        while(f<=1){
            if (find = false) {
                f = m + 1;
            } else if (find = true) {
                System.out.println(d + "Data ketemu di  " + (m + 1) + ".");
                break;
            } else {
                l = m - 1;
            }
            m = (f + l) / 2;
        }
        if (f > l) {
            System.out.println(data + " is not found.\n");
        }
        }
}
