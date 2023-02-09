package com.homework;

import java.time.LocalDate;

public class Methods {

    public static boolean isItleapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static String deviceOS(int os) {
        String osName;
        if (os == 0) {
            osName = "iOS";
        } else {
            osName = "Android";
        }
        return osName;
    }

    public static String deviceYear(int year) {
        String osType;
        if (year == 2023) {
            osType = "стандартную";
        } else {
            osType = "облегченную";
        }
        return osType;
    }

    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача1");
        int year = 2021;
        if (isItleapYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    public static void task2() {
        System.out.println("Задача2");
        int clientOS = 0;
        int clientDeviceYear = 2023;
        String osName = deviceOS(clientOS);
        String osType = deviceYear(clientDeviceYear);
        System.out.println("Уствновите " + osType + " версию для " + osName);
    }

    public static void task3() {
        System.out.println("Задача3");
        int deliveryDistance = 100;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет!");
        }
    }
}
