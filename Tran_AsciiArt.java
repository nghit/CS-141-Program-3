
/********************************
 * file: Tran_AsciiArt.java
 * author: N. Tran
 * class: CS 141 - Programing and Problem Solving
 *
 * assignment: program 3
 * date last modified: 1/31/2017
 *
 * purpose: This program reads in a file and and its characters originally, vertically, horizontally, and diagonally
 ********************************/

import java.util.Scanner;
import java.io.*;

public class Tran_AsciiArt
{
    public static void main(String[]args)throws IOException
    {
        File myFile = new File("monalisa.txt");
        Scanner scan = new Scanner(myFile);
        char[][] ascii = new char[scan.nextInt()][scan.nextInt()]; // read in the integers in the file into the array 
        
        scan.nextLine();
        
        for(int i =0; i< ascii.length;i++)
        {
            ascii[i] = scan.nextLine().toCharArray(); // read in the next characters in the file into the array
        }
        
	// print the original file 
        for(int r = 0; r < ascii.length; r++)
        {
            for(int c = 0; c < ascii[r].length; c++)
            {
                System.out.print(ascii[r][c]);
            }
            System.out.println();
        }

	System.out.println();
	
	 // print the file vertically
        for(int r = 0; r < ascii.length; r++)
        {
            for(int c = ascii[r].length-1; c > 0; c--)
            {
                System.out.print(ascii[r][c]);
            }
            System.out.println();
        }

	System.out.println();

	// print the file horizontally
        for(int r = ascii.length-1; r > 0; r--)
        {
            for(int c = 0; c < ascii[r].length; c++)
            {
                System.out.print(ascii[r][c]);
            }
            System.out.println();
        }

	System.out.println();
	
	// print the file diagonally
	for(int c = ascii[0].length-1; c >= 0; c--)
        {
            for(int r = ascii.length-1; r >= 0; r--)
            {
                System.out.print(ascii[r][c]);
            }
            System.out.println();
        }

    }
}
