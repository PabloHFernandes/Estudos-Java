import java.util.Scanner; //Importando o scanner
public class ex3 {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in); //Declarando o scanner

        int A = sc.nextInt(); //Variavel recebendo inteiro
        int B = sc.nextInt(); //Variavel recebendo inteiro

        if (A % B == 0 || B % A ==0){ // Se ent faça isso
            System.out.printf("%d e %d são multiplos! ", A, B);
        } 
        else{ //Se não faça isso
            System.out.printf("%d e %d não são multiplos! ", A, B);
        }

        sc.close(); //Fechamento do scanner
    }
    
}
