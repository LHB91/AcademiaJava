package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controlador.SorveteControlador;
import model.Sorvete;

public class gerenciamentoSorvetes {

	public static void main(String[] args) {

		Scanner e1 = new Scanner(System.in);
		Scanner e2 = new Scanner(System.in);
		Sorvete s = new Sorvete();
		boolean salvo;
		boolean deletado;
		SorveteControlador sc = new SorveteControlador();

		int n = 0;

		while (n != 4) {
			System.out.println("Digite a op��o desejada");
			System.out.println("1 - Inserir sorvete");
			System.out.println("2 - Remover sorvete");
			System.out.println("3 - Listar todos os sorvetes");
			System.out.println("4 - Sair do programa");
			n = e1.nextInt();

			switch (n) {
			case 1:
				s = new Sorvete();
				System.out.println("Digite o c�digo do sorvete");
				s.setCodigo(e1.nextInt());
				System.out.println("Digite o fornecedor do sorvete");
				s.setFornecedor(e2.next());
				System.out.println("Digite o pre�o do sorvete");
				s.setPreco(e1.nextDouble());
				System.out.println("Digite o sabor do sorvete");
				s.setSabor(e2.next());
				salvo = sc.salvarSorvete(s);

				if (salvo) {
					System.out.println("Sorvete de C�d: " + s.getCodigo() + " Salvo com sucesso\n");
				}
				break;

			case 2:
				System.out.println("Digite o c�digo do sorvete para remov�-lo");
				s.setCodigo(e1.nextInt());
				deletado = sc.deletarSorvete(s.getCodigo());
				if (deletado) {
					System.out.println("Sorvete de C�d: " + s.getCodigo() + " Deletado com sucesso\n");
				} else {
					System.out.println("Sorvete n�o encontrado");
				}
				break;

			case 3:
				List<Sorvete> listaSorvetes = new ArrayList<Sorvete>();

				listaSorvetes = sc.listarSorvertes();

				for (Sorvete sorvetes : listaSorvetes) {
					System.out.println("C�digo: " + sorvetes.getCodigo() + " - " + " Fornecedor: "
							+ sorvetes.getFornecedor() + " - " + " Sabor: " + sorvetes.getSabor() + " - " + " Pre�o: "
							+ sorvetes.getPreco() + "\n");
				}
				break;

			case 4:
				System.out.println("Finalizando...\n");
				break;

			default:
				System.out.println("Op��o Inv�lida\n");
				break;
			}

		}
		e1.close();
		e2.close();
	}

}
