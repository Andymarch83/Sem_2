//Содержит ли строка всебе другую стоку?
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите первую строку :");
        String str1 = cs.nextLine();
        System.out.println("Введите вторую строку :");
        String str2 = cs.nextLine();

        if (str1.contains(str2))
            System.out.println("Содержит!");
        else
            System.out.println("Не содержит!");

    }
}