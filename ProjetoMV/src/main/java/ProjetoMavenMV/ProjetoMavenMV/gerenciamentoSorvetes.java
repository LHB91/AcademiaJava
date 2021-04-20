package ProjetoMavenMV.ProjetoMavenMV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.SorveteDAO;
import dao.SorveteDAOImpl;
import entidade.Sorvete;

public class gerenciamentoSorvetes {

	public static void main(String[] args) {

		Scanner e1 = new Scanner(System.in);
		Scanner e2 = new Scanner(System.in);
		entidade.Sorvete s = new Sorvete();
		SorveteDAO sorveteDAO = new SorveteDAOImpl();

		int n = 0;

		while (n != 4) {
			System.out.println("Digite a opção desejada");
			System.out.println("1 - Inserir sorvete");
			System.out.println("2 - Remover sorvete");
			System.out.println("3 - Listar todos os sorvetes");
			System.out.println("4 - Sair do programa");
			n = e1.nextInt();

			switch (n) {
			case 1:
				s = new Sorvete();
				System.out.print("Digite o Sabor: ");
				s.setNome(e2.nextLine());
				System.out.println("Digite o Fabricante: ");
				s.setFabricante(e2.nextLine());
				System.out.println("Digite os ingredientes: ");
				s.setIngredientes(e2.nextLine());

				sorveteDAO.inserir(s);
				
				break;

			case 2:
				System.out.println("Digite o sabor do sorvete para removê-lo");
				s.setNome(e2.nextLine());
				sorveteDAO.remover(s.getNome());
				
				break;

			case 3:

				sorveteDAO.listarSorvetes();
				
				for (Sorvete sorvetes : sorveteDAO.listarSorvetes()) {
					System.out.println("Código: " + sorvetes.getNome() + " - " + " Fornecedor: "
							+ sorvetes.getFabricante() + " - " + " Sabor: " + sorvetes.getIngredientes() + "\n");
				}

				break;

			case 4:
				System.out.println("Finalizando...\n");
				break;

			default:
				System.out.println("Opção Inválida\n");
				break;
			}

		}
		e1.close();
		e2.close();
	}

}
