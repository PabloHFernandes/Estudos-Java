import java.util.Scanner;//Importando o scanner
public class ex {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in); // Declarando o scanner

        int n1 = sc.nextInt(); //Variavel recebendo inteiro

        if (n1 > 0){ // Se isso ent faça isso
            System.out.printf("O numero %d é positivo! ", n1);
        }
        else{ // Se não faça isso
            System.out.printf("O numero %d é negativo! ", n1);
        }

        sc.close(); //Fechamento do scanner
    }
}
