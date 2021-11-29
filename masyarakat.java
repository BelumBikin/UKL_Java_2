/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

import java.util.ArrayList;

public class masyarakat extends user{
    //enkap
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public void Masyarakat(String nama, String alamat, String telepon){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telepon);
        setIdMasyarakat(namaMasyarakat.indexOf(nama));
    }

    public int getIndexFromName(String nama){
        return namaMasyarakat.indexOf(nama);
    }
    public int getIdMasyarakat(int id) {
        return idMasyarakat.get(id);
    }

    public void setIdMasyarakat(int id) {
        this.idMasyarakat.add(id);
    }

    //Polimor
    @Override
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int Id) {
        return namaMasyarakat.get(Id);
    }

    @Override
    public String getAlamat(int Id) {
        return alamat.get(Id);
    }

    @Override
    public String getTelepon(int Id) {
        return alamat.get(Id);
    }
}