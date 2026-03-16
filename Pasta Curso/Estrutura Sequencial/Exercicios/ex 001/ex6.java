import java.util.Locale;
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areaTriangulo = (A * C)/2; // A fez papel de base e C de altura
        areaCirculo = (3.14159 * C * C); // C fez papel de raio
        areaTrapezio = ((A + B) * C)/2; // A e B fez papel de base e C de altura
        areaQuadrado = (B * B); // B fez papel de lado
        areaRetangulo = (A * B); // A fez papel de lado e B altura

        //%f = ponto flutuante. %d = inteiro. %s = texto. %n quebra de linha %c char

        System.out.printf("Triangulo: %.3f%n", areaTriangulo); //Exibindo a area do triangulo
        System.out.printf("Circulo: %.3f%n", areaCirculo); //Exibindo a area do circulo
        System.out.printf("Trapézio: %.3f%n", areaTrapezio); //Exibindo a area do trapezio
        System.out.printf("Quadrado: %.3f%n", areaQuadrado); //Exibindo a area do quadrado
        System.out.printf("Retangulo: %.3f%n", areaRetangulo); //Exibindo a area do retangulo

        sc.close();
    }
}
