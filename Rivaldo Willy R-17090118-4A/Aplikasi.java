import Service.*;
import Entity.*;
import java.util.*;

public class Aplikasi {

    private static BukuService service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new BukuService();
        scanner = new Scanner(System.in);

        int opsi = 5;
        do {
            tampilkanMenu();
            try {
                scanner = new Scanner(System.in);
                opsi = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.err.println("Silahkan periksa input menunya");
                opsi = 0;
            } catch(NoSuchElementException e) {
                System.err.println("Inputnya exhausted");
                opsi = 0;
            } catch(IllegalStateException e) {
                System.err.println("Scanner ketutup");
                opsi = 0;
            }
            seleksi(opsi);
        } while(opsi != 5);
    }

    private static void seleksi(int opsi) {
        switch(opsi) {
            case 1:
                callFormTambahData();
                break;
            case 2:
                callFormUbahData();
                break;
            case 3:
                callFormHapusData();
                break;
            case 4:
                service.tampilkanData();
                break;
        }
    }

    private static void callFormHapusData() {
        scanner = new Scanner(System.in);

        System.out.print("ID : ");
        String id = scanner.nextLine();
        service.hapusData(id);
    }

    private static void callFormUbahData() {
        scanner = new Scanner(System.in);
        String id, judul, pengarang, harga;

        System.out.println("\n-= Form Ubah Data =-");
        System.out.print("ID : ");
        id = scanner.nextLine();
        System.out.print("JUDUL : ");
        judul = scanner.nextLine();
        System.out.print("PENGARANG : ");
        pengarang = scanner.nextLine();
        System.out.print("HARGA : ");
        harga = scanner.nextLine();
        service.ubahData(new Buku(id, judul, pengarang, harga));
    }

    private static void callFormTambahData() {
        scanner = new Scanner(System.in);
        String id, judul, pengarang, harga;

        System.out.println("\n-= Form Ubah Data =-");
        System.out.print("ID : ");
        id = scanner.nextLine();
        System.out.print("JUDUL : ");
        judul = scanner.nextLine();
        System.out.print("PENGARANG : ");
        pengarang = scanner.nextLine();
        System.out.print("HARGA : ");
        harga = scanner.nextLine();
        service.tambahData(new Buku(id, judul, pengarang, harga));
    }

    private static void tampilkanMenu() {
        System.out.println("\n--== Aplikasi Mahasiswa ==--");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. KELUAR");
        System.out.println("----------------");
        System.out.print  ("opsi > ");
    }

}