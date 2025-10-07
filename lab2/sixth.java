import  java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = input.nextInt();
        int square = number1*number1;
        int cube = number1*number1*number1;
        long average = (cube + square) / 2;
        System.out.println("The average is " + average);
    }
}
