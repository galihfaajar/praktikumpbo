/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;
/**
 *
 * @author G  A  L  I  H
 */
public class siswa {
    private String nama;
    private int nilai = 0;
    private String kelas;
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getNilai(){
        return nilai;
    }
    public void setNilai  (int nilai ) {
        this.nilai = nilai;
    }
    public String getKelas(){
        return kelas;
    }
    public void setKelas  (String kelas ) {
        this.kelas = kelas;
    }  
    public void cetak(){
        System.out.println("Nama    : " + getNama());
        System.out.println("Nilai   : " + getNilai());
        System.out.println("Kelas   : " + getKelas());
    }}