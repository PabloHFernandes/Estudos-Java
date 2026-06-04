public class App{
    public static void main (String [] args){

        String s = "potato apple lemon"; 

        String [] vect = s.split(" "); //Declarado vetor, o split serve para dividir algo a partir de uma declaração, no caso ele vai dividir quando tiver um espço em branco.

        System.out.println(vect[0]);//Acessando a posição 1 do vetor, q no caso começa no 0
        System.out.println(vect[1]);//Acesando a posição 2
        System.out.println(vect[2]);//Acessando a posição 3

    }
}