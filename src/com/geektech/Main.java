package com.geektech;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int number = 0;

    public static void main(String[] args) {
        // write your code here
        // Римские цифры перевести в int
        /*Создать массив из 10< чисел, задать параметры для ротации чисел, группировки однозначных чисел,
         вывести среднеорифметические значения положительных и отрицательных чисел, */

        System.out.println("Введите римское число: ");
        Scanner scanner = new Scanner(System.in);
        decodeSingle(scanner.nextLine());
    }

    public static void decodeSingle(String letter) {
        char[] array = letter.toCharArray();
        for (char c : array) {
            String text = String.valueOf(c);
            switchArray(text);
        }

        System.out.println(number);


    }

    public static void switchArray(String letter) {
        switch (letter) {
            case "M":
                number += 1000;
                break;
            case "D":
                number += 500;
                break;
            case "C":
                number += 100;
                break;
            case "L":
                number += 50;
                break;
            case "X":
                number += 10;
                break;
            case "V":
                number += 5;
                break;
            case "I":
                number += 1;
                break;
            default:
                number += 0;
                break;
        }

    }


}




