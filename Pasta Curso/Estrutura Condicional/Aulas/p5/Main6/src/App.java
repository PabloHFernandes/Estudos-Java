public class App {
    public static void main(String[] args){
        // ESCOPO E INICIALIZAÇÃO
        // ESCOPO É A REGIÃO DO PROGRAMA ONDE A VARIAVEL É VALIDA, OU SEJA, ONDE ELA PODE SER REFERENCIADA
        // UMA VARIAVEL N PODE SER USADA SE NÃO FOR INICIADA

        double price  = 400.00;
        double discount; // Poderia ser iniciada aq tbm com o valor 0

        if (price < 200.00){ // Se preço menor doq 200.00 o desconto é baseado com o preço vezes 0.1
            discount = price * 0.1;
        }
        else {
            discount = 0; //A variavel deve ser iniciada para ser informada no print
        }

        System.out.println(discount); // Se a variavel n tivesse sido iniciada no else ele daria erro, pois seria uma variavel n iniciada
    }
}
