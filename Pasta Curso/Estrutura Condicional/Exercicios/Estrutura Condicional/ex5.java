import java.util.Scanner;
public class ex5 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double preco;
        
        if (codigo == 1){
            preco = quantidade * 4.0;
        }
        else if (codigo == 2){
            preco = quantidade * 4.5;
        }
        else if (codigo == 3){
            preco = quantidade * 5.0;
        }
        else if (codigo == 4){
            preco = quantidade * 2.0;
        }
        else {
            preco = 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", preco);

        sc.close();
    }
    
}
