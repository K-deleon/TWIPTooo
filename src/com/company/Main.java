package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        String variables[] = new String[10];
        int possibleLength = 0;


        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter a boolean expression (i.e. a&&b)");
        String userExpression = userInput.nextLine();

        Scanner findVariables = new Scanner(userExpression);

        findVariables.useDelimiter("&&");
        for(int j = 0; findVariables.hasNext(); j++){
            variables[j] = findVariables.next();
            possibleLength++;
        }
        int possibilities[] = new int[(int)Math.pow(2, possibleLength)];
        String resizeVariables[] = new String[possibleLength];

        //System.out.println(variables.length);
        System.out.println("Amount of variables: " + resizeVariables.length);
        System.out.println("Length of Truth Table: " + possibilities.length);


        for (int i=0;i<possibilities.length;i++){
            int mask = possibilities.length-1;
            while (mask > 0){
                if ((mask & i) == 0){
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
                mask = mask >> 1;
            }
            System.out.println();
        }


    }
}
