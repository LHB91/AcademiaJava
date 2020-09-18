package orientacaoObjeto;

import java.util.Scanner;

public class ExercicioAula3_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a Opção");
		System.out.println("(1) Cadastro de Pessoa");
		System.out.println("(2) Cadastro de Endereço");
		System.out.println("(3) Sair");

		String nome = "";
		String sexo = "";
		String numero = "";
		String complemento = "";
		String rua = "";
		String cep = "";
		int idade = 0;
		int opcao = entrada.nextInt();
		entrada.nextLine();

		switch (opcao) {
		case 1:
			System.out.println("Digite o Nome: ");
			nome = entrada.nextLine();
			System.out.println("Digite a Idade: ");
			idade = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Digite o Sexo: ");
			sexo = entrada.nextLine();
			System.out.println(" ");
			System.out.println("-------------Pessoa-------------");
			System.out.println("Nome: " + nome + " Idade: " + idade);
			System.out.println("Sexo: " + sexo + " Ano de nascimento: " + (2020 - idade));
			break;

		case 2:
			System.out.println("Informe o número: ");
			numero = entrada.nextLine();
			System.out.println("Informe a rua: ");
			rua = entrada.nextLine();
			System.out.println("Informe complemento: ");
			complemento = entrada.nextLine();
			System.out.println("Informe o CEP: ");
			cep = entrada.nextLine();
			System.out.println("-------------Endereço-------------");
			System.out.println("Rua: " + rua + " Nº: " + numero);
			System.out.println("Comp: " + complemento + " CEP: " + cep);
			break;

		case 3:
			System.out.println("Saindo do Programa");
			break;

		default:
			System.out.println("Opção Inválida");
		}

		entrada.close();
	}

}
