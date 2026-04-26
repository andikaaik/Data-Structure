package Tp2.Sistem_data_buku;
class Node {
    String kodeBuku;
    String judul;
    String penulis;
    Node next;

    public Node(String kodeBuku, String judul, String penulis){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.next = null;
    }
}
