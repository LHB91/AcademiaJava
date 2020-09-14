package orientacaoObjeto;

import java.util.Scanner;

public class Aula3_3_While {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opcao = 0;
		while (opcao != 3) {
			System.out.println("(1) Imprimir Casa");
			System.out.println("(2) Imprimir Azul");
			System.out.println("(3) Imprimir Sair");

			opcao = entrada.nextInt();

			switch (opcao) {
			case (1):
				System.out.println("Casa");
				break;
			case (2):
				System.out.println("Azul");
				break;
			case (3):
				System.out.println("Sair");
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
		}

		int x = 0;
		System.out.println("Informe seu nome");
		String nome = entrada.next();

		while (x < 10) {
			System.out.println(nome + " " + (x + 1));
			x++;
		}

		entrada.close();

	}

}
