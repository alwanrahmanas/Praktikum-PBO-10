/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.file;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Mahasiswa implements Serializable {
    
    private String nim,nama,jenisKelamin;
    private int umur;
    private String alamat,provinsi;
    private ArrayList<String> hobi;

    void setNim(String string) {
     this.nim=string;
    }

    void setNama(String andi) {
        this.nama =andi;
    }

    String getNim() {
       return this.nim;
    }
    
    String getNama(){
        return this.nama;
    }
    
    
}
