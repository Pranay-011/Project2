
import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String str = sc.nextLine();
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        System.out.print("input-->");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(i);
        }
        System.out.println();
        System.out.print("char--->");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(ch[i]);
        }


        sc.close();
    }
}