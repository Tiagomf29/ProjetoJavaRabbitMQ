package br.com.messageria.dto;

import java.io.Serializable;

public class PrecoDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigoProduto;
	private double preco;
	
	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
