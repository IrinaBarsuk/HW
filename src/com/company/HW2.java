package com.company;

public class HW2 {

    public static void main(String[] args) {
        //Задание 1,
        //Обнулить бит в нулевом разряде числа N.Остальные биты не должны изменить
        //своё значение. Вывести на консоль в двоичном виде.
        byte b=0b1001;
        byte rezalt= (byte) (~1&b);
        String result1=Integer.toBinaryString(rezalt);
        System.out.println("Задание №1: "+result1);

        //Задание 2.
        //установить i-й бит числа N равным 1. Вывести на консоль в двоичном виде.
        b=0b1011;
        rezalt= (byte) ((1<<2)|b);
        result1=Integer.toBinaryString(rezalt);
        System.out.println("Задание №2: "+result1);

        //Задание 3.
        //установить i-й бит числа N равным 0. Вывести на консоль в двоичном виде.
        b=0b1111;
        rezalt= (byte) (~(1<<2)&b);
        result1=Integer.toBinaryString(rezalt);
        System.out.println("Задание №3: "+result1);

        //Задание 4.
        //определить значение i-го бит числа N. Вывести на консоль в двоичном виде.
        int x=48;
        int position=5;
        result1=Integer.toBinaryString(x);
        int rezalt2= (x>>position)&1;
        System.out.println("Задание №4: значение "+position+"-го бит числа "+x+ " - "+ rezalt2 +", число в двоичном выражение - "+result1);

        //Задание 5.
        //определить, имеют ли числа M и N разные знаки, используя только побитовые и
        // условные операторы.
        byte a=0b1111;
        b=0b1001;
        if ((a^b) == 0)
            System.out.println("Задание №5: числа имеют одинаковые знаки");
        else System.out.println("Задание №5: числа имеют разные знаки");

        //Задание 6.
        //посчитать и вывести на консоль количество единичных битов в числе N. Вывести
        // на консоль исходное число в двоичном виде и результат.
        int count=0;
        x=45;
        String number = Integer.toBinaryString(x);
          while (x != 0){
           count += x&1;
           x = x>>1;}
           System.out.print("Задание №6: число в двоичном виде - " + number + ", количество единичных битов - " + count);
    }
}
