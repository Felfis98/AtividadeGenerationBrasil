package lista2matrizes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int matriz[][] = new int[3][3];

		int somaPrincipal = 0;
		int somaSecundaria = 0;

		for(int i=0;i<3;i++) {

			for(int j=0;j<3;j++) {

				System.out.print("Digite valor ["+i+"]["+j+"]: ");
				matriz[i][j] = leia.nextInt();

			}
		}

		System.out.println("\nDiagonal Principal:");

		for(int i=0;i<3;i++) {

			System.out.print(matriz[i][i] + " ");
			somaPrincipal += matriz[i][i];

		}

		System.out.println("\n\nDiagonal Secundária:");

		for(int i=0;i<3;i++) {

			System.out.print(matriz[i][2-i] + " ");
			somaSecundaria += matriz[i][2-i];

		}

		System.out.println("\n\nSoma Principal: " + somaPrincipal);
		System.out.println("Soma Secundária: " + somaSecundaria);

		leia.close();

	}

}