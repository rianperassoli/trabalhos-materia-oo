package exemploInterface;

import java.math.BigDecimal;

public class Teste {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Carlos", new BigDecimal("1500"));
		Cliente cliente = new Cliente("Cliente 1", "Conveniado");
		
		System.out.println(funcionario.getNome());
		System.out.println(cliente.getNome());
	}

}
