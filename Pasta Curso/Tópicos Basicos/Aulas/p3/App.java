import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Ensira os 3 números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max(a, b, c); //Chamando a função para ver qual é o maior

        showResult(maior); //Chamando a função para mostrar a mensagem  na tela do maior

        sc.close();


    }

    public static int max(int x, int y, int z){ //Função para ver qual é o maior, no caso o tipo dela é um inteiro, o nome é max, e os valores a serem inseridos supostamente é xyz, porem pode ser nomes distintos
        int aux;

        if (x > y && x > z){
            aux = x;
        } 
        else if(y > z){
            aux = y;
        }
        else{
            aux = z;
        }
        return aux;
    }


    public static void showResult(int value){ //Função para mostrar a mensagem na tela de quem for o maior, no caso ela é vazia pois n retorna nada para ser utilizado, e o valor q entra nela é um valor inteiro
        System.out.println("Maior = " + value);
    }
}