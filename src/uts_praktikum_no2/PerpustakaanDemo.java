/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_praktikum_no2;

/**
 *
 * @author dzikr
 */

import java.util.Scanner;

public class PerpustakaanDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop utama
        while (true) {

            System.out.print("Apakah Anda admin atau user? (admin/user/keluar): ");
            String jenisPengguna = scanner.nextLine();

            // Keluar dari program jika pengguna memilih "keluar"
            if ("keluar".equalsIgnoreCase(jenisPengguna)) {
                System.out.println("Terima kasih, keluar dari program.");
                break;
            }

            Pengguna pengguna;
            if ("admin".equalsIgnoreCase(jenisPengguna)) {
                System.out.println("Anda Masuk sebagai Admin");
                pengguna = new Admin();
            } else if ("user".equalsIgnoreCase(jenisPengguna)) {
                System.out.print("Anda Masuk sebagai users, masukkan nama : ");
                String nama = scanner.nextLine();
                pengguna = new User(nama);
                System.out.println("Selamat datang di perpustakaan, " + nama);
            } else {
                System.out.println("Jenis pengguna tidak valid.");
                continue;
            }

            Admin admin = new Admin();

            // Loop untuk menu
            while (true) {

                // Menampilkan menu
                System.out.println("Pilih menu:");
                System.out.println("1. Lihat Buku");

                if (pengguna instanceof Admin) {
                    System.out.println("2. Tambah Buku");
                    System.out.println("3. Hapus Buku");
                }

                System.out.print("Masukkan pilihan menu (1" + (pengguna instanceof Admin ? "/2/3" : "") + "/0 untuk keluar): ");
                int pilihanMenu = scanner.nextInt();
                scanner.nextLine(); // Membuang karakter baru dari buffer

                switch (pilihanMenu) {
                    case 1:
                        pengguna.lihatBuku();
                        break;
                    case 2:
                        if (pengguna instanceof Admin) {
                            System.out.print("Masukkan ID buku yang ingin ditambahkan: ");
                            String idBukuTambah = scanner.nextLine();
                            System.out.print("Masukkan judul buku: ");
                            String judulBukuTambah = scanner.nextLine();
                            System.out.print("Masukkan genre buku: ");
                            String genreBukuTambah = scanner.nextLine();

                            Buku bukuTambah = new Buku(idBukuTambah, judulBukuTambah, genreBukuTambah);
                            admin.tambahBuku(bukuTambah);
                        } else {
                            System.out.println("Anda tidak memiliki hak untuk menambah buku.");
                        }
                        break;
                    case 3:
                        if (pengguna instanceof Admin) {
                            System.out.print("Masukkan ID buku yang ingin dihapus: ");
                            String idBukuHapus = scanner.nextLine();
                            admin.hapusBuku(idBukuHapus);
                        } else {
                            System.out.println("Anda tidak memiliki hak untuk menghapus buku.");
                        }
                        break;
                    case 0:
                        System.out.println("Kembali ke menu utama.");
                        break;
                    default:
                        System.out.println("Pilihan menu tidak valid.");
                }

                System.out.print("Tekan Enter untuk melanjutkan...");
                scanner.nextLine();
                System.out.println("\n------------------------");

                // Keluar dari loop menu jika pengguna memilih "0"
                if (pilihanMenu == 0) {
                    break;
                }
            }
        }
    }
}
