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
public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int tarif_sks;
    public int gaji;
   
    Dosen (String nip, String nama, String alamat){
    }

    Dosen() {
    }
    public void setSKS(int  jumlahSKS){
        this.jumlahSKS = jumlahSKS;
    }
    public int getGaji(){
        gaji = jumlahSKS * 100000;
        return gaji;
    }
    public void gajiPegawai(){
        System.out.println("==================================");
        System.out.println("Nama   : " + nama);
        System.out.println("NIP    : " + nip);
        System.out.println("Alamat : " + alamat);
        System.out.println("Gaji   : " + gaji);
        System.out.println("==================================");
    }

}
