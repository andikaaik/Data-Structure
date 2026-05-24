import java.util.Stack;

public class Shipment {

    int id;
    String currentStatus;

    Stack<String> history;

    public Shipment(int id) {

        this.id = id;
        this.currentStatus = "CREATED";

        history = new Stack<>();
        history.push(currentStatus);
    }

    public void updateStatus(String status) {

        currentStatus = status;

        history.push(status);
    }

    public void rollbackStatus() {

        if(history.size() > 1) {

            history.pop();

            currentStatus = history.peek();

            System.out.println("Rollback berhasil.");
        }
        else {

            System.out.println("Tidak ada status sebelumnya.");
        }
    }

    public void showHistory() {

        System.out.println("History Status : " + history);
    }

    public void showDetail() {

        System.out.println("Shipment ID : " + id);
        System.out.println("Current Status : " + currentStatus);
    }
}