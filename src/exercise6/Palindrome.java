package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("eine Zahl eingeben: ");
        int zahl = input.nextInt();
        int x = zahl;
        int y=x;
        int count = 1;
        assert zahl > 0 : "Fehler";
        while ((zahl / 10) != 0) {
            count++;
            zahl /= 10;
        }
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = x % 10;
            x /= 10;
        }
        int result = 0;
        for (int temp = 0; temp < array.length; temp++) {
            result *= 10;
            result += array[temp];
        }
        if (result == y) {
            System.out.println("Palindrome: true");
        } else {
            System.out.println("Palindrome: false");
        }
    }
}
