import java.util.Scanner; // Importando o Scanner q é um meio de entrada de dados 

public class App4 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in); // Linkando o scanner com o teclado no console


        String w;
        w = sc.next(); // Ler uma palavra atraves do teclado
        System.out.println("Você Digitou o valor: " + w);

        int x;
        x = sc.nextInt(); // Ler um valor inteiro
        System.out.println("Você Digitou o valor: " + x);

        double y;
        y = sc.nextDouble(); // Ler um numero com virgula (Ponto Flutuante)
        System.out.println("Você Digitou o valor: " + y); // LOCALIDADE DO SISTEMA, sendo brasil é virgula ! / Se quiser usar o ponto deverá usar antes da declaração do scanner o comando: Locale.setDefault(Locale.US)

        char z;
        z = sc.next().charAt(0); // Ler um caracter 
        System.out.println("Você Digitou o valor: " + z);
    sc.close();
    }
}