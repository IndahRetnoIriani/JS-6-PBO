/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author TOSHIBA : Indah Retno Iriani
 */
public class Pegawai{
    public String nip;
    public String nama;
    public String alamat;
    
    Pegawai(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    Pegawai() {
        
    }

    public String getNama(){
        return nama;
    }
    public String getNip(){
        return nama;
    }
    public String getAlamat(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }    
}
