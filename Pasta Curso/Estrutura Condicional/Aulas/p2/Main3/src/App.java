import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int minutos = sc.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
            conta = conta + (minutos - 100) * 2.0; //Conta é igual a conta onde oq utrapassar 100 ele vai pegar e fazer vezes 2 e somar com o valor a ser pago até 100 minutos q é o limite
        }

        System.out.printf("Valor da compra %.2f%n", conta); 

        sc.close();

        
    }
}
