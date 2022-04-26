package com.company;
import java.util.Scanner;
public class TortEki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int san = scanner.nextInt();
        for (int i = 0; i < san; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
        }

        }
    }

