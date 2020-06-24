/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Tamu;
import java.util.List;

/**
 *
 * @author MohamadEsa
 */
public interface DAO_Tamu {
  
  public List<Tamu> getALL();
  public List<Tamu> getSearch(String data);
  public void add(Tamu data);
  public void update(Tamu data);
  public void delete(String data);
  
}
