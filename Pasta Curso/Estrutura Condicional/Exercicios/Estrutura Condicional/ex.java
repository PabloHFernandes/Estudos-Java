import java.util.Scanner;
public class ex {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        if (n1 > 0){
            System.out.printf("O numero %d é positivo! ", n1);
        }
        else{
            System.out.printf("O numero %d é negativo! ", n1);
        }

        sc.close();
    }
}
