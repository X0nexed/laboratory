import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String CreateUser = input.nextLine();
        System.out.println("Enter your surname");
        String CreateSurname = input.nextLine();
        System.out.println("Enter your сity ");
        String CreateCity = input.nextLine();
        System.out.println("Full name " + CreateUser + " "+ CreateSurname  + " City " + CreateCity);
    }
}