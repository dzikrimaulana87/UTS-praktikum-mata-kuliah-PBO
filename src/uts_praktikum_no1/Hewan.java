/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_praktikum_no1;

/**
 *
 * @author dzikr
 */
class Hewan {

    protected String jenisSuara;

    // Konstruktor
    public Hewan(String jenisSuara) {
        this.jenisSuara = jenisSuara;
    }

    // Metode bersuara
    public void bersuara() {
        System.out.println("Hewan ini akan bersuara");
    }

    // Variabel isMamal di sini
    protected boolean isMamal;
}
