package com.generation;

public class Main {
    public static void main(String[] args) {
        //Datos primitivos
        byte num1 = 10;

        short num2 = 10;

        int num3 = 10;
        long num4 = 10;

        //Datos primitivos con decimales
        float decimal1 = 10.12121212f;
        double decimal2 = 23.34434d;

        // datos primitivos char

        char caracter = 'f';

        //dato primitivo boolean
        boolean verdadero = true;


        short numShort1 = num1;
        int numInt = numShort1;
        short numShort2 = (short) numInt;

//        System.out.println(numInt);
//        System.out.println(numShort2);

        byte numByte1 = 120;
        byte numByte2 = 120;

//        short suma = (short) (numByte1 + numByte2);
//
//        System.out.println((suma));

        //Operadores aritmeticos
        // + sumar y concatenar cadenas
        // - restar
        // * multiplicar
        // / dividir
        // % residuo
        // math

        // Ejercicios
        byte numA = 15;
        byte numB  = 5;

        short sumaT = (short) (numA + numB);
        short restaT = (short) (numA - numB);
        short multT = (short) (numA * numB);
        float divT =  numA / numB;

        System.out.println((sumaT));
        System.out.println((restaT));
        System.out.println((multT));
        System.out.println((divT));



    }
}
