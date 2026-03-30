import java.util.Scanner; //Importando o Scanner
public class ex4 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in); //Declarando o Scanner

        int horaInicial = sc.nextInt(); //Variavel recebendo inteiro
        int horaFinal = sc.nextInt(); //Variavel recebendo inteiro

        int duracao; //Variavel recebendo inteiro

        if (horaInicial < horaFinal){ //Se hora inicial for  menor doq a hora inicial, realize isso
            duracao = horaFinal - horaInicial; //Duração é o tempo q acabou - a q começou
        }
        else{
            duracao = 24 - horaInicial + horaFinal; // Como o limite é 24 é só fazer a hora inicial + a hora final e subtrair de 24 horas 
        }

        System.out.println("O jogo durou " + duracao + " Horas(s)"); // Printar informação na tela

        sc.close(); // Fechar o scanner
    } 
}
