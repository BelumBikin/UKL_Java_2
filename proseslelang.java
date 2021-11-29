/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

import java.util.ArrayList;
//inter
//Adalah nilai abstrak yang belum di isi apa² 
//mengandung deklarasi method tanpa implemen
public interface proseslelang {
    void addPenawar(int Id);
    void addIdBarang(int Id);
    void addHargaTawar(int harga);
    void setStatus(boolean status);

    int getHargaTertinggi();
    int getIdPenawar();
    boolean getStatus(int id);
}