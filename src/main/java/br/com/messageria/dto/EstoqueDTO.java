package br.com.messageria.dto;

import java.io.Serializable;

public class EstoqueDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigoProduto;
	private int quantidade;
	
	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
