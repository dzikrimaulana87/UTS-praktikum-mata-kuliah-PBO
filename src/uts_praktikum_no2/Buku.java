/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_praktikum_no2;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 *
 * @author dzikr
 */
class Buku {

    //###### contoh konsep enkapsulasi (masih banyak yang lainnya di class lain)
    
    private static List<Buku> daftarBuku = new ArrayList<>();

    private String idBuku;
    private String judul;
    private String genre;

    public Buku(String idBuku, String judul, String genre) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.genre = genre;
    }

    public static List<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public static void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan.");
    }

    public static void lihatDaftarBuku() {
        System.out.println("Daftar Buku:");

        if (daftarBuku.isEmpty()) {
            System.out.println("\nBelum ada buku didalam daftar, hubungi Admin...\n");
        } else {
            for (Buku buku : daftarBuku) {
                System.out.println("ID: " + buku.getIdBuku() + ", Judul: " + buku.getJudul() + ", Genre: " + buku.getGenre());
            }
        }
    }

    public static void hapusBuku(String idBuku) {
        Iterator<Buku> iterator = daftarBuku.iterator();
        while (iterator.hasNext()) {
            Buku buku = iterator.next();
            if (buku.getIdBuku().equals(idBuku)) {
                iterator.remove();
                System.out.println("Buku dengan ID " + idBuku + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Buku dengan ID " + idBuku + " tidak ditemukan.");
    }
}
