package target;

import java.util.Scanner;

public class problemaDois {
	public static void main(String[] args) {
		//solicitar um numero ao usuario
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		//armazenar valor na variavel inteira num
		int num = entrada.nextInt();
		
		//criar variaveis para testar a sequencia
		int a = 0, b = 1, c = 0;
		/*criar varaivel pertence iniciando como falso para 
		verificar se faz parte da sequancia de Fibonacci
		*/
		boolean pertence = false;
		
		//loop para calcular o valor da sequencia de Fibonacci
		while(c < num) {
			
			c = a + b;
			a = b;
			b = c;
			
		}
		//Testar condicional se faz parte da sequencia mudando valor de pertence
		if (c == num) {
			pertence = true;
		}
		//exibir se o numero faz parte ou nao da sequencia
		if (pertence) {
			System.out.println(num + " faz parte da sequencia de Fibonacci!");
		} else {
			System.out.println(num + " nao faz parte da sequencia de Fibonacci!");
		}
		
	}

}
