/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_praktikum_no2;

/**
 *
 * @author dzikr
 */
class User extends Pengguna{
    
    public User (String nama){
        super.nama = nama;
    }


    @Override
    public void lihatBuku() {
        Buku.lihatDaftarBuku();
    }

}
