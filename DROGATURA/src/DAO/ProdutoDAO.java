package DAO;

import java.util.List;

import entidades.Produto;

public interface ProdutoDAO {

	// Create
	public void inserir(Produto produto);

	//Read	
	public List<Produto> listarProdutos();

	//Update	
	public void alterar(Produto produto);

	//Remove
	public void remover(int id_produto);

	//Search
	public Produto pesquisar(int id_produto);
}
