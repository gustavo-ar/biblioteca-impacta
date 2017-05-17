package br.com.impacta.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class Sql {
	private final String HOSTNAME = "127.0.0.1";
	private final String USERNAME = "root";
	private final String PASSWORD = "impacta";
	private final String DBNAME = "impacta";
	private Connection conn;

	public Sql() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		this.conn = DriverManager.getConnection("jdbc:mysql://" + HOSTNAME + "/" + DBNAME, USERNAME, PASSWORD);

	}

	private void setParams(NamedParameterStatement statement, Map<String, String> parameters) throws SQLException {
		for (Map.Entry<String, String> entry : parameters.entrySet()) {
			this.bindParam(statement, entry.getKey(), entry.getValue());
		}
	}

	private void bindParam(NamedParameterStatement statement, String key, String value) throws SQLException {
		statement.setString(key, value);
	}

	public void query(String rawQuery, Map<String, String> params) throws SQLException {
		NamedParameterStatement stmt = new NamedParameterStatement(conn, rawQuery);
		this.setParams(stmt, params);
		stmt.execute();
		stmt.close();
	}

	public ResultSet select(String rawQuery, Map<String, String> params) throws SQLException {
		NamedParameterStatement stmt = new NamedParameterStatement(conn, rawQuery);
		if(params!=null){
		this.setParams(stmt, params);
		}
		return stmt.executeQuery();
	}

}
