import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner digunakan untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Membuat array untuk menyimpan 5 objek Mahasiswa
        Mahasiswa[] daftar = new Mahasiswa[5];

        // Membuat 5 objek mahasiswa dengan data yang berbeda
        daftar[0] = new Mahasiswa(
                "Andi Tenri Aulia",
                "2441001",
                "Teknik Informatika",
                3.82
        );

        daftar[1] = new Mahasiswa(
                "Nurul Mappasomba",
                "2441002",
                "Sistem Informasi",
                3.46
        );

        daftar[2] = new Mahasiswa(
                "Muhammad Fadli Baso",
                "2441003",
                "Teknik Industri",
                3.91
        );

        daftar[3] = new Mahasiswa(
                "Sitti Rahma Daeng Rannu",
                "2441004",
                "Akuntansi",
                2.88
        );

        daftar[4] = new Mahasiswa(
                "Fajar Makkasau",
                "2441005",
                "Manajemen",
                3.58
        );

        // Menampilkan seluruh data mahasiswa menggunakan loop
        System.out.println("=== Data Mahasiswa ===");
        System.out.println();

        for (Mahasiswa mahasiswa : daftar) {
            mahasiswa.tampilkanInfo();
        }

        // Meminta pengguna memasukkan NIM mahasiswa yang ingin diupdate
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String nimCari = input.nextLine();

        boolean ditemukan = false;

        // Mencari mahasiswa berdasarkan NIM
        for (Mahasiswa mahasiswa : daftar) {

            if (mahasiswa.getNim().equals(nimCari)) {

                ditemukan = true;

                // Meminta nilai IPK baru
                System.out.print("Masukkan IPK baru: ");
                double ipkBaru = input.nextDouble();

                // Memperbarui IPK mahasiswa
                mahasiswa.updateIpk(ipkBaru);

                System.out.println();
                System.out.println("Data berhasil diperbarui!");
                System.out.println();

                // Menampilkan kembali informasi mahasiswa setelah IPK diperbarui
                System.out.println("=== Data Mahasiswa ===");
                mahasiswa.tampilkanInfo();

                break;
            }
        }

        // Pesan ditampilkan jika NIM tidak ditemukan
        if (!ditemukan) {
            System.out.println();
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }

        input.close();
    }
}
