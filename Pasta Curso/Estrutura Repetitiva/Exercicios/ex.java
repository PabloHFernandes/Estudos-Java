import java.util.Scanner;

public class ex {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Senha incorreta! ");
            senha = sc.nextInt();

            if (senha == 2002){
                System.out.println("Acesso liberado! ");
            }
        }
        
        sc.close();
    }
}
