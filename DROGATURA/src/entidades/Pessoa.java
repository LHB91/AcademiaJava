package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA")
public class Pessoa {

	@Id
	@Column(name = "ID_PESSOA", nullable = false)
	private int id_pessoa;

	@Column(name = "NOME", nullable = false)
	private String nome;

	@OneToMany
	@JoinColumn(name = "ID_TIPO", referencedColumnName = "ID_TIPO", nullable = false)
	private int id_tipo;

	public int getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(int id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}

}
