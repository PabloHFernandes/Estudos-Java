import java.util.Scanner;

public class ex2 {
    public static void main(String [] args ){

        Scanner sc = new Scanner (System.in);

        int cordenadaX = sc.nextInt();
        int cordenadaY = sc.nextInt();

        while (cordenadaX != 0 && cordenadaY != 0){

            if (cordenadaX > 0 && cordenadaY > 0){
                System.out.println("Quadrante 1");
            }
            else if(cordenadaX > 0 && cordenadaY < 0){
                System.out.println("Quadrante 4");
            }
            else if(cordenadaX < 0 && cordenadaY < 0){
                System.out.println("Quadrante 3");
            }
            else{
                System.out.println("Quadrante 2");
            }

            cordenadaX = sc.nextInt();
            cordenadaY = sc.nextInt();

        }
        sc.close();
    }   
}
