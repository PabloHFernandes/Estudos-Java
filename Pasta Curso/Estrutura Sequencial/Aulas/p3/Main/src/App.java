public class App {
    public static void main(String[] args){
        int idade = 20;
        int tempoServico = 2;
        String nome = "Pedro";
        double salario = 4.400;

        //%f = ponto flutuante. %d = inteiro. %s = texto. %n quebra de linha %c char

        if (idade >= 18 && tempoServico>= 2) {
            System.out.printf("%s, tem %d anos e trabalha a %d anos no mercado de programação, e possui um salario de $ %.3f reais %n", nome, idade, tempoServico, salario);
        }
        else{
            System.out.printf("Não passou com o nome %s%n", nome);
        }
    }
}