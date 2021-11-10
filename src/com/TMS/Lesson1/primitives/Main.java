package com.TMS.Lesson1.primitives;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //task 1
//		Создайте переменные для каждого примитивного типа, подумайте об ограничениях по
//		наименованию переменных.
	System.out.println("Task 1: variables");

	byte b = 10;
	short s = 20;
	int i = 30;
	long l = 40;
	double d = 50.5;
	float f = 40.23f;
	boolean boo = true;
	char c = '%';

	//task 2
//		Создайте две переменные типа int и попробуйте поделить одно на другое, результат
//		какого типа получится в результате? Что будет если делитель будет нулевым? Как не
//		потерять точность при делении (числа после запятой)?
	int first = 20;
	int second = 3;
	double result = first/second;
        System.out.println("task 2: " + result);

    //Если делитель нулевой, выдаст ошибку
	//Использовать примитивы с плавающей запятой

	//task 3
//		Напишите программу, которая сравнивает два числа и пишет в консоль какое из этих
//		чисел больше или меньше
		System.out.print("Task 3: ");
	int a1 = 8;
	int b1 = 10;
	if(a1>b1){
		System.out.println("a>b");
		}else{
		System.out.println("a1<b1");
	}

	//task 4
//		Напишите программу, которая проверяет делится ли одно число на второе без остатка. В
//		случает если деление не целочисленное, то вывести в консоль сообщение о целой части
//		и об остатке от деления.
	System.out.print("task 4: ");
	int i2 = 31;
	int i3 = 2;
	int fina = i2/i3;
	if(i2%i3 == 0){
		System.out.println("divided");
	}else System.out.println(fina + ", остаток - " + i2 % i3);

    //task 5
//		Задать число (от 0 до 9999) и вывести в консоль количество тысяч, сотен, десятков и
//		единиц.
		System.out.println();
		System.out.println("Task 5: ");
		System.out.print("please, tap your number, more than 0, but less than 9999999: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();


		int units;
		int Tens;
		int hundreds;
		int thousands;
		int tensOfThousands;
		int hundredsOfThousands;
		int thousandsOfThousands;

		units = number % 10;
		Tens = (number / 10) % 10;
		hundreds = (number / 100) % 10;
		thousands = (number / 1000) % 10;
		tensOfThousands = (number / 10000) % 10;
		hundredsOfThousands = (number / 100000) % 10;
		thousandsOfThousands = (number / 1000000) % 10;

		System.out.println("the number is - " + number);
			System.out.println(
					"count of thousandsOfThousands - " + thousandsOfThousands + "\n" +
					"count of hundredsOfThousands - " + hundredsOfThousands + "\n" +
					"count of tensOfThousands - " + tensOfThousands + "\n" +
					"count of thousands - " + thousands + "\n" +
					"count of hundreds - " + hundreds + "\n" +
					"count of Tens - " + Tens + "\n" +
					"count of units - " + units
			);
		System.out.println();

	//task 6
//		Создайте переменную типа char и присвойте ей значение ‘a’. Прибавить к
//		переменной 1 и выведите значение переменной в консоль. Попробуйте
//		преобразовать тип переменной к int и снова вывести в консоль.
	System.out.println("Task 6: ");
	char some = 'a';
		System.out.println((int)some+1);

	//task 7
//		Создайте переменную типа int и присвойте ей значение 127, преобразуйте
//		ее к типу byte и выведите в консоль. Что произойдет если значение
//		переменной будет 128?
	System.out.println("Task 7: ");
	int whatever = 129;
		System.out.println((byte)whatever);
		//компилятор выведет число -128, предположу, что компилятор его воспринимает следующим по счету после 127.

	//task 8
//		Создайте переменную типа int (int i = 10) и выведите в консоль значение I /
//		0. Что произойдет? Измениться ли вывод если переменная будет типа float?
	System.out.println("Task 8: ");
	int i8 = 10;
		System.out.println(i/2);
		//нарушается важный математический постулат - на ноль делить нелья!
		//выдаст ошибку в обоих случаях



    }
}