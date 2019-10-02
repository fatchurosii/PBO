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
public class VolumeTabung {
    int dm,ta;
     double pi=3.14;
     public VolumeTabung(int i,int t){
         this.dm=dm;
         this.ta=ta;
     }
     public double volumeTabung(){
         double hasilTabung=(dm/2*pi*pi)*ta;
         return hasilTabung;
     }
}
