package orientacaoObjeto;

import entidade.Conta;

public class Aula4_2_Classe {

	public static void main(String[] args) {
		Conta conta = new Conta();
		Conta cc = new Conta();
		
			conta.saldo = 100;
			cc.saldo= 333;
			
			conta.numero= 123;
			cc.numero = 321;
		
			System.out.println("Conta:" + conta.saldo);
			System.out.println("Conta:" + cc.saldo);
			
			conta.saldo -= 50;
			cc.saldo += 50;
		
			System.out.println("--------------------------");
			System.out.println("Conta:" + conta.saldo);
			System.out.println("Conta:" + cc.saldo);
	
	}

}
