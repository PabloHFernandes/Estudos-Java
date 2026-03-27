import java.util.Scanner;

public class App {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;

        // INICIO = execulta apenas na primeira vez. CONDIÇÃO = v - execulta e volta f - pula fora. INCREMENTO = execulta toda vez depois de voltar
        for (int i = 0; i < N; i++ ){ // FOR é usado quando sabemos o numero de repetição a ser usada (otima para fazer uma repetição baseada em contagem)
            int x = sc.nextInt();
            soma = soma + x;

        }
        
        System.out.println(soma);

        sc.close();
    }
}
