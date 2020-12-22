package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.Produto;
import util.JdbcUtil;

public class ProdutoDAOImpl implements ProdutoDAO {

	@Override
	public void inserir(Produto produto) {
		String sql = "INSERT INTO PRODUTO(NOME, LABORATORIO, PRECO)" + "VALUES (?,?,?)";

		Connection conexao = null;

		try {

			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getLaboratorio());
			ps.setDouble(3, produto.getPreco());

			ps.execute();
			ps.close();

			conexao.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Produto> listarProdutos() {
		String sql = "SELECT * FROM PRODUTO";
		List<Produto> listaProdutos = new ArrayList<Produto>();
		Connection conexao;

		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while (res.next()) {

				Produto produto = new Produto();
				produto.setId_produto(res.getInt("ID_PRODUTO"));
				produto.setNome(res.getString("NOME"));
				produto.setLaboratorio(res.getString("LABORATORIO"));
				produto.setPreco(res.getInt("PRECO"));
				listaProdutos.add(produto);
			}
			ps.close();
			res.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaProdutos;
	}

	@Override
	public void alterar(Produto produto) {
		String sql = "UPDATE PRODUTO SET NOME = ?, LABORATORIO = ?, PRECO = ?, " + "WHERE ID_PRODUTO = ?";

		Connection conexao;

		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getLaboratorio());
			ps.setDouble(3, produto.getPreco());
			ps.setInt(4, produto.getId_produto());

			ps.execute();
			conexao.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void remover(int id_produto) {
		String sql = "DELETE FROM PRODUTO WHERE ID_PRODUTO = ?";
		Connection conexao;
		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id_produto);

			ps.execute();
			ps.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Produto pesquisar(int id_produto) {
		String sql = "SELECT * FROM PESSOA WHERE ID_PRODUTO = ?";
		Connection conexao;
		Produto produto = new Produto();

		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id_produto);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				produto.setId_produto(res.getInt("ID_PRODUTO"));
				produto.setNome(res.getString("NOME"));
				produto.setLaboratorio(res.getString("LABORATORIO"));
				produto.setPreco(res.getDouble("PRECO"));
			}
			ps.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return produto;
	}
}
