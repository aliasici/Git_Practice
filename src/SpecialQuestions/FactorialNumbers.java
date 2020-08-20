package SpecialQuestions;
/*
Write a return method that returns the factorial number of any given number

Ex:
Input: 5

outPut: 120

Screen Shot 2020-03-01 at 5.02.47 PM.png
 */

public class FactorialNumbers {
    public static void main(String[] args) {

        System.out.println(factorial(5));

    }
    public static int factorial(int number){
        int result = 1;

        for(int i =1; i <= number; i++){
            result = result * i;
        }
        return result;
    }
}
