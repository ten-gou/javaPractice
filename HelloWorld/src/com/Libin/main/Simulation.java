package com.Libin.main;

import java.util.Scanner;

import com.Libin.exceptions.EvenNumberException;

public class Simulation {
    public static void main(String[] args){
        try {
            getInput();
        } catch (EvenNumberException e) {
            e.printStackTrace();
        }
    }

    public static void getInput() throws EvenNumberException{
        Scanner in = new Scanner(System.in);

        System.out.println("Type in a number and press Enter...");
        String line = in.nextLine();
        System.out.println("You've typed: " + line);

        if (isEven(line)) {
            try{
                throw new EvenNumberException();
            }finally {
                in.close();
            }
        }

        //close resources
        in.close();
    }

    public static boolean isEven(String num) {
        //convert value to a number
        int value = Integer.parseInt(num);

        return (value % 2 == 0);
    }
}
