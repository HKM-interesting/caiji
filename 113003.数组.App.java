package pac;

import java.util.Scanner;

public class App implements Bpp,R{
    public static void main(String[] args) {
        int array2d[][]=new int[10][10];
        Scanner scanner =new Scanner(System.in);
        int row=scanner.nextInt();
        int column=scanner.nextInt();
        int value=scanner.nextInt();
        array2d[row][column]=value;
        for (int rowrow = 0; rowrow < array2d.length;rowrow++) {
            for (int columnnnnnn =0; columnnnnnn < array2d.length; columnnnnnn++)
                System.out.print(array2d[rowrow][columnnnnnn] + "");

        }
        System.out.println();
        }
    }
