package orientacaoObjeto;

import java.util.Scanner;

public class Aula4_1_For {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int count = 0;

		for (int i = 10; i <= 100; i += 10) {
			count++;
		}
		System.out.println(count);
		System.out.println("--------------------------");

		/* System.out.println("Digite seu nome");
		String nome = entrada.nextLine();

		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + " " + nome);
		}
		System.out.println("--------------------------");*/
		
		double salario = 1200.00;
		System.out.println("Digite o valor do lanche");
		double valorLanche = entrada.nextDouble();
		int cout = 0; 
		
		for (int i = 0; i < salario ; i += valorLanche) {
			cout += 1; 
		}
		System.out.println(cout);
		
		entrada.close();
	}

}
