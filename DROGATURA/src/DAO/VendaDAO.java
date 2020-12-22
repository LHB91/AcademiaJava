package DAO;

import java.util.List;

import entidades.Venda;

public interface VendaDAO {

	// Create
	public void inserir(Venda venda);

	// Read
	public List<Venda> listarVendas();

	// Update
	public void alterar(Venda venda);

	// Remove
	public void remover(int id_venda);

	// Search
	public Venda pesquisar(int id_venda);

}
