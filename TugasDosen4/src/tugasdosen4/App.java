

package tugasdosen4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Data.*;

public class App {

     static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Data> data = new ArrayList<>();
        Sorting sort = new Sorting();

        char yt = 'y';
        do {
            System.out.println("1. Insert Data");
            System.out.println("2. Sorting Data");
            System.out.println("3. View Data");
            int pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("\nMasukkan Nama Barang    :");
                    String name = in.next();
                    System.out.print("Masukkan Stock Barang   :");
                    int sTock = validate();
                    System.out.print("Masukkan Harga Barang   :");
                    int harGa = validate();
                    data.add(new Data(name, sTock, harGa));
                    break;
                case 2:
                    System.out.println("1. Sorting Ascender");
                    System.out.println("2. Sorting Descender");
                    int pilih2 = in.nextInt();
                    switch (pilih2) {
                        case 1:
                            System.out.println("=====Sorting Ascender=====");
                            System.out.println("1. Sorting Berdasarkan Nama ");
                            System.out.println("2. Sorting Berdasarkan Stock Barang ");
                            System.out.println("3. Sorting Berdasarkan Harga Barang ");
                            int pilih1 = in.nextInt();
                            switch (pilih1) {
                                case 1:
                                    System.out.println("Sorting Berdasarkan Nama Barang :");
                                    sort.SortbyNameAsc();
                                    break;
                                case 2:
                                    System.out.println("Sorting Bedasarkan Stock Barang :");
                                    sort.SortbHargaAsc();
                                    break;
                                case 3:
                                    System.out.println("Sorting Berdasarkan Harga Barang:");
                                    sort.SortbHargaAsc();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("====Sorting Descender====");
                            System.out.println("1. Sorting Berdasarkan Nama ");
                            System.out.println("2. Sorting Berdasarkan Stock Barang ");
                            System.out.println("3. Sorting Berdasarkan Harga Barang ");
                            int pilih3 = in.nextInt();
                            switch (pilih3) {
                                case 1:
                                    System.out.println("Sorting Berdasarkan Nama Barang :");
                                    sort.SortbyNameDesc();
                                    break;
                                case 2:
                                    System.out.println("Sorting Bedasarkan Stock Barang :");
                                    sort.SortbyStockDesc();
                                    break;
                                case 3:
                                    System.out.println("Sorting Berdasarkan Harga Barang:");
                                    sort.SortbyHargaDesc();
                                    break;
                            }
                            break;

                    }
                case 3:
                    System.out.println("View Data!!!");
                    for (int i = 0; i < data.size(); i++) {
                        System.out.print("\n1. Nama Barang  :" + data.get(i).getNamaBarang());
                        System.out.print("\n2. Harga Barang :" + data.get(i).getHarga());
                        System.out.print("\n3. Stock        :" + data.get(i).getStock());

                    }
                    break;

            }
            System.out.println("");
            System.out.println("Apakah Lanjut ?");
            yt = in.next().charAt(0);
        } while (yt == 'y');

    }

    public static int validate() {
        while (true) {
            try {
                return in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Inputan bukan angka, Silahkan Inputkan kembali!");
                in.next();
            }

        }

    }
    
}
