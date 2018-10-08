package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter firstInitial");
        String firstinitial=Keyboard.nextLine();
        System.out.println("Enter LastName");
        String LastName=Keyboard.nextLine();
        System.out.println("Enter houseNumber");
        String houseNumber=Keyboard.nextLine();
        System.out.println("Enter streetname");
        String streetname=Keyboard.nextLine();
        System.out.println("Enter streetType");
        String streetType=Keyboard.nextLine();
        System.out.println("Enter city");
        String city=Keyboard.nextLine();

        System.out.print(firstinitial + " " + LastName + " " + houseNumber + " ");
        System.out.println(streetname + " " + streetType + " " + city);

    }
}
