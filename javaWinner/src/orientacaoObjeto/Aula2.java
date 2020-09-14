package orientacaoObjeto;

import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos" );
		System.out.println("--------------------------");
		entrada.close();
	}
}
