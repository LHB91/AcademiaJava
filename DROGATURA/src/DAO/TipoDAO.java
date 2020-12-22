package DAO;

import java.util.List;

import entidades.Tipo;

public interface TipoDAO {

	// Create
	public void inserir(Tipo tipo);

	// Read
	public List<Tipo> listarTipos();

	// Update
	public void alterar(Tipo tipo);

	// Remove
	public void remover(int id_tipo);

	// Search
	public Tipo pesquisar(int id_tipo);
}
