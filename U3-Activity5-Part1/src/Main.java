
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
    static public void main(String hello[]){
        //initialize array, scanner, and output initial question
        int[] numArray = new int[7];
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times do you want to roll the dice?");
        //get the input
        String input = scanner.next();
        int rolls = Integer.parseInt(input);
        //roll it that many times
        for(int i = 0; i < rolls; i++){
            int roll = (int)Math.ceil(Math.random()*6);
            System.out.println("Run: " + i + ". Output: " + roll);
            //add that number to the array count
            numArray[roll]++;
        }
        //output message finished
        System.out.println("Finished rolling. Results:");
        //tell the user how many times each die rolled
        for(int i = 1; i < 7; i++){
            System.out.println("Rolled " + i + " " + numArray[i] + " times.");
        }
    }
}
