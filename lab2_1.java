import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab2_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату: ");
        String date = in.nextLine();
        String pattern = "([0-9][0-9]|3[0-1])/(0[1-9]|1[0-2])/[0-2][0-9][0-9][0-9]";
        String pattern1 = "(29|[3-9][0-9])/02/[0-2][0-9][0-9][0-9]";
        Pattern p1 = Pattern.compile(pattern1);
        Pattern p = Pattern.compile(pattern);
        Matcher match = p.matcher(date);
        Matcher match1 = p1.matcher(date);
        if (!(match.matches())) {
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
            System.exit(0);
        }
        if (match.matches()) {
        } if(match1.matches() == false) {
                System.out.println("Данные корректны");
            } else {
            System.out.println("Данные некорректны");
        }

    }
}