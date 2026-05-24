import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        TrackingSystem system = new TrackingSystem();

        int pilihan;

        do {

            System.out.println("\n=== SHIPMENT TRACKING SYSTEM ===");
            System.out.println("1. Tambah Shipment");
            System.out.println("2. Update Status");
            System.out.println("3. Rollback Status");
            System.out.println("4. Search Shipment");
            System.out.println("5. Process Shipment");
            System.out.println("0. Exit");

            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();

            switch(pilihan) {

                case 1:

                    System.out.print("Masukkan Shipment ID : ");
                    int id = input.nextInt();

                    Shipment shipment = new Shipment(id);

                    system.addShipment(shipment);

                    break;

                case 2:

                    System.out.print("Masukkan Shipment ID : ");
                    int updateId = input.nextInt();

                    input.nextLine();

                    System.out.print("Masukkan Status Baru : ");
                    String status = input.nextLine();

                    system.updateStatus(updateId, status);

                    break;

                case 3:

                    System.out.print("Masukkan Shipment ID : ");
                    int rollbackId = input.nextInt();

                    system.rollbackStatus(rollbackId);

                    break;

                case 4:

                    System.out.print("Masukkan Shipment ID : ");
                    int searchId = input.nextInt();

                    system.searchShipment(searchId);

                    break;

                case 5:

                    system.processShipment();

                    break;

                case 0:

                    System.out.println("Program selesai.");

                    break;

                default:

                    System.out.println("Menu tidak valid.");
            }

        } while(pilihan != 0);

        input.close();
    }
}