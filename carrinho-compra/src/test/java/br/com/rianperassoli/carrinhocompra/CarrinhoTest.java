package br.com.rianperassoli.carrinhocompra;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;

public class CarrinhoTest {

	DecimalFormat real = new DecimalFormat("#.00");

	@Test
	public void testCarrinho() {
		Carrinho carrinho = new Carrinho();

		Produto cervejaBudweiser = new Produto("Teste1", 10.0, "bebida");
		Produto camisa = new Produto("Teste2", 10.0, "vestuario");
		Produto varaDePesca = new Produto("Teste3", 30.0, "outros");

		Item item1 = new Item(cervejaBudweiser, 2.0);
		Item item2 = new Item(camisa, 2.0);
		Item item3 = new Item(varaDePesca, 2.5);

		carrinho.setItem(item1);
		carrinho.setItem(item2);
		carrinho.setItem(item3);

		assertEquals(3, carrinho.getItens().size());

		// ITEM 1
		assertEquals(Double.valueOf(2.0), carrinho.getItens().get(0).getQuantidade());
		assertEquals(String.valueOf("19,00"), real.format(carrinho.getItens().get(0).getValor()));
		assertEquals("Teste1", carrinho.getItens().get(0).getProduto().getDescricao());
		assertEquals(Double.valueOf(10.0), carrinho.getItens().get(0).getProduto().getValorUnitario());
		assertEquals("bebida", carrinho.getItens().get(0).getProduto().getTipo());

		// ITEM 2
		assertEquals(Double.valueOf(2.0), carrinho.getItens().get(1).getQuantidade());
		assertEquals(String.valueOf("15,00"), real.format(carrinho.getItens().get(1).getValor()));
		assertEquals("Teste2", carrinho.getItens().get(1).getProduto().getDescricao());
		assertEquals(Double.valueOf(10.0), carrinho.getItens().get(1).getProduto().getValorUnitario());
		assertEquals("vestuario", carrinho.getItens().get(1).getProduto().getTipo());

		// ITEM 3
		assertEquals(Double.valueOf(2.5), carrinho.getItens().get(2).getQuantidade());
		assertEquals(String.valueOf("75,00"), real.format(carrinho.getItens().get(2).getValor()));
		assertEquals("Teste3", carrinho.getItens().get(2).getProduto().getDescricao());
		assertEquals(Double.valueOf(30.0), carrinho.getItens().get(2).getProduto().getValorUnitario());
		assertEquals("outros", carrinho.getItens().get(2).getProduto().getTipo());

		// TOTAL
		assertEquals(String.valueOf("109,00"), real.format(carrinho.getValorTotal()));
	}

	@Test
	public void testOrdenarCarrinhoCrescente() {
		Carrinho carrinho = new Carrinho();

		Produto cervejaBudweiser = new Produto("Teste1", 10.0, "bebida");
		Produto camisa = new Produto("Teste2", 10.0, "vestuario");
		Produto varaDePesca = new Produto("Teste3", 30.0, "outros");

		Item item1 = new Item(cervejaBudweiser, 2.0);
		Item item2 = new Item(camisa, 2.0);
		Item item3 = new Item(varaDePesca, 2.5);

		carrinho.setItem(item1);
		carrinho.setItem(item2);
		carrinho.setItem(item3);

		assertEquals(3, carrinho.getItens().size());

		// ITEM 1
		assertEquals(Double.valueOf(2.0), carrinho.getItens().get(0).getQuantidade());
		assertEquals(String.valueOf("19,00"), real.format(carrinho.getItens().get(0).getValor()));
		assertEquals("Teste1", carrinho.getItens().get(0).getProduto().getDescricao());
		assertEquals(Double.valueOf(10.0), carrinho.getItens().get(0).getProduto().getValorUnitario());
		assertEquals("bebida", carrinho.getItens().get(0).getProduto().getTipo());

		// ITEM 2
		assertEquals(Double.valueOf(2.0), carrinho.getItens().get(1).getQuantidade());
		assertEquals(String.valueOf("15,00"), real.format(carrinho.getItens().get(1).getValor()));
		assertEquals("Teste2", carrinho.getItens().get(1).getProduto().getDescricao());
		assertEquals(Double.valueOf(10.0), carrinho.getItens().get(1).getProduto().getValorUnitario());
		assertEquals("vestuario", carrinho.getItens().get(1).getProduto().getTipo());

		// ITEM 3
		assertEquals(Double.valueOf(2.5), carrinho.getItens().get(2).getQuantidade());
		assertEquals(String.valueOf("75,00"), real.format(carrinho.getItens().get(2).getValor()));
		assertEquals("Teste3", carrinho.getItens().get(2).getProduto().getDescricao());
		assertEquals(Double.valueOf(30.0), carrinho.getItens().get(2).getProduto().getValorUnitario());
		assertEquals("outros", carrinho.getItens().get(2).getProduto().getTipo());

		// TOTAL
		assertEquals(String.valueOf("109,00"), real.format(carrinho.getValorTotal()));

		carrinho.ordenarCrescente();

		// ITEM 1
		assertEquals(Double.valueOf(2.0), carrinho.getItens().get(0).getQuantidade());
		assertEquals(String.valueOf("15,00"), real.format(carrinho.getItens().get(0).getValor()));
		assertEquals("Teste2", carrinho.getItens().get(0).getProduto().getDescricao());
		assertEquals(Double.valueOf(10.0), carrinho.getItens().get(0).getProduto().getValorUnitario());
		assertEquals("vestuario", carrinho.getItens().get(0).getProduto().getTipo());

		// ITEM 2
		assertEquals(Double.valueOf(2.0), carrinho.getItens().get(1).getQuantidade());
		assertEquals(String.valueOf("19,00"), real.format(carrinho.getItens().get(1).getValor()));
		assertEquals("Teste1", carrinho.getItens().get(1).getProduto().getDescricao());
		assertEquals(Double.valueOf(10.0), carrinho.getItens().get(1).getProduto().getValorUnitario());
		assertEquals("bebida", carrinho.getItens().get(1).getProduto().getTipo());

		// ITEM 3
		assertEquals(Double.valueOf(2.5), carrinho.getItens().get(2).getQuantidade());
		assertEquals(String.valueOf("75,00"), real.format(carrinho.getItens().get(2).getValor()));
		assertEquals("Teste3", carrinho.getItens().get(2).getProduto().getDescricao());
		assertEquals(Double.valueOf(30.0), carrinho.getItens().get(2).getProduto().getValorUnitario());
		assertEquals("outros", carrinho.getItens().get(2).getProduto().getTipo());

		// TOTAL
		assertEquals(String.valueOf("109,00"), real.format(carrinho.getValorTotal()));
	}

	@Test
	public void testOrdenarCarrinhoDecrescente() {
		Carrinho carrinho = new Carrinho();

		Produto cervejaBudweiser = new Produto("Teste1", 10.0, "bebida");
		Produto camisa = new Produto("Teste2", 10.0, "vestuario");
		Produto varaDePesca = new Produto("Teste3", 30.0, "outros");

		Item item1 = new Item(cervejaBudweiser, 2.0);
		Item item2 = new Item(camisa, 2.0);
		Item item3 = new Item(varaDePesca, 2.5);

		carrinho.setItem(item1);
		carrinho.setItem(item2);
		carrinho.setItem(item3);

		assertEquals(3, carrinho.getItens().size());

		// ITEM 1
		assertEquals(Double.valueOf(2.0), carrinho.getItens().get(0).getQuantidade());
		assertEquals(String.valueOf("19,00"), real.format(carrinho.getItens().get(0).getValor()));
		assertEquals("Teste1", carrinho.getItens().get(0).getProduto().getDescricao());
		assertEquals(Double.valueOf(10.0), carrinho.getItens().get(0).getProduto().getValorUnitario());
		assertEquals("bebida", carrinho.getItens().get(0).getProduto().getTipo());

		// ITEM 2
		assertEquals(Double.valueOf(2.0), carrinho.getItens().get(1).getQuantidade());
		assertEquals(String.valueOf("15,00"), real.format(carrinho.getItens().get(1).getValor()));
		assertEquals("Teste2", carrinho.getItens().get(1).getProduto().getDescricao());
		assertEquals(Double.valueOf(10.0), carrinho.getItens().get(1).getProduto().getValorUnitario());
		assertEquals("vestuario", carrinho.getItens().get(1).getProduto().getTipo());

		// ITEM 3
		assertEquals(Double.valueOf(2.5), carrinho.getItens().get(2).getQuantidade());
		assertEquals(String.valueOf("75,00"), real.format(carrinho.getItens().get(2).getValor()));
		assertEquals("Teste3", carrinho.getItens().get(2).getProduto().getDescricao());
		assertEquals(Double.valueOf(30.0), carrinho.getItens().get(2).getProduto().getValorUnitario());
		assertEquals("outros", carrinho.getItens().get(2).getProduto().getTipo());

		// TOTAL
		assertEquals(String.valueOf("109,00"), real.format(carrinho.getValorTotal()));

		carrinho.ordenarDecrescente();

		// ITEM 1
		assertEquals(Double.valueOf(2.5), carrinho.getItens().get(0).getQuantidade());
		assertEquals(String.valueOf("75,00"), real.format(carrinho.getItens().get(0).getValor()));
		assertEquals("Teste3", carrinho.getItens().get(0).getProduto().getDescricao());
		assertEquals(Double.valueOf(30.0), carrinho.getItens().get(0).getProduto().getValorUnitario());
		assertEquals("outros", carrinho.getItens().get(0).getProduto().getTipo());

		// ITEM 2
		assertEquals(Double.valueOf(2.0), carrinho.getItens().get(1).getQuantidade());
		assertEquals(String.valueOf("19,00"), real.format(carrinho.getItens().get(1).getValor()));
		assertEquals("Teste1", carrinho.getItens().get(1).getProduto().getDescricao());
		assertEquals(Double.valueOf(10.0), carrinho.getItens().get(1).getProduto().getValorUnitario());
		assertEquals("bebida", carrinho.getItens().get(1).getProduto().getTipo());

		// ITEM 3
		assertEquals(Double.valueOf(2.0), carrinho.getItens().get(2).getQuantidade());
		assertEquals(String.valueOf("15,00"), real.format(carrinho.getItens().get(2).getValor()));
		assertEquals("Teste2", carrinho.getItens().get(2).getProduto().getDescricao());
		assertEquals(Double.valueOf(10.0), carrinho.getItens().get(2).getProduto().getValorUnitario());
		assertEquals("vestuario", carrinho.getItens().get(2).getProduto().getTipo());

		// TOTAL
		assertEquals(String.valueOf("109,00"), real.format(carrinho.getValorTotal()));
	}

}
