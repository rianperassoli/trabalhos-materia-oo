package br.com.rianperassoli.carrinhocompra;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;

public class ItemTest {
	
	DecimalFormat real = new DecimalFormat("#.00"); 

	@Test
	public void testBebida() {

		Produto produto = new Produto("ProdutoTeste", 14.5, "bebida");

		Item item = new Item(produto, 4.0);
		
		assertEquals(Double.valueOf(4.0), item.getQuantidade());
		assertEquals(String.valueOf("55,10"), real.format(item.getValor()));

		assertEquals("ProdutoTeste", item.getProduto().getDescricao());
		assertEquals(Double.valueOf(14.50), item.getProduto().getValorUnitario());
		assertEquals("bebida", item.getProduto().getTipo());
		
	}

	@Test
	public void testVestuario() {

		Produto produto = new Produto("ProdutoTeste", 14.5, "vestuario");

		Item item = new Item(produto, 4.0);

		assertEquals(Double.valueOf(4.0), item.getQuantidade());
		assertEquals(String.valueOf("43,50"), real.format(item.getValor()));

		assertEquals("ProdutoTeste", item.getProduto().getDescricao());
		assertEquals(Double.valueOf(14.5), item.getProduto().getValorUnitario());
		assertEquals("vestuario", item.getProduto().getTipo());
		
	}

	@Test
	public void testOutros() {

		Produto produto = new Produto("ProdutoTeste", 14.50, "outros");

		Item item = new Item(produto, 4.0);

		assertEquals(Double.valueOf(4.0), item.getQuantidade());
		assertEquals(String.valueOf("58,00"), real.format(item.getValor()));

		assertEquals("ProdutoTeste", item.getProduto().getDescricao());
		assertEquals(Double.valueOf(14.5), item.getProduto().getValorUnitario());
		assertEquals("outros", item.getProduto().getTipo());
		
	}

}
