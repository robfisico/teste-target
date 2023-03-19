package target;
import java.util.Scanner;
//inverter string
public class problemaCinco {
	public static void main(String[] args) {
		//solicitar string
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a string a ser invertida: ");
		//ler string e salvar na variavel original
		String original = entrada.nextLine();
		//definir variavel invertida vazia para armazenar o texto invertido
		String invertida = "";
		
		//criar loop modificando a posição dos caracteres e armazenando na variavel invertida
		for(int i = original.length() - 1; i >= 0; i--) {
			invertida += original.charAt(i);
		}
		
		//exibir a palavra original e invertida
		System.out.println("String original: " + original);
		System.out.println("String invertida: " + invertida);
	}

}
