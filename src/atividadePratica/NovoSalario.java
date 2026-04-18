package atividadePratica;

import java.util.Scanner;

public class NovoSalario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float salario, abono, novoSalario;

        System.out.print("Salário: ");
        salario = sc.nextFloat();

        System.out.print("Abono: ");
        abono = sc.nextFloat();

        novoSalario = salario + abono;

        System.out.println("\nNovo Salário: " + novoSalario);

        sc.close();
    }
}