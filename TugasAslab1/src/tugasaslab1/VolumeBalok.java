/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasaslab1;

/**
 *
 * @author fatchurrosii
 */
public class VolumeBalok {
    int p,l,t;
   public VolumeBalok(int p, int l,int t){
       this.p=p;
       this.l=l;
       this.t=t;
   }
    public int volBalok(int p,int l,int t){
         int hasilBalok=p*l*t;
                return hasilBalok;
    }
    
}
