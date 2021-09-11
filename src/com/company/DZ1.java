package com.company;

public class DZ1 {

    public static void main (String[] args)
    {
        //Задание №1:
        //1. инструкция, которая присваивает переменной x значение 1,5
        double x = 1.5;
        System.out.println(x);

        //3. инструкция, которая увеличивает на единицу значение переменной n
        int i = 2;
        int n = ++i;
        System.out.println(n);

        //5. инструкция вычисления среднего арифметического переменных x1 и x2
        int x1 = 3;
        int x2 = 5;
        int sa = (x1 + x2)/2;
        System.out.println(sa);

        /*
        7. инструкция, которая увеличивает значение переменной z на величину,
        находящуюся в переменной dx
         */
        int dx=8;
        int z=10+dx;
        System.out.println(z);

        /*
        9. написать в виде инструкции формулу пересчета расстояния из километров в версты
        (1 верста = 1066,8 м)
         */
        double km = 5;
        double v = km/1.0668;
        System.out.println(v);

        /*
        11. написать в виде инструкции формулу вычисления площади треугольника
        s=a*h/2
         */
        int a = 2;
        int h = 5;
        int st = (a*h)/2;
        System.out.println(st);

        /*
        13. написать в виде инструкции формулу вычисления площади круга
        s=П*r^2
         */
        int r = 5;
        double P = Math.PI;
        double area = r * r * P;
        System.out.println(area);

        /*
        15. написать в виде инструкции присваивания формулу вычисления
        объема параллелепипеда
         */
        a=10;
        int b = 2;
        int c = 2;
        int result=a*b*c;
        System.out.println(result);

        /*
        17. написать в виде инструкции присваивания формулу вычисления
        объема цилиндра
         */
        int s=2;
        h=8;
        result=s*h;
        System.out.println(result);

        /*
        19. написать в виде инструкции присваивания формулу вычисления
        объема конуса
         */
        int S = 2;
        h = 10;
        double result1=(h/3)*S;
        System.out.println(result1);

        /*
        21. написать в виде инструкции присваивания формулу вычисления сопротивления
        электрической цепи, состоящей из двух параллельно соединенных резисторов
         */
        int R1 = 20;
        int R2 = 15;
        result = (R1*R2)/(R1+R2);
        System.out.println(result);

        //Задание №2:

        //1. загадать однозначное число в 10-тичной системе. Преобразовать его
        //в двоичную и 16-ричную (в столбик)
        int number=3;
        String bin=Integer.toBinaryString(number);
        String hex=Integer.toHexString(number);
        System.out.println("Однозначное число в двоичной системе = " + bin);
        System.out.println("Однозначное число в 16-ричной системе = " + hex);

        //2. загадать двузначное число в 10-тичной системе. Преобразовать его
        //в двоичную и 16-ричную.
        number=47;
        bin=Integer.toBinaryString(number);
        hex=Integer.toHexString(number);
        System.out.println("Двузначное число в двоичной системе = " + bin);
        System.out.println("Двузначное число в 16-ричной системе = " + hex);

        //3. загадать трехзначное число в двоичной системе. Преобразовать его
        //в десятичную и 16-ричную.
        number=Integer.parseInt("111",2);
        String dec=Integer.toString(number);
        String hex1=Integer.toHexString(number);
        System.out.println("Трехзначное число в десятичной системе = " + dec);
        System.out.println("Трехзначное число в 16-ричной системе = " + hex1);

        //4. загадать шестизначное число в двоичной системе. Преобразовать его
        //в десятичную и 16-ричную.
        number=Integer.parseInt("010111",2);
        dec=Integer.toString(number);
        hex1=Integer.toHexString(number);
        System.out.println("Шестизначное число в десятичной системе = " + dec);
        System.out.println("Шестизначное число в 16-ричной системе = " + hex1);

        //5. загадать двузначное число в 16-ричной системе. Преобразовать его
        //в двоичную и десятичную.
        number=Integer.parseInt("10",16);
        bin=Integer.toBinaryString(number);
        dec=Integer.toHexString(number);
        System.out.println("Двузначное число в двоичной системе = " + bin);
        System.out.println("Двузначное число в десятичной системе = " + dec);

        //6. загадать четырехзначное число в 16-ричной системе. Преобразовать его
        //в двоичную и десятичную.
        number=Integer.parseInt("123",16);
        bin=Integer.toBinaryString(number);
        dec=Integer.toString(number);
        System.out.println("Четырехзначное число в двоичной системе = " + bin);
        System.out.println("Четырехзначное число в десятичной системе = " + dec);

        //Задание №3:

        //1. Дано трехзначное число. Вывести число, полученное при прочтении
        //исходного числа справа налево
        String i1="251";
        String revers = new StringBuffer(i1).reverse().toString();
        System.out.println(revers);

        //4. Дано трехзначное число. Заменить в нем вторую цифру, если она является четной,
        //на ближайшую нечетную цифру.

        //???

        //7. Дано трехзначное число.Определить является ли его число сотен нечетным числом
        number=300;
        if (number % 200 == 0 )
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");

        //10. Дано трехзначное число.Определить разность между этим числом и числом, записанным
        //из тех же цифр, но в обратном порядке
        int number1=453;
        String num=Integer.toString(number1);
        String number2 = new StringBuffer(num).reverse().toString();
        int numbernew=Integer.parseInt(number2);
        result=number1-numbernew;
        System.out.println(result);

    }
}
