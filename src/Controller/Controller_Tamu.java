/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAO_Tamu;
import DAO_Implements.Implement_Tamu;
import Model.Tamu;
import TableModel.TableModel_Tamu;
import View.MainProgram;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public class Controller_Tamu {
  MainProgram view;
  DAO_Tamu implement;
  List<Tamu> li;
  
  public Controller_Tamu(MainProgram view){
    this.view = view;
    implement = new Implement_Tamu();
  }
  
  public void isiTabel(){
    li = implement.getALL();
    TableModel_Tamu table = new TableModel_Tamu(li);
    view.getTableTamu().setModel(table);
  }
  
  public void isiTabelCari(){
    li = implement.getSearch(view.getTxtCari().getText());
    TableModel_Tamu table = new TableModel_Tamu(li);
    view.getTableTamu().setModel(table);
  }
  
  public void search(MainProgram view){
    if(!view.getTxtCari().getText().trim().isEmpty()){
      implement.getSearch(view.getTxtCari().getText());
      isiTabelCari();
    } else{
      isiTabel();
    }
  }
  
  public void insert(MainProgram d){
    Tamu m = new Tamu();
    m.setNama_tamu(d.getTxtNama().getText());
    m.setAlamat(d.getTxtAlamat().getText());
    m.setNo_telepon(d.getTxtTelepon().getText());
    m.setTujuan_tamu(d.getTxtTujuan().getText());
    m.setTanggal_masuk(d.getTxtTglMasuk().getText());
    m.setWaktu_masuk(d.getTxtWktMasuk().getText());
    implement.add(m);
  }
  
  public void update(MainProgram d){
    Tamu m = new Tamu();
    m.setId(d.getTxtID().getText());
    m.setNama_tamu(d.getTxtNama().getText());
    m.setAlamat(d.getTxtAlamat().getText());
    m.setNo_telepon(d.getTxtTelepon().getText());
    m.setTujuan_tamu(d.getTxtTujuan().getText());
    m.setTanggal_masuk(d.getTxtTglMasuk().getText());
    m.setWaktu_masuk(d.getTxtWktMasuk().getText());
    m.setWaktu_keluar(d.getTxtWktKeluar().getText());
    implement.update(m);
  }
  
  public void delete(String nama){
    implement.delete(nama);
  }
}
