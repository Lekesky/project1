package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("""
                    (1) Add a task.
                    (2) Remove a task.
                    (3) Update a task.
                    (4) List all tasks.
                    (0) Exit.
                    """);

        Scanner input = new Scanner(System.in);
        System.out.println("Select an Action ");
        int action = input.nextInt();

        ArrayList<String> list = new ArrayList();

        if(action == 1){
//            list.add(item);
        }else if(action == 2){
            System.out.println(list);
        } else if(action == 3) {


        }else if(action == 4){

        }else if(action == 0){
            System.out.println("Good bye");
        }
    }


}
