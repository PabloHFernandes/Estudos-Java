public class App2 {
        public static void main(String [] args){

        int x, y;
        double resultado;

        x = 5;
        y = 2;

        resultado = (double) x / y; //O resultado dessa divisão seria 2.5, porem o compilador entende que os numeros inteiros, n restam nada após a virgula, ent para converter o resultado para que haja numeros após a virgula usamos o (double) e para inteiro usamos (int) antes da operação "(Casting)" 

        System.out.println(resultado);
        System.out.println();
    }
}