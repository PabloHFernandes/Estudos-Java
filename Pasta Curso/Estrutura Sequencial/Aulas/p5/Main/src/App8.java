public class App8 {
    public static void main (String [] args ){
        
        double x = 3.0; //Declarando Variaveis
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x); // Math.sqrt() Significa a raiz quadrada, no caso x é o valor declarado na variavel
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);
        System.out.println(); //Apenas pular linha

        A = Math.pow(x, y); // Math.pow() Significa elevado, no caso x e y é o valor declarado na variavel (No caso x elevado a Y)
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);
        System.out.println(); //Apenas pular linha

        A = Math.abs(y); // Math.abs() Significa receber o valor absoluto no caso é o y, onde é sem o negativo (Tirar o sinal negativo caso exista)
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
    }
}

//MAIORES INFORMAÇÕES DO FORMULAS MATEMATICA, ACESSAR O SITE: java.lang.Math