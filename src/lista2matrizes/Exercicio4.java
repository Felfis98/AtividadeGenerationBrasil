package lista2matrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float notas[][] = new float[10][4];
		float medias[] = new float[10];

		for(int i=0;i<10;i++) {

			float soma = 0;

			System.out.println("\nParticipante " + (i+1));

			for(int j=0;j<4;j++) {

				System.out.print("Nota: ");
				notas[i][j] = leia.nextFloat();

				soma += notas[i][j];

			}

			medias[i] = soma/4;

		}

		System.out.println("\nMédias:");

		for(int i=0;i<10;i++) {

			System.out.println("Participante "
			+ (i+1) + ": " + medias[i]);

		}

		leia.close();

	}

}