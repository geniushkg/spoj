package STRHH;

/**
 * Created by geniushkg on 26-12-16.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        for (int x = 0; x < testCase; x++) {
            String input = scan.nextLine();
            input = input.replaceAll("\\s+", "");
            char[] inputArray = input.toCharArray();
            int len = inputArray.length / 2;
            for (int y = 0; y < len; y = y + 2) {
                System.out.println(inputArray[y]);
            }
            System.out.println("");
        }

    }
}