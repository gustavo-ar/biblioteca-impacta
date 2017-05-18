package br.com.impacta.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import br.com.impacta.sql.Sql;

public class Exemplar implements Crud {
	private long num_exemplar;
	private long idobra;
	private boolean emprestado;
	private Calendar data_aquisicao;
	private Map<String, String> params = new HashMap<>();

	public long getNum_exemplar() {
		return num_exemplar;
	}

	public void setNum_exemplar(long num_exemplar) {
		this.num_exemplar = num_exemplar;
	}

	public long getIdobra() {
		return idobra;
	}

	public void setIdobra(long idobra) {
		this.idobra = idobra;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public Calendar getData_aquisicao() {
		return data_aquisicao;
	}

	public void setData_aquisicao(Calendar data_aquisicao) {
		this.data_aquisicao = data_aquisicao;
	}

	public void insert() throws ClassNotFoundException, SQLException {
		params.clear();
		params.put("ID", Long.toString(getNum_exemplar()));
		this.setData(new Sql().select("CALL sp_exemplar_insert( :ID )", params));

	}

	public void delete() throws ClassNotFoundException, SQLException {
		this.params.clear();
		params.put("ID", Long.toString(getNum_exemplar()));
		new Sql().query("DELETE FROM tb_exemplares WHERE idexemplar = :ID", params);
		this.setNum_exemplar(0);
		this.setData_aquisicao(null);
		this.setEmprestado(false);
		this.setIdobra(0);
	}

	public void loadById() throws ClassNotFoundException, SQLException {
		this.params.clear();
		params.put("ID", Long.toString(getNum_exemplar()));
		this.setData(new Sql().select("SELECT FROM tb_exemplares WHERE idexemplar = :ID", params));

	}

	public void setData(ResultSet rs) throws SQLException {
		while (rs.next()) {
			this.setNum_exemplar(rs.getInt("idexemplar"));
			Calendar data = Calendar.getInstance();
			data.setTime(rs.getDate("data_aquisicao"));
			this.setData_aquisicao(data);
			this.setNum_exemplar(rs.getLong("num_exemplar"));
			this.setIdobra(rs.getLong("idobra"));
			this.setEmprestado(rs.getBoolean("emprestado"));
		}
	}

	public static ResultSet getList() throws ClassNotFoundException, SQLException {
		return new Sql().select("SELECT * FROM tb_exemplares ORDER BY num_exemplar", null);
	}
}
