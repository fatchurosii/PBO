
package npm06935modul4;

import java.util.ArrayList;
public class Controllers{
   
    ArrayList<Karyawan>karyawan = new ArrayList<>();
    public void insert(String nama,String jabatan,int gaji,String status,int anak){
        Karyawan kar= new Karyawan(nama,jabatan,gaji,status,anak);
        karyawan.add(kar);
    }
  
    public void hitungGaji(int id){
    GajiKotor gjk = new GajiKotor();
    String jabatan = karyawan.get(id).getJabatan();
    gjk.setPajak(jabatan);
    int pajakfix=gjk.getPajak();
        System.out.println("Pajak = "+gjk.getPajak());
    int anak = karyawan.get(id).getAnak();
    String status = karyawan.get(id).getStatus();
    gjk.setTunjangan(status, anak);
    int tunjanganfix= gjk.getTunjangan();
        System.out.println("Tunjangan = "+ gjk.getTunjangan());
    gjk.GajiBersih(pajakfix, tunjanganfix);
    int totalGaji=gjk.gajiBersih;
        System.out.println("Gaji Bersih = "+totalGaji);
    String nama = karyawan.get(id).getNama();
    karyawan.set(id,new Karyawan(nama, jabatan, totalGaji, status, anak));
    
}
    public ArrayList<Karyawan> getAll(){
        return karyawan;
    }
}
