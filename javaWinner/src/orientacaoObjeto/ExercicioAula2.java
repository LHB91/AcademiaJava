package orientacaoObjeto;

import java.util.Scanner;

public class ExercicioAula2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cadastre informoma��es da pessoa");
		System.out.println("--------------------------");
		System.out.println("Informe o nome: ");
		String nome = entrada.nextLine();
		System.out.println("Informe a idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Informe o sexo: ");
		String sexo = entrada.nextLine();
		System.out.println("--------------------------");
		System.out.println("Cadastre informoma��es do endere�o");
		System.out.println("--------------------------");
		System.out.println("Informe o n�mero: ");
		String numero = entrada.nextLine();
		System.out.println("Informe a rua: ");
		String rua = entrada.nextLine();
		System.out.println("Informe complemento: ");
		String complemento = entrada.nextLine();
		System.out.println("Informe in�cio do CEP: ");
		String cep1 = entrada.nextLine();
		System.out.println("Informe meio do CEP: ");
		String cep2 = entrada.nextLine();
		System.out.println("Informe final do CEP: ");
		String cep3 = entrada.nextLine();
		System.out.println("--------------------------");
		System.out.println("Cadastre informoma��es da conta");
		System.out.println("--------------------------");
		System.out.println("Informe o n�mero da conta: ");
		int numeroConta = entrada.nextInt();
		System.out.println("Informe o saldo: ");
		double saldo = entrada.nextDouble();
		System.out.println("Informe limite: ");
		double limite = entrada.nextDouble();
		System.out.println(" ");
		System.out.println("-------------Pessoa-------------");
		System.out.println("Nome: " + nome + " Idade: " + idade);
		System.out.println("Sexo: " + sexo + " Ano de nascimento: " + (2020 - idade));
		System.out.println("-------------Endere�o-------------");
		System.out.println("Rua: " + rua + " N�: " + numero);
		System.out.println("Comp: " + complemento + " CEP: " + cep1 + "." + cep2 + "-" + cep3);
		System.out.println("-------------Conta-------------");
		System.out.println("N�mero: " + numeroConta + " Saldo: R$" + saldo);
		System.out.println("Limite: R$" + limite);
		entrada.close();
	}

}
