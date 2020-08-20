package SpecialQuestions;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        isPrime(45);

    }
    public static int isPrime(int number){
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
        return number;



    }
}
