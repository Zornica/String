package com.example.introductionjava.string;

import java.util.Scanner;

/**
 * This program is generating a random string.
 * The program uses another method called "randomValue" which is located in "StringGenerator" class
 * This program uses one variable for the length of the string.
 */
public class Demo {

  public static void main(String[] args) {
    int b = 0;
    Scanner sc = new Scanner(System.in);  //definirame klasa scnner
    System.out.println("Molq vyvedete chislata za dyljinata na string-a:");//izwejdame poqsneniq za potrebitelq
    b = sc.nextInt();
    StringGenerator stringGenerator=new StringGenerator();
    System.out.println(" Random generiraniq string e : " + stringGenerator.randomValue(b));// izpiswame otgovora,izpolzvaiki metoda definiran po-gore

  }
}
//vhygjughjkibhki
