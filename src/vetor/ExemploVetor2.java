package vetor;

import java.util.Scanner;

public class ExemploVetor2 {

	public static void main(String[] args) {

		// Criando um vetor vazio com 3 posições
		int vetorNumeros[] = new int [3];
		Scanner leia = new Scanner(System.in);
		
		// vetorNumero[0]
		
		for(int indice = 0; indice < 3; indice++) {
			System.out.println("Digite um numero: ");
			vetorNumeros[indice] = leia.nextInt();
			// numero = leia.nextInt();
		}
	}

}
