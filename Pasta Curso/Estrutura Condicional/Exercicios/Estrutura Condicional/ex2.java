import java.util.Scanner;//Importando o scanner
public class ex2 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in); //Declarando o scanner

        int n1 = sc.nextInt(); //Variavel recebendo inteiro

        if (n1 % 2 == 0){ // Se ent faça isso
            System.out.printf("O número %d é Par! ", n1);
        }
        else{ // Se não faça isso
            System.out.printf("O número %d é Impar! ", n1);
        }

        sc.close(); //Fechamento do scanner
    }
    
}
