import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in); 
        int x = sc.nextInt(); 

        int soma = 0; // Variavel soma recebendo 0, pois como a variavel precisa receber algum valor, o 0 é o elemento nulo ent iniciará com 0

        //(REGRA: v - executa e volta, f - pula fora! )
        
        while (x != 0) { // While = ENQUANTO, deve-se usar quando não se sabe previamente a quantidade de repetições que serão rodadas 
            soma = soma + x; // Soma vai receber o valor dela + o numero q vier na vez da repetição
            x = sc.nextInt(); // Aq seria para o usuario inserir um novo valor
        }

        System.out.println(soma); // Printar a soma dos numeros na tela

        sc.close();
    }
}