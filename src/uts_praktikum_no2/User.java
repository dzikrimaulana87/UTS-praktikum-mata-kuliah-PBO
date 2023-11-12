/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_praktikum_no2;

/**
 *
 * @author dzikr
 */
//###### konsep inheritence (kelas anakan)
class User extends Pengguna {

    public User(String nama) {
        super.nama = nama;
    }

    //###### konsep polymorphism
    @Override
    public void lihatBuku() {
        Buku.lihatDaftarBuku();
    }

}
