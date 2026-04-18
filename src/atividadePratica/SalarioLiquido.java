package atividadePratica;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float salarioBruto, adicional, horasExtras, descontos, salarioLiquido;

        System.out.print("Salário Bruto: ");
        salarioBruto = sc.nextFloat();

        System.out.print("Adicional Noturno: ");
        adicional = sc.nextFloat();

        System.out.print("Horas Extras: ");
        horasExtras = sc.nextFloat();

        System.out.print("Descontos: ");
        descontos = sc.nextFloat();

        salarioLiquido = salarioBruto + adicional + (horasExtras * 5) - descontos;

        System.out.println("\nSalário Líquido: " + salarioLiquido);

        sc.close();
    }
}