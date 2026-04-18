package atividadePratica;
import java.util.Scanner;

public class DiferencaProdutos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float n1, n2, n3, n4, resultado;

        System.out.print("numero1: ");
        n1 = sc.nextFloat();

        System.out.print("numero2: ");
        n2 = sc.nextFloat();

        System.out.print("numero3: ");
        n3 = sc.nextFloat();

        System.out.print("numero4: ");
        n4 = sc.nextFloat();

        resultado = (n1 * n2) - (n3 * n4);

        System.out.println("\nDiferença: " + resultado);

        sc.close();
    }
}