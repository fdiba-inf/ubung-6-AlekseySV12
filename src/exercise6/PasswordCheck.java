package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        boolean c=false;
        while (!c) {
            Scanner input = new Scanner(System.in);
            String password = input.nextLine();
            char[] array = password.toCharArray();
            boolean a = false;
            boolean b = false;
            int count = 0;
            for (int i = 0; i < password.length(); i++)
            {
                a = (Character.isLetterOrDigit(array[i]));
                if (b = (Character.isDigit(array[i]))) {
                    count++;
                }
            }

            if (password.length() >= 8 && a && count >= 2) {
                System.out.println("Password valid!");
                c=true;

            }
        }
    }
}