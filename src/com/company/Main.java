package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        String variables[] = new String[10];
        int possibleLength = 0;


        Scanner userInput = new Scanner (System.in);
        System.out.print("Enter a boolean expression (i.e. a&&b");
        String userExpression = userInput.nextLine().trim();

        userInput.useDelimiter("&&");
        for(int j = 0; userInput.hasNext(); j++){
            variables[j] = userInput.next();
            possibleLength++;
        }
        int possibilities[] = new int[(int)Math.pow(2, possibleLength)];



    }
}