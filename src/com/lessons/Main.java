package com.lessons;

public class Main {
    public static void printSeparator() {
        System.out.println("------------------------------------");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void printGreetings(String n) {
        System.out.println(n);
    }

    public static String fullName(String f, String l) {
        return f + " " + l;
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {

        task1();
        training();

    }

    public static void task1() {
        int[] issuesByMonth = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMonth.length; i++) {
            printIssues(issuesByMonth[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonth);
        printIssues(total);
    }

    public static void training() {
        printSeparator();
        int num1 = 6;
        int num2 = 5;
        int[] box1 = {1, 2, 3};
        String firstName = "Konstantin";
        String lastName = "Momani";
        int sumNumbers = calculateSum(num1, num2);
        int sumArrElem = calculateSum(box1);
        printGreetings(firstName);
        printGreetings(lastName);
        int[] box2 = {4, 7, 9};
        int sumBoxElem = calculateSum(box2);
        System.out.println(sumNumbers);
        System.out.println(sumArrElem);
        System.out.println(sumBoxElem);
        String fullName = fullName(firstName, lastName);
        System.out.println(fullName);
        printArr(box1);
        printSeparator();
        printArr(box2);
    }
}