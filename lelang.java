/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

import java.util.ArrayList;

public class lelang implements proseslelang{
    //fungsi yang di gunakan untuk memasukan class Interface sebagai nilai asli dari suatu progam
    ArrayList<Boolean> Status = new ArrayList<Boolean>();
    ArrayList<Integer> idPenawar = new ArrayList<>();
    ArrayList<Integer> idBarang = new ArrayList<>();
    ArrayList<Integer> hargaTawar = new ArrayList<>();
    //ArrayList dapat menambah data baru secara dinamis tanpa harus menentukan ukurannya di awal.

    //polimor
    @Override
    public void addPenawar(int Id) {
        this.idPenawar.add(Id);
    }

    @Override
    public void addIdBarang(int Id) {
        this.idBarang.add(Id);
    }

    @Override
    public void addHargaTawar(int harga) {
        this.hargaTawar.add(harga);
    }

    @Override
    public void setStatus(boolean status) {
        this.Status.add(status);
    }

    @Override
    public int getHargaTertinggi() {
        return 0;
    }

    @Override
    public int getIdPenawar() {
        return 0;
    }

    @Override
    public boolean getStatus(int id) {
        return this.Status.get(id);
    }
}