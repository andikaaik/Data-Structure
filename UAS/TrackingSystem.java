import java.util.*;

public class TrackingSystem {

    Queue<Shipment> shipmentQueue;

    HashMap<Integer, Shipment> shipmentMap;

    public TrackingSystem() {

        shipmentQueue = new LinkedList<>();

        shipmentMap = new HashMap<>();
    }

    public void addShipment(Shipment shipment) {

        shipmentQueue.add(shipment);

        shipmentMap.put(shipment.id, shipment);

        System.out.println("Shipment berhasil ditambahkan.");
    }

    public void processShipment() {

        Shipment shipment = shipmentQueue.poll();

        if(shipment != null) {

            System.out.println("Processing Shipment ID : " + shipment.id);
        }
        else {

            System.out.println("Queue kosong.");
        }
    }

    public void updateStatus(int id, String status) {

        Shipment shipment = shipmentMap.get(id);

        if(shipment != null) {

            shipment.updateStatus(status);

            System.out.println("Status berhasil diupdate.");
        }
        else {

            System.out.println("Shipment tidak ditemukan.");
        }
    }

    public void rollbackStatus(int id) {

        Shipment shipment = shipmentMap.get(id);

        if(shipment != null) {

            shipment.rollbackStatus();
        }
        else {

            System.out.println("Shipment tidak ditemukan.");
        }
    }

    public void searchShipment(int id) {

        Shipment shipment = shipmentMap.get(id);

        if(shipment != null) {

            shipment.showDetail();

            shipment.showHistory();
        }
        else {

            System.out.println("Shipment tidak ditemukan.");
        }
    }
}