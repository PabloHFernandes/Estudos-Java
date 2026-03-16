import java.util.Scanner; // Importando o Scanner q é um meio de entrada de dados 

public class App5 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in); // Linkando o scanner com o teclado no console
    // LER VARIAS DADOS NA MESMA LINHA SEPARADO POR ESPAÇOS
            
            String a;
            int b;
            double c;

            a = sc.next();
            b = sc.nextInt();
            c = sc.nextDouble();
            System.out.println("Dados Digitados: ");
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

    sc.close();

    }
}