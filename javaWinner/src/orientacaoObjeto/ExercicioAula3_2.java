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
			System.out.println("Digite a Opção");
			System.out.println("(1) Cadastro de Produto");
			System.out.println("(2) Cadastro de Serviço");
			System.out.println("(3) Imprimir Produto");
			System.out.println("(4) Imprimir Serviço");
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
				System.out.println("Digite o Nome do Serviço: ");
				servico = entrada.nextLine();
				System.out.println("Digite o Valor do Serviço: ");
				valorServ = entrada.nextDouble();
				entrada.nextLine();
				System.out.println("Digite o Produto Utilizado: ");
				produto = entrada.nextLine();
				System.out.println("Digite o Número do Produto: ");
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
					System.out.println("Precisa cadastrar um serviço primeiro");
				} else {
					System.out.println("-------------Serviço-------------");
					System.out.println("Nome: " + servico + " Valor: " + valorServ);
					System.out.println("Utiliza Produto : " + produto + " N.produto: " + produtoNum);
				}
				break;
			case 5:
				System.out.println("Saindo do Programa");
				break;
			default:
				System.out.println("Opção Inválida");
				break;

			}
		}

		entrada.close();
	}

}
