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
 * Deskripsi Program : Program ini berisi mespesifikasikan Siapa Kamu apakah Dosen atau Mahasiswa dengan 
 * pendekatan object oriented dan penerapan konsep pewarisan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setNip("41227829930");
        dosen.setMataKuliah("PBO");
        System.out.println("NIP : ".concat(dosen.getNip()));
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Dandi Ahmadin");
        mhs.setUmur(20);
        mhs.setNim("10119033");
        mhs.setKelas("IF-1");
        System.out.println("\nNIM : ".concat(mhs.getNim()));
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}
