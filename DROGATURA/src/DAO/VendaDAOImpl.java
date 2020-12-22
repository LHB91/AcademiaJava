package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.Venda;
import util.JdbcUtil;

public class VendaDAOImpl implements VendaDAO {

	@Override
	public void inserir(Venda venda) {
		String sql = "INSERT INTO VENDA(ID_CLIENTE, ID_FUNCIONARIO, ID_PRODUTO, FORMA_PAGAMENTO)" + "VALUES (?,?,?,?)";

		Connection conexao = null;

		try {

			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, venda.getId_cliente());
			ps.setInt(2, venda.getId_funcionario());
			ps.setInt(3, venda.getId_produto());
			ps.setString(4, venda.getForma_pagamento());

			ps.execute();
			ps.close();

			conexao.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Venda> listarVendas() {
		String sql = "SELECT * FROM VENDA";
		List<Venda> listaVendas = new ArrayList<Venda>();
		Connection conexao;

		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while (res.next()) {

				Venda venda = new Venda();
				venda.setId_venda(res.getInt("ID_VENDA"));
				venda.setId_cliente(res.getInt("ID_CLIENTE"));
				venda.setId_funcionario(res.getInt("ID_FUNCIONARIO"));
				venda.setId_produto(res.getInt("ID_PRODUTO"));
				venda.setForma_pagamento(res.getString("FORMA_PAGAMENTO"));
				listaVendas.add(venda);
			}
			ps.close();
			res.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaVendas;
	}

	@Override
	public void alterar(Venda venda) {
		String sql = "UPDATE VENDA SET ID_CLIENTE = ?, ID_FUNCIONARIO = ?, ID_PRODUTO = ?, FORMA_PAGAMENTO = ? "
				+ "WHERE ID_VENDA = ?";

		Connection conexao;

		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(2, venda.getId_funcionario());
			ps.setInt(3, venda.getId_produto());
			ps.setString(4, venda.getForma_pagamento());
			ps.setInt(5, venda.getId_venda());

			ps.execute();
			conexao.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void remover(int id_venda) {
		String sql = "DELETE FROM TIPO WHERE ID_VENDA = ?";
		Connection conexao;
		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id_venda);

			ps.execute();
			ps.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Venda pesquisar(int id_venda) {
		String sql = "SELECT * FROM TIPO WHERE ID_VENDA = ?";
		Connection conexao;
		Venda venda = new Venda();

		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id_venda);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				venda.setId_venda(res.getInt("ID_VENDA"));
				venda.setId_cliente(res.getInt("ID_CLIENTE"));
				venda.setId_funcionario(res.getInt("ID_FUNCIONARIO"));
				venda.setId_produto(res.getInt("ID_PRODUTO"));
				venda.setForma_pagamento(res.getString("FORMA_PAGAMENTO"));

			}
			ps.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return venda;
	}
}
