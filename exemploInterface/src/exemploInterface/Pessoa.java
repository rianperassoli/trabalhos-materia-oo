package exemploInterface;

public class Pessoa implements DadosPessoa {
	
	private String nome;

	Pessoa(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String getNome() {
		return this.nome;
	}
}
