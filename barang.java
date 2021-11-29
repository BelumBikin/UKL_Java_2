/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class barang extends lelang {
    Scanner input = new Scanner(System.in);

    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<String> hargaAwal = new ArrayList<String>();


    public int getIdMasyarakat(int index) {
        return idMasyarakat.get(index);
    }

    void overrideHargaTawar(){
        this.hargaTawar.clear();
    }
    //polimor
    @Override
    public int getHargaTertinggi() {
        return Collections.max(hargaTawar); //memanggil harga tawar dari lelang (inheri)
    }
    //inter
    public void addIdMasyarakat(int Id) {
        this.idMasyarakat.add(Id);
    }

    public String getNamaBarang(int index) {
        return namaBarang.get(index);
    }

    public void addNamaBarang(String nama) {
        this.namaBarang.add(nama);
    }

    public String getHargaAwal(int index) {
        return hargaAwal.get(index);
    }

    public void addHargaAwal(String harga) {
        this.hargaAwal.add(harga);
        this.addHargaTawar(Integer.parseInt(harga));
    }
    public void setStatus(int index, boolean status){
        Status.add(index, status);
    }
    public int getIdMasyarakat() {
        int index = input.nextInt();
        return idMasyarakat.get(index);
    }

    public void addIdMasyarakat() {
        int Id = input.nextInt();
        this.idMasyarakat.add(Id);
    }

    public String getNamaBarang() {
        int index = input.nextInt();
        return namaBarang.get(index);
    }

    public void addNamaBarang() {
        String nama = input.nextLine();
        this.namaBarang.add(nama);
    }

    public int getHargaAwal() {
        int index = input.nextInt();
        return Integer.parseInt(hargaAwal.get(index));
    }

    public void addHargaAwal() {
        String harga = input.nextLine();
        this.hargaAwal.add(harga);
    }

    //Polimor
    @Override
    public void addIdBarang(int ID) {
        super.addIdBarang(ID);
    }

    public void tampilBarang(){
        int i, n = namaBarang.size();
        for (i=0; i<n; i++){
            System.out.println("+-------------+");
            System.out.println("ID : " + namaBarang.indexOf(getNamaBarang(i)));
            addIdBarang(namaBarang.indexOf(getNamaBarang(i)));
            System.out.println("Nama Barang : " +getNamaBarang(i));
            System.out.println("Harga awal : "+getHargaAwal(i));
            System.out.println("Dapat dilelang? : "+getStatus(i));
            System.out.println("+-------------+");
            System.out.println();
        }
    }
}