/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author TOSHIBA
 */
public class MainTugas {
     public static void main(String[] args){     
       Dosen dsn = new Dosen();
       Pegawai pgw = new Pegawai();
       DaftarGaji dg = new DaftarGaji();
       
       //pegawai 1
      Pegawai p1 = new Pegawai();
      dsn.setNama("Indah Retno");
      dsn.setNip("2141762104");
      dsn.setAlamat("Blitar");
      //dg.addPegawai(p1);
      dsn.setSKS(4);
      dsn.getGaji();
      dsn.gajiPegawai();
      
      //pegawai 2
      Pegawai p2 = new Pegawai();
      dsn.setNama("Retnoi");
      dsn.setNip("2141762105");
      dsn.setAlamat("Blitar");
      //dg.addPegawai(p2);
      dsn.setSKS(5);
      dsn.getGaji();
      dsn.gajiPegawai();
      
      //pegawai3
      Pegawai p3 = new Pegawai();
      dsn.setNama("Retnoi");
      dsn.setNip("2141762105");
      dsn.setAlamat("Malang");
      //dg.addPegawai(p3);
      dsn.setSKS(2);
      dsn.getGaji();
      dsn.gajiPegawai();
      
      //pegawai4
      Pegawai p4 = new Pegawai();
      dsn.setNama("Retnoindah");
      dsn.setNip("2141762106");
      dsn.setAlamat("Trenggalek");
      //dg.addPegawai(p4);
      dsn.setSKS(2);
      dsn.getGaji();
      dsn.gajiPegawai();
     }
}
