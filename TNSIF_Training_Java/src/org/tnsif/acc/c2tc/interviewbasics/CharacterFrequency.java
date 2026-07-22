package org.tnsif.acc.c2tc.interviewbasics;

import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        boolean[] visited = new boolean[ch.length];

        System.out.println("Character Frequencies:");

        for (int i = 0; i < ch.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(ch[i] + " = " + count);
        }

        sc.close();
    }
}