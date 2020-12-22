package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.Tipo;
import util.JdbcUtil;

public class TipoDAOImpl implements TipoDAO {

	@Override
	public void inserir(Tipo tipo) {
		String sql = "INSERT INTO TIPO(TIPO)" + "VALUES (?)";

		Connection conexao = null;

		try {

			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, tipo.getTipo());

			ps.execute();
			ps.close();

			conexao.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Tipo> listarTipos() {
		String sql = "SELECT * FROM TIPO";
		List<Tipo> listaTipos = new ArrayList<Tipo>();
		Connection conexao;

		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while (res.next()) {

				Tipo tipo = new Tipo();
				tipo.setId_tipo(res.getInt("ID_TIPO"));
				tipo.setTipo(res.getString("TIPO"));
				listaTipos.add(tipo);
			}
			ps.close();
			res.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaTipos;
	}

	@Override
	public void alterar(Tipo tipo) {
		String sql = "UPDATE TIPO SET TIPO = ?, " + "WHERE ID_TIPO = ?";

		Connection conexao;

		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, tipo.getTipo());
			ps.setInt(2, tipo.getId_tipo());

			ps.execute();
			conexao.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void remover(int id_tipo) {
		String sql = "DELETE FROM TIPO WHERE ID_TIPO = ?";
		Connection conexao;
		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id_tipo);

			ps.execute();
			ps.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Tipo pesquisar(int id_tipo) {
		String sql = "SELECT * FROM TIPO WHERE ID_TIPO = ?";
		Connection conexao;
		Tipo tipo = new Tipo();

		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id_tipo);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				tipo.setId_tipo(res.getInt("ID_TIPO"));
				tipo.setTipo(res.getString("TIPO"));

			}
			ps.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return tipo;
	}
}
