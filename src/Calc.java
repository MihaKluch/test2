import java.util.Scanner;

public class Calc {

    static String userInput;
    public static void main(String[] args) {

        System.out.println("Введите выражение: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(Parser.userOtput(userInput));
        System.out.println(Parser.userOtput(userInput));
        System.out.println(Parser.userOtput(userInput));
        System.out.println(Parser.userOtput(userInput));
        System.out.println(Parser.userOtput(userInput));
        System.out.println(Parser.userOtput(userInput));
        System.out.println(Parser.userOtput(userInput));
        System.out.println(Parser.userOtput(userInput));
        System.out.println(Parser.userOtput(userInput));
    }


}
