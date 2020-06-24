/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Model.Tamu;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MohamadEsa
 */
public class TableModel_Tamu extends AbstractTableModel{

  List<Tamu> li;
  
  public TableModel_Tamu(List<Tamu> li){
    this.li=li;
  }
  
  @Override
  public int getRowCount() {
    return li.size();
  }

  @Override
  public int getColumnCount() {
    return 8;
  }

  @Override
  public String getColumnName(int col) {
    switch(col){
      case 0 : return "ID";
      case 1 : return "NAMA TAMU";
      case 2 : return "ALAMAT";
      case 3 : return "NO TELEPON";
      case 4 : return "TUJUAN/KEPENTINGAN";
      case 5 : return "TANGGAL MASUK";
      case 6 : return "WAKTU MASUK";
      case 7 : return "WAKTU KELUAR";
      default: return null;
    }
  }

  @Override
  public Object getValueAt(int row, int col) {
    switch(col){
      case 0 : return li.get(row).getId();
      case 1 : return li.get(row).getNama_tamu();
      case 2 : return li.get(row).getAlamat();
      case 3 : return li.get(row).getNo_telepon();
      case 4 : return li.get(row).getTujuan_tamu();
      case 5 : return li.get(row).getTanggal_masuk();
      case 6 : return li.get(row).getWaktu_masuk();
      case 7 : return li.get(row).getWaktu_keluar();
      default: return null;
    }
  }
}
