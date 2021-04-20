package dao;

import java.util.List;

import entidade.Sorvete;

public interface SorveteDAO {

	// Create
	public void inserir(Sorvete sorvete);

	// Read
	public List<Sorvete> listarSorvetes();

	// Delete
	public void remover(String nome);

}
