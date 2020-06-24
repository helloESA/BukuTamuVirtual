/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO_Implements;

import Config.DB_Utilities;
import DAO.DAO_Tamu;
import Model.Tamu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MohamadEsa
 */
public class Implement_Tamu implements DAO_Tamu{

  Connection koneksi;
  
  public Implement_Tamu(){}
  
  @Override
  public List<Tamu> getALL() {
    koneksi = DB_Utilities.config();
    Statement sta = null;
    ResultSet res = null;
    List<Tamu> li = null;
    
    try {
      String query = "SELECT * FROM tamu ORDER BY id_tamu DESC";
      
      li = new ArrayList<>();
      
      sta = koneksi.createStatement();
      res = sta.executeQuery(query);
      
      while(res.next()){
        Tamu m = new Tamu();
        m.setId(res.getString("id_tamu"));
        m.setNama_tamu(res.getString("nama_tamu"));
        m.setAlamat(res.getString("alamat"));
        m.setNo_telepon(res.getString("no_telepon"));
        m.setTujuan_tamu(res.getString("tujuan_tamu"));
        m.setTanggal_masuk(res.getString("tanggal_masuk"));
        m.setWaktu_masuk(res.getString("waktu_masuk"));
        m.setWaktu_keluar(res.getString("waktu_keluar"));
        li.add(m);
      }
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "Table Gagal Ditampilkan","Perhatian",JOptionPane.WARNING_MESSAGE);
      System.out.println("[100] Terjadi Kesalahan : "+e);
    } finally{
      try {
        koneksi.close();
        res.close();
        sta.close();
      } catch (SQLException e) {
        System.out.println("[100A] Terjadi Kesalahan : "+e);
      }
    }
    return li;
  }
  
  @Override
  public List<Tamu> getSearch(String data) {
    koneksi = DB_Utilities.config();
    Statement sta = null;
    ResultSet res = null;
    List<Tamu> li = null;
    
    try {
      String query = "SELECT * FROM tamu WHERE nama_tamu like '%"+data+"%'";
      
      li = new ArrayList<>();
      
      sta = koneksi.createStatement();
      res = sta.executeQuery(query);
      
      while(res.next()){
        Tamu m = new Tamu();
        m.setId(res.getString("id_tamu"));
        m.setNama_tamu(res.getString("nama_tamu"));
        m.setAlamat(res.getString("alamat"));
        m.setNo_telepon(res.getString("no_telepon"));
        m.setTujuan_tamu(res.getString("tujuan_tamu"));
        m.setTanggal_masuk(res.getString("tanggal_masuk"));
        m.setWaktu_masuk(res.getString("waktu_masuk"));
        m.setWaktu_keluar(res.getString("waktu_keluar"));
        li.add(m);
      }
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "Table Gagal Ditampilkan","Perhatian",JOptionPane.WARNING_MESSAGE);
      System.out.println("[101] Terjadi Kesalahan : "+e);
    } finally{
      try {
        koneksi.close();
        res.close();
        sta.close();
      } catch (SQLException e) {
        System.out.println("[101-A] Terjadi Kesalahan : "+e);
      }
    }
    return li;
  }

  @Override
  public void add(Tamu data) {
    koneksi = DB_Utilities.config();
    PreparedStatement stat = null;
    String  nama = data.getNama_tamu(),
            alamat = data.getAlamat(),
            no_tel = data.getNo_telepon(),
            tujuan = data.getTujuan_tamu(),
            tgl_masuk = data.getTanggal_masuk(),
            wkt_masuk = data.getWaktu_masuk(),
            wkt_keluar = data.getWaktu_keluar();
    
    try {
      String query = "INSERT INTO `tamu`(`id_tamu`, `nama_tamu`, `alamat`, `no_telepon`, `tujuan_tamu`, `tanggal_masuk`, `waktu_masuk`, `waktu_keluar`) VALUES (null, ?, ?, ?, ?, ?, ?, ?)";
      stat = koneksi.prepareStatement(query);
      stat.setString(1, nama);
      stat.setString(2, alamat);
      stat.setString(3, no_tel);
      stat.setString(4, tujuan);
      stat.setString(5, tgl_masuk);
      stat.setString(6, wkt_masuk);
      stat.setString(7, wkt_keluar);
      stat.executeUpdate();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "Data Gagal Ditambahkan","Perhatian",JOptionPane.WARNING_MESSAGE);
      System.out.println("[200] Terjadi Kesalahan : "+e);
    } finally{
      try {
        koneksi.close();
        stat.close();
      } catch (SQLException e) {
        System.out.println("[200-A] Terjadi Kesalahan : "+e);
      }
    }
  }

  @Override
  public void update(Tamu data) {
    koneksi = DB_Utilities.config();
    PreparedStatement stat = null;
    String  id = data.getId(),
            nama = data.getNama_tamu(),
            alamat = data.getAlamat(),
            no_tel = data.getNo_telepon(),
            tujuan = data.getTujuan_tamu(),
            tgl_masuk = data.getTanggal_masuk(),
            wkt_masuk = data.getWaktu_masuk(),
            wkt_keluar = data.getWaktu_keluar();
    
    try {
      String query = "UPDATE `tamu` SET `nama_tamu`=?,`alamat`=?,`no_telepon`=?,`tujuan_tamu`=?,`tanggal_masuk`=?,`waktu_masuk`=?,`waktu_keluar`=? WHERE `id_tamu`=?";
      stat = koneksi.prepareStatement(query);
      stat.setString(1, nama);
      stat.setString(2, alamat);
      stat.setString(3, no_tel);
      stat.setString(4, tujuan);
      stat.setString(5, tgl_masuk);
      stat.setString(6, wkt_masuk);
      stat.setString(7, wkt_keluar);
      stat.setString(8, id);
      stat.executeUpdate();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "Data Gagal Diperbarui","Perhatian",JOptionPane.WARNING_MESSAGE);
      System.out.println("[201-A] Terjadi Kesalahan : "+e);
    } finally{
      try {
        koneksi.close();
        stat.close();
      } catch (SQLException e) {
        System.out.println("[201] Terjadi Kesalahan : "+e);
      }
    }
  }

  @Override
  public void delete(String data) {
    koneksi = DB_Utilities.config();
    PreparedStatement stat = null;
    
    try {
      String query = "DELETE FROM `tamu` WHERE id_tamu='"+data+"'";
      stat = koneksi.prepareStatement(query);
      
      stat.executeUpdate();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "Data Gagal Dihapus","Perhatian",JOptionPane.WARNING_MESSAGE);
      System.out.println("[202-A] Terjadi Kesalahan : "+e);
    } finally{
      try {
        koneksi.close();
        stat.close();
      } catch (SQLException e) {
        System.out.println("[202] Terjadi Kesalahan : "+e);
      }
    }
  }
}
