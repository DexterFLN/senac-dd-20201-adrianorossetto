package model.entity.exercicio01;

public class Telefone {

	private Integer id;
	private String ddd;
	private String numero;
	private boolean movel;
	private Cliente dono;

	public Telefone(Integer id, String ddd, String numero, boolean movel, Cliente dono) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.numero = numero;
		this.movel = movel;
		this.dono = dono;
	}

	public Telefone() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean isMovel() {
		return movel;
	}

	public void setMovel(boolean movel) {
		this.movel = movel;
	}

	public Cliente getDono() {
		return dono;
	}

	public void setDono(Cliente dono) {
		this.dono = dono;
	}

	@Override
	public String toString() {
		return "Telefone [id=" + id + ", ddd=" + ddd + ", numero=" + numero + ", movel=" + movel  
				 + "dono=" + (dono != null ? dono.getNome() : "Sem dono") + "]";
	}

}
