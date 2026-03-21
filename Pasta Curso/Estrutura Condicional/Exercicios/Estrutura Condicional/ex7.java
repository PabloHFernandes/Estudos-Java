import java.util.Locale; //Importando o ponto em troca da virgula
import java.util.Scanner; //Importando o scanner
public class ex7 {
    public static void main(String [] args){

        Locale.setDefault(Locale.US); //Setando o ponto
		Scanner sc = new Scanner(System.in); //Setando o scanner

		double x = sc.nextDouble(); //Variavel recebendo numero decimal
		double y = sc.nextDouble(); //Variavel recebendo numero decimal
		
		if (x == 0.0 && y == 0.0) { //Se x for igual a 0 e y tbm ele da como origem
			System.out.println("Origem");
		}
		else if (x == 0.0) { //Se o x for igual a 0 ele da no eixo y
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) { //Se o y for igual a 0 ele da no eixo x
			System.out.println("Eixo X"); 
		}
		else if (x > 0.0 && y > 0.0) { // Se x for maior q 0 e y maior q 0 ele ta Q1
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) { //Se x menor doq 0 e y maior doq 0 ele da Q2
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) { //Se o x menor doq 0 e y menor doq 0 ele da no Q3
			System.out.println("Q3");
		}
		else { //Se n bater com nenhum acima da no
			System.out.println("Q4");
		}

        sc.close(); //Fechamento do scanner
    }
}
