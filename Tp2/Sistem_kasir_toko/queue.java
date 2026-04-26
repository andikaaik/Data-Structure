package Tp2.Sistem_kasir_toko;

class Queue {
    Node front, rear;
    int size = 0;

    // Enqueue: tambah pelanggan ke antrian
    public void enqueue(String nomor, String nama, int total) {
        Node newNode = new Node(nomor, nama, total);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println("Data pelanggan ditambahkan ke antrian!");
    }

    // Dequeue: melayani pelanggan
    public Node dequeue() {
        if (front == null) {
            System.out.println("Antrian kosong!");
            return null;
        }

        Node temp = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        return temp;
    }

    // Isi antrian
    public void display() {
        if (front == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        Node temp = front;
        System.out.println("\n=== ANTRIAN SAAT INI ===");
        while (temp != null) {
            System.out.println(temp.nomorAntrian + " | " + temp.nama + " | Rp" + temp.total);
            temp = temp.next;
        }
    }

    public int getSize() {
        return size;
    }
}