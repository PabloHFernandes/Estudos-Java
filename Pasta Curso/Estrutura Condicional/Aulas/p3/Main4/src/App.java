import java.util.Scanner; //Importando o Scanner
public class App {
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in); //Setando o Scanner

        int x = sc.nextInt(); //Variavel recebendo um inteiro
        String dia; //Variavel recebendo uma palavra

        switch (x) { //Switch é para avaliar algo para os casos, q aq é o numero dos casos
            case 1:
                dia = "Domingo"; //Caso 1 é o dia domingo e o break é necessario em cada caso
                break;
            
            case 2:
                dia = "Segunda"; //Caso 2 é o dia segunda e o break é necessario em cada caso
                break;
            
            case 3: 
                dia = "Terça"; //Caso 3 é o dia terca e o break é necessario em cada caso
                break;

            case 4:
                dia = "Quarta"; //Caso 4 é o dia quarta e o break é necessario em cada caso
                break;

            case 5:
                dia = "Quinta"; //Caso 5 é o dia quinta e o break é necessario em cada caso
                break;
        
            case 6:
                dia = "Sexta"; //Caso 6 é o dia sexta e o break é necessario em cada caso
                break;

            case 7: 
                dia = "Sabado"; //Caso 7 é o dia sabado e o break é necessario em cada caso 
                break;  

            default:
                dia = "Valor invalido! "; //E se n for nenhum caso cai aq 
                break;
        }

        System.out.println("Dia da semana é " + dia); //Printando o dia
        sc.close(); //Fechamento do scanner
    }
}
