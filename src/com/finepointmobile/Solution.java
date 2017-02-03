package com.finepointmobile;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int original = scanner.nextInt();

        String base2 = Integer.toString(original, 2);

        int highest = 0;
        int currentStreak = 0;

        for (int i = 0; i < base2.length(); i++) {
//            System.out.println(base2.charAt(i));

            if (String.valueOf(base2.charAt(i)).equals("1")) {
                currentStreak++;
                if (currentStreak > highest) {
                    highest = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }
        System.out.println(highest);
    }
}
