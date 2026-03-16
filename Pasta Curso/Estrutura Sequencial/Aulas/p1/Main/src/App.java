import java.util.Locale; //Importado o Locale para fazer a trasnformação da virgula pelo ponto

public class App { //%n ou \n é para quebrar a linha
    public static void main(String[] args){
        double x = 10.35784; //Variavel Padrao <TIPO> <NOME> <VALOR A RECEBER>
        int y = 30;
        System.out.printf("%.2f%n", x); //PRINTF é para formatar como aq o 10.35784 vai aparecer 2 casas após a virgula só
        Locale.setDefault(Locale.US); //Transformar a virgula q é padrao br para o ponto q é padrao EUA
        System.out.printf("%.2f%n", x);
        System.out.println("O x é = " + x + " E o y é = " + y);//Concatenação usando o +
        System.out.printf("Resultado = %.2f metro%n", x);//Concatenação do numero com 2 casas após a virgula 

//Separador

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        //%f = ponto flutuante. %d = inteiro. %s = texto. %n quebra de linha
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); 
    }
}
