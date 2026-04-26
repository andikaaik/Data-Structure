package Tp2.Sistem_kasir_toko;

import java.util.Scanner;

public class SistemKasir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        Stack stack = new Stack();

        int pilihan;

        do {
            System.out.println("\n=== SISTEM KASIR TOKO ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Riwayat Transaksi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    // Input data pelanggan
                    System.out.print("Masukkan Nomor Antrian: ");
                    String nomor = sc.nextLine();

                    System.out.print("Masukkan Nama Pelanggan: ");
                    String nama = sc.nextLine();

                    System.out.print("Masukkan Total Belanja: ");
                    int total = sc.nextInt();

                    queue.enqueue(nomor, nama, total);

                    if (queue.getSize() < 5) {
                        System.out.println("");
                    }
                    break;

                case 2:
                    // Layani pelanggan
                    Node data = queue.dequeue();
                    if (data != null) {
                        System.out.println("Melayani pelanggan " 
                            + data.nomorAntrian + " (" + data.nama + ")");
                        stack.push(data);
                    }
                    break;

                case 3:
                    queue.display();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        sc.close();
    }
}
