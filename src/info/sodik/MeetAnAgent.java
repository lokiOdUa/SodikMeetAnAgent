package info.sodik;

import java.util.Scanner;

public class MeetAnAgent {
    final static int password = 133976;

    public static void checkPassword() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your password: ");
        int input = in.nextInt();
        if ( input == password) {
            System.out.println("Hello, Agent");
        }
        else {
            System.out.println("Access denied");
        }
    }
}
