package com.homework;

import java.time.LocalDate;

public class Methods {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

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
        int currentYear = LocalDate.now().getYear();
        if (year == currentYear) {
            osType = "стандартную";
        } else {
            osType = "облегченную";
        }
        return osType;
    }

    public static String amountDays(int distance) {
        String deliveryTime;
        if (distance <= 20) {
            deliveryTime = "Потребуется дней: 1";
        } else if (distance > 20 && distance < 60) {
            deliveryTime = "Потребуется дней: 2";
        } else if (distance > 60 && distance < 100) {
            deliveryTime = "Потребуется дней: 3";
        } else {
            deliveryTime = "Доставки нет!";
        }
        return deliveryTime;
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
        int clientDeviceYear = 2022;
        String osName = deviceOS(clientOS);
        String osType = deviceYear(clientDeviceYear);
        System.out.println("Уствновите " + osType + " версию для " + osName);
    }

    public static void task3() {
        System.out.println("Задача3");
        int deliveryDistance = 100;
        String deliveryDays = amountDays(deliveryDistance);
        System.out.println(deliveryDays);
    }
}
