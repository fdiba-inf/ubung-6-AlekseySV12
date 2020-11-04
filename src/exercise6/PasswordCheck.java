package exercise6;

import java.util.Scanner;
import java.lang.Character; 
import java.util.Arrays;

public class PasswordCheck {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        boolean lngth;
        boolean cnt;
        boolean a=false;

        while(!a)
        {
        System.out.println("Enter a password: ");
        String password = input.next();
        int passwordLength = password.length();

            if (passwordLength < 8) {
                lngth=false;}
            else  {lngth = true;}

            char[] ch = password.toCharArray();
            int counter1 = 0;
            int counter2 = 0;
            for (int i = 0; i < ch.length; i++) {
                if (!Character.isLetterOrDigit(ch[i])) {
                    counter1++;
                }
            }
            for (int i = 0; i < ch.length; i++) {
                if (Character.isDigit(ch[i])) {
                    counter2++;
                }
            }

            if (counter1 > 1 || counter2 < 2) {
                cnt = false;
            } else {
                cnt = true;
            }


            if (cnt && lngth) {
                System.out.println("Password valid!");
                a=true;
            }}
        }

    }
