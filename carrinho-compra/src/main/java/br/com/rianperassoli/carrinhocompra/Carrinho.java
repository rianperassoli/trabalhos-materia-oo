package br.com.rianperassoli.carrinhocompra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carrinho {

	private List<Item> itens = new ArrayList<Item>();

	public List<Item> getItens() {
		return itens;
	}

	public void setItem(Item item) {
		this.itens.add(item);
	}

	public Double getValorTotal() {
		Double valorTotal = 0.0;

		for (Item item : itens) {
			valorTotal += item.getValor();
		}

		return valorTotal;
	}

	public void ordenarCrescente() {
		Collections.sort(this.itens);
	}

	public void ordenarDecrescente() {
		ordenarCrescente();
		Collections.reverse(this.itens);
	}

}
