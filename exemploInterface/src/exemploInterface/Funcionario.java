package exemploInterface;

import java.math.BigDecimal;

public class Funcionario extends Pessoa{

	private BigDecimal salario;
	
	Funcionario(String nome, BigDecimal salario) {
		super(nome);
		this.setSalario(salario);
	}

	public BigDecimal getSalario() {
		return salario;
	}

	private void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	

}
