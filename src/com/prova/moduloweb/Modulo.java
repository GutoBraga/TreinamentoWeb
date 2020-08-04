package com.prova.moduloweb;

import java.util.Date;

public class Modulo {
	
	private String ds_nome;
	private String ds_instrutor_titular;
	private String ds_instrutor_auxiliar;
	private Date dt_inicio;
	
	public String getDs_nome() {
		return ds_nome;
	}
	public void setDs_nome(String ds_nome) {
		this.ds_nome = ds_nome;
	}
	public String getDs_instrutor_titular() {
		return ds_instrutor_titular;
	}
	public void setDs_instrutor_titular(String ds_instrutor_titular) {
		this.ds_instrutor_titular = ds_instrutor_titular;
	}
	public String getDs_instrutor_auxiliar() {
		return ds_instrutor_auxiliar;
	}
	public void setDs_instrutor_auxiliar(String ds_instrutor_auxiliar) {
		this.ds_instrutor_auxiliar = ds_instrutor_auxiliar;
	}
	public Date getDt_inicio() {
		return dt_inicio;
	}
	public void setDt_inicio(Date dt_inicio) {
		this.dt_inicio = dt_inicio;
	}
	
}
