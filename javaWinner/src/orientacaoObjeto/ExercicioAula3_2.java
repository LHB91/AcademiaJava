package orientacaoObjeto;

import java.util.Scanner;

public class ExercicioAula3_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opcao = 0;
		int produtoNum = 0;
		double valor = 0;
		double peso = 0;
		double valorServ = 0;
		String nome = "";
		String cor = "";
		String servico = "";
		String produto = "";

		while (opcao != 5) {
			System.out.println("Digite a Op��o");
			System.out.println("(1) Cadastro de Produto");
			System.out.println("(2) Cadastro de Servi�o");
			System.out.println("(3) Imprimir Produto");
			System.out.println("(4) Imprimir Servi�o");
			System.out.println("(5) Sair");
			opcao = entrada.nextInt();
			entrada.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o Nome do Produto: ");
				nome = entrada.nextLine();
				System.out.println("Digite o Valor do Produto: ");
				valor = entrada.nextDouble();
				System.out.println("Digite o Peso do Produto: ");
				peso = entrada.nextDouble();
				entrada.nextLine();
				System.out.println("Digite a Cor do Produto: ");
				cor = entrada.nextLine();
				break;
			case 2:
				System.out.println("Digite o Nome do Servi�o: ");
				servico = entrada.nextLine();
				System.out.println("Digite o Valor do Servi�o: ");
				valorServ = entrada.nextDouble();
				entrada.nextLine();
				System.out.println("Digite o Produto Utilizado: ");
				produto = entrada.nextLine();
				System.out.println("Digite o N�mero do Produto: ");
				produtoNum = entrada.nextInt();
				entrada.nextLine();

				break;
			case 3:
				if (nome == "") {
					System.out.println("Precisa cadastrar um produto primeiro");
				} else {
					System.out.println("-------------Produto-------------");
					System.out.println("Nome: " + nome + " Valor: " + valor);
					System.out.println("KG: " + peso + " Cor: " + cor);
				}
				break;
			case 4:
				if (servico == "") {
					System.out.println("Precisa cadastrar um servi�o primeiro");
				} else {
					System.out.println("-------------Servi�o-------------");
					System.out.println("Nome: " + servico + " Valor: " + valorServ);
					System.out.println("Utiliza Produto : " + produto + " N.produto: " + produtoNum);
				}
				break;
			case 5:
				System.out.println("Saindo do Programa");
				break;
			default:
				System.out.println("Op��o Inv�lida");
				break;

			}
		}

		entrada.close();
	}

}
