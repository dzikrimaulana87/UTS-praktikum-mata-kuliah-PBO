/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_praktikum_no2;
/**
 *
 * @author dzikr
 */
class Admin extends Pengguna implements AksesAdmin {


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
