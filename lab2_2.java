import java.util.Scanner;
import java.util.regex.*;


public class lab2_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");

        while (true) {
            if (scanner.hasNextLine()){
                String password = scanner.nextLine();
                String pattern = "((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[0-9a-zA-Z_]{8,})";
                Pattern p = Pattern.compile(pattern);
                Matcher match = p.matcher(password);
                if (match.matches()) {
                    System.out.println("Пароль надёжный");
                    System.exit(0);
                }
                else {

                    System.out.println("Пароль ненадёжный");


                }
            }
            else {

                System.out.println("Введите пароль");
                scanner.nextLine();

            }

        }


    }
}