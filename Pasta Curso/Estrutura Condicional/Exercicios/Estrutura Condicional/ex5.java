import java.util.Scanner; //Importando o scanner
public class ex5 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in); //Setando o Scanner

        int codigo = sc.nextInt(); //Variais recebendo inteiro
        int quantidade = sc.nextInt();

        double preco; //Variavel recebendo numero com virgula
        
        if (codigo == 1){
            preco = quantidade * 4.0; // cod 1 retorna o preco dele e quantos quer dando o preço final
        }
        else if (codigo == 2){
            preco = quantidade * 4.5; // cod 2 retorna o preco dele e quantos quer dando o preço final
        }
        else if (codigo == 3){
            preco = quantidade * 5.0; // cod 3 retorna o preco dele e quantos quer dando o preço final
        }
        else if (codigo == 4){
            preco = quantidade * 2.0; // cod 4 retorna o preco dele e quantos quer dando o preço final
        }
        else {
            preco = 1.5; // cod 5 retorna o preco dele e quantos quer dando o preço final
        }

        System.out.printf("Total: R$ %.2f%n", preco); //Printando a informação na tela

        sc.close(); //Fechando o scanner
    }
    
}
