package Tp2.Sistem_kasir_toko;

// Menyimpan data pelanggan
class Node {
    String nomorAntrian;
    String nama;
    int total;
    Node next;

    public Node(String nomorAntrian, String nama, int total) {
        this.nomorAntrian = nomorAntrian;
        this.nama = nama;
        this.total = total;
        this.next = null;
    }
}