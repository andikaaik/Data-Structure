package Tp2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int pilihan;

        do {
            System.out.println("\n===== SISTEM DATA BUKU =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan Kode Buku: ");
                    String kode = input.nextLine();

                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan Penulis: ");
                    String penulis = input.nextLine();

                    list.push(kode, judul, penulis);
                    break;

                case 2:
                    list.pop();
                    break;

                case 3:
                    System.out.print("Masukkan kode buku: ");
                    String cari = input.nextLine();
                    list.search(cari);
                    break;

                case 4:
                    list.display();
                    break;

                case 5:
                    System.out.println("Keluar dari program");
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 5);
        input.close();
}
}