/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MohamadEsa
 */
public class DB_Utilities implements DB_Config{
  private static Connection con=null;
  
  public static Connection config(){
    try {
      Class.forName(driver);
      con = DriverManager.getConnection(link,user,pass);
      if(con==null){
        JOptionPane.showMessageDialog(null, "Koneksi Hilang atau Belum Dihubungkan", "Perhatian", JOptionPane.WARNING_MESSAGE);
      } else{
//        System.out.println("Berhasil Terhubung");
      }
    } catch (HeadlessException | ClassNotFoundException | SQLException e) {
      System.out.println("Kode Akses Error : "+e);
      JOptionPane.showMessageDialog(null, "Koneksi Hilang atau Belum Dihubungkan", "Perhatian", JOptionPane.WARNING_MESSAGE);
    }
    return con;
  }
}
