/*
Code này tạo phương thức:
- Tìm 1 số chia hết cho 3 và 5 và tính tổng các số chia hết cho 3 và 5 trong số x nhập từ bàn phím và tổng mảng với n phần tử
- Tìm 1 số chia hết cho 3 và tính tổng các số chia hết cho 3 và 5 trong số x nhập từ bàn phím và tổng mảng với n phần tử
- Tìm 1 số chia hết cho 5 và tính tổng các số chia hết cho 3 và 5 trong số x nhập từ bàn phím và tổng mảng với n phần tử
- Tìm 1 số không chia hết cho 3 và 5 và tính tổng các số chia hết cho 3 và 5 trong số x nhập từ bàn phím và tổng mảng với n phần tử
 */
package Divide3vs5;

import java.util.Scanner;

/*
NERO SARO
 */
public class Divide {
    
    //với số nguyên int
    public static void divide3vs5(int n) {
        if (n % 3 == 0) {
            if (n % 5 == 0) {
                System.out.println(n + " chia hết cho 3 và 5");
                return;
            }
            else if (n % 5 != 0) {
                System.out.println(n + " chỉ chia hết cho 3");
            }
        }
        if (n % 5 == 0) {
            if (n % 3 == 0) {
                System.out.println(n + " chia hết cho 3 và 5");
                return;
            }
            else if (n % 3 != 0) {
                System.out.println(n + " chỉ chia hết cho 5");
            }
        }
        if (n % 3 != 0 && n % 5 != 0) {
            System.out.println(n + " không chia hết cho 3 và 5");
        }
    }
    
    //Sum of Array
    public static int SumOfArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    //Tổng phần tử chia hết cho 3 và 5
    public static int SumOfDivide3vs5(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
    //Tổng phần tử chia hết cho 3
    public static int SumOfDivide3(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
    //Tổng phần tử chia hết cho 5
    public static int SumOfDivide5(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
    
    //Tổng phần tử không chia hết cho 3 và 5
    public static int SumOfNotDivide3vs5(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 != 0 && arr[i] % 5 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
     //VỚI SỐ THỰC DOUBLE
    public static void divide3vs5(double n) {
        if (n % 3 == 0) {
            if (n % 5 == 0) {
                System.out.println(n + " chia hết cho 3 và 5");
                return;
            }
            else if (n % 5 != 0) {
                System.out.println(n + " chỉ chia hết cho 3");
            }
        }
        if (n % 5 == 0) {
            if (n % 3 == 0) {
                System.out.println(n + " chia hết cho 3 và 5");
                return;
            }
            else if (n % 3 != 0) {
                System.out.println(n + " chỉ chia hết cho 5");
            }
        }
        if (n % 3 != 0 && n % 5 != 0) {
            System.out.println(n + " không chia hết cho 3 và 5");
        }
    }
    
    //Sum of Array
    public static double SumOfArr(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    //Tổng phần tử chia hết cho 3 và 5
    public static double SumOfDivide3vs5(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
    //Tổng phần tử chia hết cho 3
    public static double SumOfDivide3(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
    //Tổng phần tử chia hết cho 5
    public static double SumOfDivide5(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
    
    //Tổng phần tử không chia hết cho 3 và 5
    public static double SumOfNotDivide3vs5(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 != 0 && arr[i] % 5 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
