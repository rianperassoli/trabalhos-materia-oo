package br.com.rianperassoli.carrinhocompra;


public class Produto {
	private String descricao;
	private Double valorUnitario;
	private String tipo;
	
	Produto(String descricao, Double valor, String tipo){
		this.descricao = descricao;
		this.valorUnitario = valor;
		this.tipo = tipo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

	public Double getValorUnitario() {
		return this.valorUnitario;
	}
	
	public String getTipo() {
		return this.tipo;
	}
}
