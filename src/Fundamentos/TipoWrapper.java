package Fundamentos;

public class  TipoWrapper {

    public static void main(String[] args) {

        // Wrappers são versões orientadas a objetos dos tipos primitivos

        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt("10000"); // int / converte string para int
        Long l = 100000L;

        System.out.println(b.byteValue()); // valor
        System.out.println(s.toString()); // Converte para String

        Boolean bo = Boolean.parseBoolean("true"); // String para booleano
        System.out.println(bo);

        Character c = '#'; //char
        System.out.println(c.toString()); //converte paractere para string

        Float f = 123F;
        System.out.println(f);

        Double d = 12345.543;
        System.out.println(d);

    }
}
