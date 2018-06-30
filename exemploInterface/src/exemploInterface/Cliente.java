package exemploInterface;

public class Cliente extends Pessoa{

	private String tipoCliente;
	
	Cliente(String nome, String tipoCliente) {
		super(nome);
		this.setTipoCliente(tipoCliente);
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	private void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

}
