package com.company;

import java.util.Scanner;

public class Main {

   //Ændring 1



    public static void main(String[] args) {

       //Her skriver vi ud til konsollen
       System.out.println("Skriv et tal"+(2<=3));

      //wetwtw


       //
       Scanner input = new Scanner(System.in);
       int a = input.nextInt();

       System.out.println("Skriv et tal");
       int b = input.nextInt();
        //float f = input.nextFloat();
       String username = input.nextLine();
       username = input.nextLine();

       String password = "idfj29nc98ryn2y";

       System.out.println("Hej "+ (a == b));
       System.out.println("Hej "+ (password.equals(username)));



       //Er to strenge ens? password.equals(username)
       input.close();

    }
}
