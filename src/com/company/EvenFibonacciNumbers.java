package com.company;

public class EvenFibonacciNumbers {

//    Each new term in the Fibonacci sequence is generated by adding the previous two terms.
//    By starting with 1 and 2, the first 10 terms will be:
//            1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//    By considering the terms in the Fibonacci sequence whose values do not exceed four million,
//    find the sum of the even-valued terms.

    public static void main(String[] args) {
        int sum = 0;
        int[] fibonacci = new int[1000];
        fibonacci[0] = 1;
        fibonacci[1] = 2;
        for (int i = 2; i < 1000; i++){
            fibonacci[i] = (fibonacci[i-2] + fibonacci[i-1]);
        }
        int j = 0;
        do{
            if (fibonacci[j] % 2 == 0){
                sum += fibonacci[j];
            }
            j++;
        }while (fibonacci[j] <= 4000000);
        System.out.println("The sum of the even-valued terms is " + sum + ".");
    }
}

