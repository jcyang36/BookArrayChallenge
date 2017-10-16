package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int maxNum=0;
	Scanner scan = new Scanner(System.in);
        //User can enter at most the maximum number of books
        System.out.println("Maximum number of books: ");

        maxNum=scan.nextInt();
        //Force scanner to see line break
        String lineBreak=scan.nextLine();
        String[] titleArray = new String[maxNum];
        String[] authorArray = new String[maxNum];
        String[] descriptionArray = new String[maxNum];
	int i=0;
String repeatSwitch ="";

    while (!repeatSwitch.equalsIgnoreCase("Quit")) {


        System.out.println("Enter the book title: ");
        titleArray[i] = scan.nextLine();
        System.out.println("Enter the author: ");
        authorArray[i] = scan.nextLine();
        System.out.println("Enter the description: ");
        descriptionArray[i] = scan.nextLine();
        i++;
        //check to make sure that i is less than length of array.
        if (i>=titleArray.length){
            break;
        }
        System.out.println("Would you like to continue? Enter any key to continue or Quit to exit");
        repeatSwitch= scan.nextLine();

    }

    int total=i;
    for(int j =0; j<total; j++){
        String bookString="";
        bookString+= "Title: "+ titleArray[j] ;
        bookString+= " \n Author: " +authorArray[j];
        bookString+= " \n Description: "+descriptionArray[j];

        System.out.println(bookString);
    }







    }
}
