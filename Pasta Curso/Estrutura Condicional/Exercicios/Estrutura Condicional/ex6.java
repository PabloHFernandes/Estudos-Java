import java.util.Locale; // Importando o locale
import java.util.Scanner; //Importando o scanner
public class ex6 {
    public static void main(String [] args){
        Locale.setDefault(Locale.US); //Setando o ponto ao inves da virgula
        Scanner sc = new Scanner (System.in); //Setando o scanner

        double numero = sc.nextDouble(); //Variavel recebendo um numero com virgula

        if (numero < 0.0 || numero > 100 ){ //Se o numero menor doq 0 ou maior doq 100, ele esta fora do intervalo
            System.out.println("Fora do intervalo! "); 
        }
        else if (numero <= 25){ // Se o numero for menor ou igual a 25 ele esta no intervalo entre 0 a 25
            System.out.println("Intervalo [0,25]"); 
        }
        else if (numero <= 50){ //Se o numero for menor ou igual a 50 ele esta no intervalo entre 25 a 50
            System.out.println("Intervalo [25,50]");
        }
        else if (numero <= 75){ //Se o numero for menor ou igual a 75 ele esta no intervalo entre 50 a 75
            System.out.println("Intervalo [50,75]");
        }
        else{ //Se n tiver entre nenhum acima, ele estara entre 75 a 100 ent faça isso 
            System.out.println("Intervalo [75,100]");

        sc.close(); //Fechamento do scanner
        }
    }
    
}
