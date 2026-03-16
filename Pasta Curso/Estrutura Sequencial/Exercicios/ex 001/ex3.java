import java.util.Scanner; //Importa o Scanner

public class ex3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        
        //Variaveis guardando inteiros
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int diferenca = (a * b - c * d); //Processamento de dados calculando a diferença

        System.out.println("Diferença: " + diferenca); //Exibindo a diferença na tela

        sc.close(); //Encerrando o ciclo do scanner
    } 
}
