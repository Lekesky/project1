// Leke Obayemi
// 2/6/22
//Project 1
package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int action;  // Initialize action variable 
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();     // Create the ArrayList
        

        System.out.println("""
                        Please choose an option:

                        (1) Add a task.
                        (2) Remove a task.
                        (3) Update a task.
                        (4) List all tasks.
                        (0) Exit.
                        """);

            
        System.out.println("Select an Action ");
        int action1 = input.nextInt();
        action = action1;                           //Initially prompt user with options before entering the while loop

        while(action != 0 ){
            if(action == 1){        //Adds task
                System.out.println("What task would you like to add?");
                input.nextLine();
                String itemAdd = input.nextLine();
                list.add(itemAdd);
                System.out.println("List has been updated!");

            }else if(action == 2){      //Removes task
                System.out.println("List: " + list);
                System.out.println("What task would you like to remove?");
                int itemRemove = input.nextInt();
                list.remove(itemRemove);
                System.out.println("List has been updated!");

            } else if(action == 3) {        //Updates task
                System.out.println("List: " + list);
                System.out.println("Select an element to update");
                int itemUpdateNum = input.nextInt();
                System.out.println("What task would you like to replace it with?");
                input.nextLine();
                String itemUpdate = input.nextLine();
                list.set(itemUpdateNum, itemUpdate);
                System.out.println("List has been updated!");
                
            }else if(action == 4){      //Prints all tasks in the ArrayList
                System.out.println("List: " + list);

            }else if(action == 0){
                System.out.println("Good-bye!");
                break;
            }
            System.out.println("""
                        Please choose an option:

                        (1) Add a task.
                        (2) Remove a task.
                        (3) Update a task.
                        (4) List all tasks.
                        (0) Exit.
                        """);
        
            
            System.out.println("Select an Action ");
            int action2 = input.nextInt();      //Prompts user again after completing option
            action = action2;       //Updates the action with new action
            
        }
        System.out.println("Good-bye!");        //Prints if user initially enters 0 
    }
}
