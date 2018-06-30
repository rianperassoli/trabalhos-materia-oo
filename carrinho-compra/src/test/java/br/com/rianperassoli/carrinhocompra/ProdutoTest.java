package br.com.rianperassoli.carrinhocompra;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class ProdutoTest {

	@Test
	public void testPropriedades() {
		Produto produto = new Produto("ProdutoTeste", 14.5, "bebida");
		
		assertEquals("ProdutoTeste", produto.getDescricao());
		assertEquals(Double.valueOf(14.5), produto.getValorUnitario());
		assertEquals("bebida", produto.getTipo());
	}

}
