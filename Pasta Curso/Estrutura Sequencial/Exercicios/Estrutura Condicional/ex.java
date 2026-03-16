import java.util.Scanner; // Importando o Scanner pro projeto
public class ex{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // Entrada de dados e armazenando 2 numeros inteiros
        int y = sc.nextInt();// Entrada de dados e armazenando 2 numeros inteiros

        int soma = x + y; //Processamento de dados fazendo a soma
        System.out.println("Soma = " + soma); // Exibindo a soma na tela

        sc.close(); // Fechandom o ciclo do Scanner

    }
}