import java.util.Locale; //Importando o LOCALE q é o ponto   
import java.util.Scanner; //Importando o Scanner
public class ex2 {
    public static void main(String [] args){
        Locale.setDefault(Locale.US); //Setando o ponto pro projeto
        Scanner sc = new Scanner(System.in); //Setando o Scanner

        double raio = sc.nextDouble(); //Variavel para inserir um numero com virgula
        double area = ((3.14159) * (raio * raio)); //Processamento de dados para calcular a area

        System.out.printf("O valor da area é %.4f%n", area); //Exibir a area na tela com 4 casas decimais apos a virgula

        sc.close();
    }
}
