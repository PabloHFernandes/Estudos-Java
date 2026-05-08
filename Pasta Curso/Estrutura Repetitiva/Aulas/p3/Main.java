import java.util.Scanner;
public class Main{
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        double celsius;
        double fahrenheit;
        char escolha;

        do{
            System.out.println("Coloque a temperatura em Celcius: ");
            celsius = sc.nextDouble();

            fahrenheit = ((9 * celsius) / 5) + 32;

            System.out.println(fahrenheit);

            System.out.println("Deseja continuar? (s/n)");
            escolha = sc.next().charAt(0);

        } while(escolha == 's');

        sc.close();

    }
}