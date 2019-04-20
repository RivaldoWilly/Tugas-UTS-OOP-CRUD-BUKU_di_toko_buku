package Service;

import java.util.*;
import Entity.*;

public class BukuService {

    private static List<Buku> data = new LinkedList<Buku>();

    public void tambahData(Buku bk) {
        data.add(bk);
        System.out.println("data telah tersimpan");
    }

    public void ubahData(Buku bk) {
        int idx = data.indexOf(bk);
        if(idx >= 0) {
            data.set(idx, bk);
            System.out.println("data telah berubah");
        }
    }

    public void hapusData(String id) {
        int idx = data.indexOf(new Buku(id, "", "",""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("data telah terhapus");
        }
    }

    public void tampilkanData() {
        System.out.println("\n--= Data Mahasiswa =--");
        int urutan = 1;
        for (Buku bk : data){
            System.out.println("data ke-" + urutan++);
            System.out.println("  ID : " + bk.getId());
            System.out.println("  JUDUL : " + bk.getJudul());
            System.out.println("  PENGARANG : " + bk.getPengarang());
            System.out.println("  HARGA : " + bk.getHarga());
        }
    }

}