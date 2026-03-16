import java.util.Locale; //Importando o ponto
import java.util.Scanner; //Importando o scanner

public class ex4 {
    public static void main(String [] args){
        Locale.setDefault(Locale.US); //Setando o ponto no projeto
        Scanner sc = new Scanner(System.in); //Setando o Scanner no projeto
    
        int numeroFuncionario = sc.nextInt(); //Variavel recebendo o valor inteiro q é o numero do funcionario
        double horasTrabalhadas = sc.nextDouble(); //Variavel recebendo o valor decimal q é a horas
        double valorHora = sc.nextDouble(); //Variavel recebendo o valor decimal q é o valor das horas

        double salario = (horasTrabalhadas * valorHora); //Processamento de dados q é o calculo do salario

    //%f = ponto flutuante. %d = inteiro. %s = texto. %n quebra de linha %c char

        System.out.println("Number: " + numeroFuncionario); //Exibindo o numero do funcionario
        System.out.printf("Salary: U$ %.2f%n", salario); //Exibindo o salario do funcionario com 2 casas após a virgula

        sc.close();
    } 
}
