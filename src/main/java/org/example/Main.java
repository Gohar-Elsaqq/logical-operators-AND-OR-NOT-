package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // && =(and) conditions must be true
//        int temp=25;
//        if (temp >30){
//            System.out.println("It is hot outside");
//
//        } else if (temp>=20 && temp <=30){
//            System.out.println("It is warm outside");
//        }else {
//            System.out.println("It Is cold outside");
//        }
//    }

        // || =(OR) conditions must be true

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("You are playing a game ! Press q or Q to quit");
//        String respons =scanner.next();
//        if (respons.equals("q") || respons.equals("Q")){
//            System.out.println("You quit the game");
//        }else {
//            System.out.println("You are still playing the game *pew pew*");
//        }
//    }

        // ! =(NOT) reveres boolean value of conditions
        Scanner scanner=new Scanner(System.in);
        System.out.println("You are playing a game ! Press q or Q to quit");
        String respons =scanner.next();
        if (!respons.equals("q") && !respons.equals("Q")){
            System.out.println("You are still playing the game *pew pew*");

        }else {
            System.out.println("You quit the game");
        }

    }
}