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
public class DaftarGaji {
    public Pegawai[] listPegawai = new Pegawai[4];
    public int gaji;
    public String nama;
    private int jmlPegawai;
    DaftarGaji(){
    }
    public void DaftarGaji(){
        System.out.println("Tarif Gaji per-SKS");
        System.out.println("1 SKS = 100000");
        
    } 
    public void addPegawai(Pegawai p){   
        int jmlPegawai = 4;
        this.listPegawai[jmlPegawai] = p;
        this.jmlPegawai++;
    }
    public void printSemuaGaji(){
        for(int i=0; i<jmlPegawai;i++){
            System.out.println(listPegawai[i].getNama()); 
            System.out.println(listPegawai[i].getNip()); 
            System.out.println(listPegawai[i].getAlamat());
        }
    }
    public Pegawai[] getlistPegawai(){
        return this.listPegawai;
    }
}
