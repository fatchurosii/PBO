
package Gudang;


public class Data {
    String namaBarang;
    int stock,harga;
    
    public Data(String namaBarang, int stock,int harga) {
        this.namaBarang=namaBarang;
        this.stock=stock;
        this.harga=harga;
    }
    public String getNamaBarang(){
        return namaBarang;
        
    }
    public int getStock(){
        return stock;
    }
    public int getHarga (){
        return harga;
    }
    
}
