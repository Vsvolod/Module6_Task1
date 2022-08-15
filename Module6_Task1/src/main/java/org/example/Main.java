package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String letters = in.nextLine();
        int spaseIndex = in.nextInt();




        System.out.println("Your letters are: " + splitInParts(letters, spaseIndex));
    }


    public static String splitInParts(String letters, int spaseIndex) {
        StringBuilder splitWordsLikeInTasks = new StringBuilder(letters);

        for (int i=spaseIndex; i<splitWordsLikeInTasks.length(); i=i+spaseIndex+1){
            splitWordsLikeInTasks.insert(i , " ");}

        return String.valueOf(splitWordsLikeInTasks);
    }
}


