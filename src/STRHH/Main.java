package STRHH;

/**
 * Created by geniushkg on 26-12-16.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        scan.nextLine();
        String[] inputStringArray = new String[testCase];
        for (int x = 0; x < testCase; x++) {
            String input = scan.nextLine();
            input = input.replaceAll("\\s+", "");
            inputStringArray[x]=input;
            System.out.println("#-"+x);
        }
        for(int y=0;y<testCase;y++){
            String text = inputStringArray[y];
            char[] inputArray = text.toCharArray();
            int len = inputArray.length/2;
            for(int z=0;z<len;z=z+2){
                System.out.print(inputArray[z]);
            }
            System.out.println("");
        }

    }
}