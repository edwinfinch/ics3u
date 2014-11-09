import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author edwinfinch
 */
public class Main {
    static public void main(String imTiredOfRidingMyBikeHomeInColdWeather[]) throws InterruptedException{
        //initialize scanner, basic ints, string array
        Scanner scanner = new Scanner(System.in);
        int choice = 0, amountOfStudents = 0;
        ArrayList <String> students = new ArrayList();
        //while the choice is not 5 (exit), run
        while(choice != 5){
            //Print options
            System.out.println(
              "Select an option:\n"
            + "1. Create/edit class list\n"
            + "2. Print class list\n"
            + "3. Search for student\n"
            + "4. Sort list (alphabetical)\n"
            + "5. Exit program.");
            //Try to get the number of input
            try{
                String input = scanner.next();
                choice = Integer.parseInt(input);
            }
            catch(Exception e){
                //otherwise throw an error if invalid
                e.printStackTrace();
                Thread.sleep(100);
                System.out.println("An error occurred.");
                //set the choice to 0 so it doesn't load the last one inputted
                choice = 0;
            }
            //if choice is valid then this will run, checks which one
            switch(choice){
                //if 1
                case 1:
                    //ask how many students and get input
                    System.out.println("How many students do you have?");
                    try{
                        String input = scanner.next();
                        amountOfStudents = Integer.parseInt(input);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                        Thread.sleep(100);
                        System.out.println("ERROR: Invalid input.");
                    }
                    //for the amount of students allow the user to enter all those
                    for(int i = 0; i < amountOfStudents; i++){
                        System.out.print("Student #" + (i+1) + ": ");
                        String input = scanner.next();
                        //add it to the input
                        students.add(input);
                    }
                    //success
                    System.out.println("Class saved!");
                    break;
                case 2:
                    //print for each student
                    for(int i = 0; i < students.size(); i++){
                        System.out.println("Student " + (i+1) + ": " + students.get(i));
                    }
                    break;
                case 3:
                    //search
                    System.out.print("Search for student: ");
                    String input = scanner.next();
                    //will return placement, if failed will be -1
                    int placement = students.indexOf(input);
                    //debug
                    //System.out.println("result " + placement);
                    //makes sure it didn't fail
                    if(placement > -1){
                        //print the result
                        System.out.println("Search returned positive!");
                        System.out.println(input + " is student #" + (placement+1));
                    }
                    else{
                        //print error
                        System.out.println("Search returned negative.");
                    }
                    break;
                case 4:
                    //sort the list
                    students.sort(null);
                    System.out.println("Sorted.");
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
                    break;
            }
        }
        //Output was 5, loop broke, nice goodbye message
        System.out.println("Goodbye!");
    }
}
