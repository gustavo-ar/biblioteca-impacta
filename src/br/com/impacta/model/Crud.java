package br.com.impacta.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public interface Crud {
 public void insert() throws ClassNotFoundException, SQLException;
 public void delete() throws ClassNotFoundException, SQLException;
 public void loadById() throws ClassNotFoundException, SQLException;
 public void setData(Map<String, String> data);
}
