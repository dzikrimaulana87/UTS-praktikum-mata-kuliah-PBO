/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_praktikum_no1;

/**
 *
 * @author dzikr
 */
//###### konsep inheritence (kelas anakan)
class Anjing extends Hewan {

    // Konstruktor
    public Anjing() {
        super("Guk Guk");
        this.isMamal = true;
    }

    //Konsep Polymorphism
    // Override metode bersuara
    @Override
    public void bersuara() {
        System.out.println("Anjing bersuara: " + jenisSuara);
    }
}
