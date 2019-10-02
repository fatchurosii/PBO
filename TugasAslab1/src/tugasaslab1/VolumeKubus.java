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
public class VolumeKubus {
    int sisi;
    public  VolumeKubus(int sisi){
        this.sisi=sisi;
        
    }
    public int volKub(int sisi){
        int hasilKubus= sisi*sisi*sisi;
        return hasilKubus;
    }
    
}
