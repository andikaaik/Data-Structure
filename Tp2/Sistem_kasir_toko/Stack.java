package Tp2.Sistem_kasir_toko;

class Stack {
    Node top;

    // Push: simpan transaksi ke stack
    public void push(Node data) {
        if (data == null) return;

        Node newNode = new Node(data.nomorAntrian, data.nama, data.total);
        newNode.next = top;
        top = newNode;

        System.out.println("Transaksi disimpan ke riwayat.");
    }

    public void display() {
        if (top == null) {
            System.out.println("Belum ada riwayat transaksi.");
            return;
        }

        Node temp = top;
        System.out.println("\n=== RIWAYAT TRANSAKSI (Terbaru) ===");
        while (temp != null) {
            System.out.println(temp.nomorAntrian + " | " + temp.nama + " | Rp" + temp.total);
            temp = temp.next;
        }
    }
}