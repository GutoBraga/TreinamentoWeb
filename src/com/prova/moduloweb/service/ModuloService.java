package com.prova.moduloweb.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.prova.moduloweb.*;
import com.prova.moduloweb.dao.ConexaoMySqlDAO;
import com.prova.moduloweb.dao.ModuloDAO;

public class ModuloService {
	ModuloDAO dao = null;
	Connection conn = null;
	
	public ModuloService() {
		ConexaoMySqlDAO conexaoMySql = new ConexaoMySqlDAO();
		
		try {
			conn = conexaoMySql.obterConexao();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		dao = new ModuloDAO(conn);
	}
	
	public List<Modulo> consultarModulos() throws Exception {
		List<Modulo> listaModulos = dao.consultarModulos();
		return listaModulos;
	}
}
