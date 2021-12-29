package com.bridgelabz.linecomparisonproblem;

import java.util.Scanner;

public class LineComparison {

    //Method to Calculate Length of Line
    public double getLengthOfLine(int x1,int y1,int x2,int y2) {
        double lengthLine = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        return lengthLine;
    }

    public static void main(String[] args) {
        //Scanner class object for user input
        Scanner sc = new Scanner(System.in);

        //Welcome Message for Initial Purpose
        System.out.println("Welcome to Line Comparison Problem Developed by Tahir Mansuri.");

        System.out.println("Enter the Value for X1:");
        int x1 = sc.nextInt();

        System.out.println("Enter the Value for Y1:");
        int y1 = sc.nextInt();

        System.out.println("Enter the Value for X2:");
        int x2 = sc.nextInt();

        System.out.println("Enter the Value for Y2:");
        int y2 = sc.nextInt();

        //Object of LineComaprison Class for Calculating Length of Lines
        LineComparison LC = new LineComparison();
        System.out.println("Length of Lines : "+LC.getLengthOfLine(x1,y1,x2,y2));
    }
}
