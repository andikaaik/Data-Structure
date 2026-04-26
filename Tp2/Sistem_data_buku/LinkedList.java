package Tp2.Sistem_data_buku;

class LinkedList {
    Node head;
    //Tambah buku
    public void push(String kode, String judul, String penulis){
        if (kode.length() > 5) {
            System.out.println("kode maksimal 5 karakter");
            return;
        }

        Node newNode = new Node(kode, judul, penulis);

        if(head == null){
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Data berhasil ditambahkan!");
    }
    //Hapus buku
    public void pop() {
    if (head == null) {
        System.out.println("Tidak ada data untuk dihapus.");
        return;
    }

    if (head.next == null) {
        head = null;
    } else {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    System.out.println("Data terakhir berhasil dihapus!");
}
    //Cari buku
    public void search(String kode){
        Node temp = head;

        while (temp != null) {
            if (temp.kodeBuku.equals(kode)) {
                System.out.println("Data ditemukan:");
                System.out.println("Kode:" + temp.kodeBuku + 
                                   " | Judul: " + temp.judul + 
                                   " | Penulis: " + temp.penulis);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Buku tidak ditemukan");
    }
    //Tampilkan semua buku
    public void display(){
        if (head == null) {
            System.out.println("Daftar buku kosong");
            return;
        }
        Node temp = head;
        int count = 0;

        System.out.println("\nDaftar Buku");

        while (temp != null) {
            System.out.println("Kode: " + temp.kodeBuku +
                               " | Judul: " + temp.judul +
                               " | Penulis: " + temp.penulis);
            
            temp = temp.next;
            count++;
        }
        System.out.println("Total buku: " + count);
    }
}
