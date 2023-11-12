/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_praktikum_no1;

import java.util.Scanner;

/**
 *
 * @author dzikr
 */
public class HewanAksi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input user
        System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
        String jenisHewan = scanner.nextLine();
        Hewan hewan;

        // cek inputan untuk memanggil object
        if (jenisHewan.equalsIgnoreCase("Kucing")) {
            hewan = new Kucing();
        } else if (jenisHewan.equalsIgnoreCase("Anjing")) {
            hewan = new Anjing();
        } else {
            System.out.println("Hewan tidak dalam pilihan");
            return;
        }

        hewan.bersuara();

        if (((Hewan) hewan).isMamal) {
            System.out.println("Hewan dalam pilihan dan adalah mamalia");
        }
        scanner.close();
    }
}
