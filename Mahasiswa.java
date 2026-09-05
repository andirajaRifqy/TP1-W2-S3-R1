public class Mahasiswa {

    // Atribut mahasiswa menggunakan private untuk menerapkan encapsulation
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

    // Getter untuk mendapatkan NIM
    public String getNim() {
        return nim;
    }

    // Getter untuk mendapatkan nilai IPK
    public double getIpk() {
        return ipk;
    }

    // Setter untuk memperbarui nilai IPK
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Method untuk memperbarui IPK mahasiswa
    public void updateIpk(double ipkBaru) {
        setIpk(ipkBaru);
    }

    // Method untuk menentukan status kelulusan
    public String cekKelulusan() {
        if (ipk >= 3.00) {
            return "Lulus";
        } else {
            return "Belum Lulus";
        }
    }

    // Method untuk menentukan predikat akademik berdasarkan IPK
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

    // Method untuk menampilkan seluruh informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.printf("IPK: %.2f%n", ipk);
        System.out.println("Status: " + cekKelulusan());
        System.out.println("Predikat: " + hitungPredikat());
        System.out.println();
    }
}
