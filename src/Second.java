// Являются ли строки вращением друг друга?(Вхождение в обратном порядке).
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите первую строку :");
        String str1 = cs.nextLine();
        System.out.println("Введите вторую строку :");
        StringBuilder str2 = new StringBuilder(cs.nextLine());
        System.out.println(str1.equals(str2.reverse().toString()));


    }
}