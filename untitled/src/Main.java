import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // question 1# : find if the number is prime or not
        // hi I am Zain
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean isPrime = false;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n%i == 0){
                isPrime = true;
                break;
            }
        }
        if(isPrime)
            System.out.println("The number you enter it was prime");
        else
            System.out.println("The number you enter it wasn't prime");

        // question 2# : find if the number is binary or not
        //hi I am PenguinZain

    }
}