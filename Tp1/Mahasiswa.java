// Class Mahasiswa
class Mahasiswa {

    // Atribut private (enkapsulasi)
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;
    // Constructor untuk menginisialisasi data mahasiswa
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }
    // Getter untuk mengambil nilai IPK
    public double getIpk() {
        return ipk;
    }
    // Setter untuk mengubah IPK
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    // Getter NIM (dipakai untuk pencarian)
    public String getNim() {
        return nim;
    }
    // Method untuk mengecek status kelulusan
    public String cekKelulusan() {
        if (ipk >= 3.00) {
            return "Lulus";
        } else {
            return "Belum Lulus";
        }
    }
    // Method untuk menentukan predikat akademik
    public String hitungPredikat() {

        if (ipk >= 3.75) {
            return "Dengan Pujian";
        } else if (ipk >= 3.50) {
            return "Sangat Memuaskan";
        } else if (ipk >= 3.00) {
            return "Memuaskan";
        } else {
            return "Perlu Perbaikan";
        }
    }
    // Method untuk menampilkan data mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
        System.out.println("Status: " + cekKelulusan());
        System.out.println("Predikat: " + hitungPredikat());
        System.out.println();
    }
}