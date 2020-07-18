import java.util.Scanner;

public class DemoClass {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("enter name:");
        String name = object.nextLine();
        System.out.println("Enter your age:");
        byte age = object.nextByte();
        System.out.println("Enter a 4 digit code:");
        short code = object.nextShort();
        System.out.println("enter your Cpi:");
        double cpi = object.nextDouble();
        System.out.println("Enter your mobile number");
        long mobileNumber = object.nextLong();
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("code:" + code);
        System.out.println("cpi:" + cpi);
        System.out.println("Mobile number:" + mobileNumber);

    }
}
