import java.util.Locale;
import java.util.Scanner;
public class ex5 {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoPeca1 = sc.nextInt();
        int numeroPeca1 = sc.nextInt();
        double valorUnitario = sc.nextDouble();

        int codigoPeca2 = sc.nextInt();
        int numeroPeca2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();

        double valorPagar = (numeroPeca1 * valorUnitario) + (numeroPeca2 * valorUnitario2);

        //%f = ponto flutuante. %d = inteiro. %s = texto. %n quebra de linha %c char

        System.out.printf("O número da peça 1 é: %d, e da peça 2 é: %d%n", codigoPeca1, codigoPeca2);
        System.out.printf("E o valor a ser pago é: R$ %.2f%n", valorPagar);

        sc.close();
    }
}
