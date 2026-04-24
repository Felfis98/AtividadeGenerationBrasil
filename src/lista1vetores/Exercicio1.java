package lista1vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int vetor[] = {2,5,1,3,4,9,7,8,10,6};

		Scanner leia = new Scanner(System.in);

		int numero;
		boolean encontrado = false;

		System.out.print("Digite o número que deseja encontrar: ");
		numero = leia.nextInt();

		for(int i = 0; i < vetor.length; i++) {

			if(vetor[i] == numero) {
				System.out.println("O número " + numero +
						" está localizado na posição: " + i);
				encontrado = true;
			}
		}

		if(!encontrado) {
			System.out.println("O número " + numero + " não foi encontrado!");
		}

		leia.close();

	}

}