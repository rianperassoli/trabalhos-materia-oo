package br.com.rianperassoli.carrinhocompra;

public class Main {

	public static void main(String[] args) {

		Carrinho carrinho = new Carrinho();

		Produto cervejaBudweiser = new Produto("Cerveja Budweiser", 10.0, "bebida");
		Produto camisa = new Produto("Camisa", 10.0, "vestuario");
		Produto varaDePesca = new Produto("Vara de Pesca", 30.0, "outros");

		Item item1 = new Item(cervejaBudweiser, 2.0);
		Item item2 = new Item(camisa, 2.0);
		Item item3 = new Item(varaDePesca, 2.0);

		carrinho.setItem(item1);
		carrinho.setItem(item2);
		carrinho.setItem(item3);

		carrinho.ordenarCrescente();

		carrinho.ordenarDecrescente();

		System.out.println(carrinho.getValorTotal());
	}

}
