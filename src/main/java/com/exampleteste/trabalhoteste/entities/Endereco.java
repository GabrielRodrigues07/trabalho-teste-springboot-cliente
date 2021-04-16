package com.exampleteste.trabalhoteste.entities;

import java.io.Serializable;

public class Endereco implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String rua;
	private String cidade;
	private String estado;
	private String bairro;
	private String cep;
	
	public Endereco() {
	}

	public Endereco(String rua, String cidade, String estado, String bairro, String cep) {
		super();
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
		this.bairro = bairro;
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
