package CPTTRN1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hardik on 10/02/17.
 * @noinspection ALL
 */
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner scan = new Scanner(System.in);
        int numOfTestCase = scan.nextInt();
        List<Integer> lines = new ArrayList<Integer>();
        List<Integer> columns = new ArrayList<Integer>();
        for (int i=0;i<numOfTestCase;i++){
            int numOfLines = scan.nextInt();
            int numOfCols = scan.nextInt();
            lines.add(numOfLines);
            columns.add(numOfCols);

        }

        for(int x=0;x<numOfTestCase;x++){
            int lineNumber = lines.get(x);
            int columnNumber = columns.get(x);
            for(int y=0;y<lineNumber;y++){
                for (int z=0;z<columnNumber;z++){
                    if (z%2 == 0 || z == 0){
                        System.out.print("*");
                    }else{
                        System.out.print(".");
                    }
                }
            }
        }


    }
}