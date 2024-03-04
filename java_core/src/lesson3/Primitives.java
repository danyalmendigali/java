package lesson3;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Primitives {
    public static void main(String[] args) {
        //Логические значение(булвые значения)
        boolean a = true;
        boolean a2 = true;

        //Целые числа
        byte maxByte = 127;
        byte minByte = -128;

        //Short - короткое число, состоит из двух байт или из 16 битов
        short maxShort = 32_767;
        short minShort = -32_768;

        //int - целое число, которое состоит из 4 байт или из 32 битов
        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;

        //long - целое число, которое состоит из 8 байт или из 64 битов
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;
        //System.out.print(maxLong);

        //Double - число с плаваюзей точкой, 64 bit
        double myBottle = 1.5;

        //Float - число с плвающей точкой, 32 bit
        float cola = 0.33F;

        double doubleNumber = 1.12345678901234567890;
        float floatNumber = 1.12345678901234567890F;
        System.out.println(doubleNumber);
        System.out.println(floatNumber);
    }
}
