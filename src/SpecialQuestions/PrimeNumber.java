package SpecialQuestions;
/*
Write a program is given number prime or not...
 */
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        boolean prime = true;

        for(int i = 1; i < number; i++){

            int k =2;
            while(k < number /2){
                if(number % k == 0){
                    prime = false;
                    break;
                }
                k++;
            }


        }
        if(prime){
            System.out.println(number+" is a prime");

        }else{
            System.out.println(number+" is not prime");
        }


    }
}
