package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.Pessoa;
import util.JdbcUtil;

public class PessoaDAOImpl implements PessoaDAO {

	@Override
	public void inserir(Pessoa pessoa) {
		String sql = "INSERT INTO PESSOA(NOME, ID_TIPO)" + "VALUES (?,?)";

		Connection conexao = null;

		try {

			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, pessoa.getNome());
			ps.setInt(2, pessoa.getId_tipo());

			ps.execute();
			ps.close();

			conexao.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Pessoa> listarPessoas() {
		String sql = "SELECT * FROM PESSOA";
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		Connection conexao;

		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while (res.next()) {

				Pessoa pessoa = new Pessoa();
				pessoa.setId_pessoa(res.getInt("ID_PESSOA"));
				pessoa.setNome(res.getString("NOME"));
				pessoa.setId_tipo(res.getInt("ID_TIPO"));
				listaPessoas.add(pessoa);
			}
			ps.close();
			res.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaPessoas;
	}

	@Override
	public void alterar(Pessoa pessoa) {
		String sql = "UPDATE PESSOA SET NOME = ?, ID_TIPO = ?, " + "WHERE ID_PESSOA = ?";

		Connection conexao;

		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, pessoa.getNome());
			ps.setInt(2, pessoa.getId_tipo());
			ps.setInt(3, pessoa.getId_pessoa());

			ps.execute();
			conexao.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void remover(int id_pessoa) {
		String sql = "DELETE FROM PESSOA WHERE ID_PESSOA = ?";
		Connection conexao;
		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id_pessoa);

			ps.execute();
			ps.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Pessoa pesquisar(int id_pessoa) {
		String sql = "SELECT * FROM PESSOA WHERE ID_PESSOA = ?";
		Connection conexao;
		Pessoa pessoa = new Pessoa();

		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id_pessoa);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				pessoa.setId_pessoa(res.getInt("ID_PESSOA"));
				pessoa.setNome(res.getString("NOME"));
				pessoa.setId_tipo(res.getInt("ID_TIPO"));

			}
			ps.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return pessoa;
	}
}
