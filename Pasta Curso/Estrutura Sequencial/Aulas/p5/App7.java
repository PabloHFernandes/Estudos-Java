import java.util.Scanner; // Importando o Scanner q é um meio de entrada de dados 

public class App7 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in); // Linkando o scanner com o teclado no console

        int x; 
        String s1, s2, s3;

        // Quando consome a quebra q linha q fica pendente chama buffing, ent quando conseguimos consumir a linha q fica pendente é chamado de limpeza de buffer de leitura! 

        //Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linha fica "pendente" na entrada padrão. Se você então fizer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine().

            x = sc.nextInt(); 
            sc.nextLine(); // SOLUÇÃO: Fazer um nextLine() extra antes do nextLine() q ira usar.
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            s3 = sc.nextLine();

            System.out.println("Dados Digitados: ");
            System.out.println(x);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
        
    sc.close();
    }
}