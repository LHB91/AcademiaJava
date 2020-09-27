package orientacaoObjeto;

import java.util.Scanner;

import entidade.Conta;
import entidade.Endereco;
import entidade.Pessoa;

public class ExercicioAula4_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		
		Pessoa p = new Pessoa();
		p.nome = null;
		p.cpf = null;
		p.sexo = null;
		p.idade = 0;
		p.endereco = null;
		p.conta = null;
		
		Endereco e = new Endereco();
		e.rua = null;
		e.numero = 0;
		e.complemento = null;
		e.cep = null; 
		
		Conta c = new Conta();
		c.numero = 0;
		c.saldo = 0;
		c.limite = 0;
		
		while (opcao != 6) {
			
			System.out.println("Digite a Opção Desejada");
			System.out.println("(1) Cadastro Pessoa");
			System.out.println("(2) Cadastro Endereço");
			System.out.println("(3) Cadastro Conta");
			System.out.println("(4) Vincular Conta e Endereço");
			System.out.println("(5) Imprimir");
			System.out.println("(6) Sair");
			opcao = entrada.nextInt();
			entrada.nextLine();

			
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				p.nome = entrada.nextLine();
				System.out.println("Digite o CPF: ");
				p.cpf = entrada.nextLine();
				System.out.println("Digite a idade: ");
				p.idade = entrada.nextInt();
				entrada.nextLine();
				System.out.println("Digite o sexo: ");
				p.sexo = entrada.nextLine();
				break;
			case 2:
				System.out.println("Digite a Rua: ");
				e.rua = entrada.nextLine();
				System.out.println("Digite o Número: ");
				e.numero = entrada.nextInt();
				entrada.nextLine();
				System.out.println("Digite o Complemento: ");
				e.complemento = entrada.nextLine();
				System.out.println("Digite o CEP: ");
				e.cep = entrada.nextLine();
				break;
			case 3:
				System.out.println("Digite o Número: ");
				c.numero = entrada.nextInt();
				System.out.println("Digite o Saldo: ");
				c.saldo = entrada.nextDouble();
				entrada.nextLine();
				System.out.println("Digite o Limite: ");
				c.limite = entrada.nextDouble();
				break;
			case 4:
				System.out.println("-------------Vinculando-------------");
				p.endereco = e;
				p.conta = c;
				System.out.println("-------------Vinculado-------------");
				break;	
			case 5:
				System.out.println("-------------Pessoa-------------");
				System.out.println("Nome: " + p.nome + " Idade: " + p.idade);
				System.out.println("Sexo: " + p.sexo + " CPF: " + p.cpf);
				System.out.println("-------------Endereço-------------");
				System.out.println("Rua: " + p.endereco.rua + " Nº: " + p.endereco.numero);
				System.out.println("Comp: " + p.endereco.complemento + " CEP: " + p.endereco.cep);
				System.out.println("-------------Conta-------------");
				System.out.println("Nº : " + p.conta.numero);
				System.out.println("Saldo: " + p.conta.saldo + " Limite: " + p.conta.limite);
				break;
			case 6:
				System.out.println("Saindo do Programa");
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
			
		}
		
		
	}

}
