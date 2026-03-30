import java.util.Scanner; // Importando o Scanner q é um meio de entrada de dados 

public class App6 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in); // Linkando o scanner com o teclado no console

        String s1, s2, s3;

            s1 = sc.nextLine();
            s2 = sc.nextLine();
            s3 = sc.nextLine();

            System.out.println("Dados Digitados: ");
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
        
    sc.close();
    }
}