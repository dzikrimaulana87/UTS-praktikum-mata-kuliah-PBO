/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_praktikum_no1;

/**
 *
 * @author dzikr
 */
class Kucing extends Hewan {
    // Konstruktor
    public Kucing() {
        super("Meong");
        this.isMamal = true;
    }

    // Override metode bersuara
    @Override
    public void bersuara() {
        System.out.println("Kucing bersuara: " + jenisSuara);
    }
}
