
package npm06935modul4;


public class GajiKotor extends Gaji {
    private int pajak=0;
    private int tunjangan=0;
    public void gaji(){
        gajiKotor=400000;
    }
    public void setPajak(String jabatan){
        gaji();
        if(jabatan.equals("CEO")||jabatan.equals("ceo")){
            System.out.println("1");
            System.out.println("ceo="+jabatan);
            this.pajak=(gajiKotor*10)/100;
            System.out.println("Potongan = "+gajiKotor);
        }else if(jabatan.equals("CTO")||jabatan.equals("cto")){
            System.out.println("2");
            System.out.println("cto="+jabatan);
            this.pajak = (gajiKotor*5)/100;
            System.out.println("Potongan = "+gajiKotor);
        }else if(jabatan.equals("CFO")||jabatan.equals("cfo")){
            System.out.println("3");
            System.out.println("cfo="+jabatan);
            this.pajak=(gajiKotor*3)/100;
            System.out.println("potongan = "+gajiKotor);
        }
    }
   
    public void setTunjangan(String status,int anak){
        gaji();
        System.out.println("Status = "+status+"| Anak = "+anak);
        if (status.equals("Sudah")||status.equals("sudah")){
            if(anak > 0){
                System.out.println("lebih dari 1");
                this.tunjangan = (gajiKotor*20)/100;
            }
            else {
                System.out.println("tidak Memiliki anak");
                this.tunjangan=(gajiKotor*10)/100;
            }
        }
        else{
            this.tunjangan=0;
        }
    }
    @Override
    public void GajiBersih(int pajak,int tunjangan){
        int gajiB= gajiKotor+tunjangan;
        gajiBersih=gajiB-pajak;
        System.out.println(gajiBersih);
    }
    public int getTunjangan(){
        return tunjangan;
    }
   
   
    public int getPajak(){
        return pajak;
}
}
