package com.prova.moduloweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.prova.moduloweb.Modulo;

public class ModuloDAO {
	
	Connection conn;
	
	public ModuloDAO(Connection conn) {
		this.conn = conn;
	}
	
	public List<Modulo> consultarModulos() throws Exception {
		
		Statement stmt = conn.createStatement();
		ResultSet rstbm = stmt.executeQuery("select * from tb_modulo");
		
		List<Modulo> lista = new ArrayList<Modulo>();
		while(rstbm.next()) {
			
			Modulo md = new Modulo();
			md.setDs_nome(rstbm.getString("ds_nome"));
			md.setDs_instrutor_titular(rstbm.getString("ds_instrutor_titular"));
			md.setDs_instrutor_auxiliar(rstbm.getString("ds_instrutor_auxiliar"));
			md.setDt_inicio(rstbm.getDate("dt_inicio"));
			
			lista.add(md);
		}
		
		rstbm.close();
		stmt.close();
		
		return lista;
	}
	
	
	
	
}
