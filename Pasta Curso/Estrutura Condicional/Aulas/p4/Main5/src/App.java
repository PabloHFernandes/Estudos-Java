public class App {
    public static void main(String[] args){

        double preco1 = 34.5; //Variavel recebendo um numero com virgula
        double desconto1; //Variavel recebendo um numero com virgula

        if (preco1 < 20.0){ // se o preço for menor doq 20 o desconto é preco1 vezes 0.1
            desconto1 = preco1 * 0.1;
        }
        else{ // se nao é preco1 vezes 0.05
            desconto1 = preco1 * 0.05;
        }

        System.out.println(desconto1); //Printar na tela as informações

        //COM A EXPRESSAO CONDICIONAL TERNARIA FICARIA  

        double preco2 = 34.5; //Variavel recebendo um numero com virgula
        double desconto2 = (preco2 < 20.0) ? preco2 * 0.1 : preco2 * 0.05; // SINTAXE (condição) ? valor_se_verdadeiro : valor_se_falso 
        System.out.println(desconto2); //Printar na tela as informações



        
    }
}
