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
class Admin extends Pengguna implements AksesAdmin {
    
    public Admin(String nama){
        super.nama = nama;
    }


    //###### konsep polymorphism
    @Override
    public void tambahBuku(Buku buku) {
        Buku.tambahBuku(buku);
    }

    @Override
    public void lihatBuku() {
        Buku.lihatDaftarBuku();
    }

    @Override
    public void hapusBuku(String idBuku) {
        Buku.hapusBuku(idBuku);
    }
}
