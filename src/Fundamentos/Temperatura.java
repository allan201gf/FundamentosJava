package Fundamentos;

public class Temperatura {

    public static void main(String[] args) {

        // (F - 32) * 5/9 = C

        double f = 100;
        double c = ( f - 32 ) * 5.0/9;

        System.out.println("A temperatura em ºC é " + c);

    }

}
