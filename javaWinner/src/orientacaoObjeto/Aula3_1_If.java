package orientacaoObjeto;

import java.util.Scanner;

public class Aula3_1_If {

	public static void main(String[] args) {

		String txt = "aula";

		if (txt == "aula") {
			System.out.println("A");
		} else if (txt.equals("aula")) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		System.out.println("--------------------------");
		int a = 10;
		String b = "casa";

		if (!(a > 10 && b.equals("azul"))) {
			System.out.println("xx");
		} else if (b.equals("casal") || (a != 9)) {
			System.out.println("yy");
		}
		System.out.println("--------------------------");
		Scanner entrada = new Scanner(System.in);

		System.out.println("informe um número: ");
		int x = entrada.nextInt();
		if ((x % 2) == 0) {
			System.out.println(x + " é um número par");
		} else {
			System.out.println(x + " é um número impar");
		}
		System.out.println("--------------------------");
		System.out.println("Informe primeiro valor: ");
		double numeroA = entrada.nextDouble();
		System.out.println("Informe segundo valor: ");
		double numeroB = entrada.nextDouble();
		double soma = numeroA + numeroB;
		double multiplicacao = numeroA * numeroB;
		if (soma == multiplicacao) {
			System.out.println("Os valores de soma: " + soma + " e multiplicação: " + multiplicacao + " são iguais");
		} else
			System.out
					.println("Os valores de soma: " + soma + " e multiplicação: " + multiplicacao + " são diferentes");
		double maiorNumero;
		double menorNumero;
		double numero;
		System.out.println("Informe primeiro valor: ");
		numero = entrada.nextDouble();
		maiorNumero = numero;
		menorNumero = numero;
		System.out.println("Informe segundo valor: ");
		numero = entrada.nextDouble();
		if (numero > maiorNumero) {
			maiorNumero = numero;
		}
		if (numero < menorNumero) {
			menorNumero = numero;
		}
		System.out.println("Informe terceiro valor: ");
		numero = entrada.nextDouble();
		if (numero > maiorNumero) {
			maiorNumero = numero;
		}
		if (numero < menorNumero) {
			menorNumero = numero;
		}
		System.out.println("Informe quarto valor: ");
		numero = entrada.nextDouble();
		if (numero > maiorNumero) {
			maiorNumero = numero;
		}
		if (numero < menorNumero) {
			menorNumero = numero;
		}
		System.out.println("Informe quinto valor: ");
		numero = entrada.nextDouble();
		if (numero > maiorNumero) {
			maiorNumero = numero;
		}
		if (numero < menorNumero) {
			menorNumero = numero;
		}
			System.out.println("O menor número foi: " + menorNumero);
			System.out.println("O maior número foi: " + maiorNumero);
			
			entrada.close();
		}
	}
