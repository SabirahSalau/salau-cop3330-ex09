/*
 *  UCF COP3330 Summer 2021 Assignment 9 Solution
 *  Copyright 2021 Sabirah Salau
 */

package org.example;
import java.util.Scanner;

public class Problem9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the ceiling?");
        double length = input.nextInt();

        System.out.println("What is the width of the ceiling?");
        double width = input.nextInt();

        double totalSQFeet = length * width;
        double gallon = 350;
        double paint = totalSQFeet / gallon;
        double paintNeeded = Math.ceil(paint);

        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.", Math.round(paintNeeded), Math.round(totalSQFeet));


    }
}
