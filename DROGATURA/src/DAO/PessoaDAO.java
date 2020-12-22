package DAO;

import java.util.List;

import entidades.Pessoa;

public interface PessoaDAO {

	// Create
	public void inserir(Pessoa pessoa);

	// Read
	public List<Pessoa> listarPessoas();

	// Update
	public void alterar(Pessoa pessoa);

	// Remove
	public void remover(int id_pessoa);

	// Search
	public Pessoa pesquisar(int id_pessoa);
}
