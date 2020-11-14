/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.siapakamu;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi class Dosen yang merupakan subclass dari superclass Manusia 
 */

public class Dosen extends Manusia{
    private String nip, mataKuliah;
    
    public String getNip() {
        return nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getMataKuliah() {
        return mataKuliah;
    }
    
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa() {
        System.out.println("Saya ".concat(getNama()
                .concat(" umur ") + getUmur() + 
                " tahun sedang mengajar matakuliah ".concat(getMataKuliah()) )
        );
    }
    
    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}
