package br.com.rianperassoli.carrinhocompra;

public class Item implements Comparable<Item> {

	private Produto produto;
	private Double valor;
	private Double quantidade;

	public Item(Produto produto, Double quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = getValor();
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public Double getValor() {
		Double percentualCobrado;

		if (produto.getTipo().equals("bebida")) {

			percentualCobrado = 0.950;

		} else if (produto.getTipo().equals("vestuario")) {

			percentualCobrado = new Double(0.750);

		} else {
			percentualCobrado = new Double(1.0);
		}

		this.valor = produto.getValorUnitario() * percentualCobrado;

		return this.valor * this.quantidade;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public int compareTo(Item item) {
		return this.getValor().compareTo(item.getValor());
	}

}
