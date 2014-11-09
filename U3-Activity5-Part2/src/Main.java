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
    static public void main(String hello[]) throws InterruptedException{
        System.out.println(hello);
        //set up the array for each number
        int[] numArray = new int[11];
        int[] numArrayAll = new int[51];
        int amountOfData = 0, greatestNumber = 0, lowestNumber = 50;
        int averageNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pieces of data do you have?");
        //get the input
        try{
            String input = scanner.next();
            amountOfData = Integer.parseInt(input);
        }
        catch(Exception e){
            e.printStackTrace();
            Thread.sleep(100);
            System.out.println("An error occurred. Restarting program.");
            main(null);
            return;
        }
        System.out.println("Enter your data individually below (integers 1-50, please)");
        for(int i = 0; i < amountOfData; i++){
            int input = 0;
            try{
                input = Integer.parseInt(scanner.next());
            }
            catch(Exception e){
                e.printStackTrace();
                Thread.sleep(100);
                System.out.println("An error occurred. Restarting program.");
                main(null);
                return;
            }
            numArray[input/5]++;
            numArrayAll[input]++;
            if(input > greatestNumber){
                greatestNumber = input;
            }
            if(input < lowestNumber){
                lowestNumber = input;
            }
            averageNumber += input;
        }
        averageNumber = averageNumber/amountOfData;
        for(int i = 1; i < 11; i++){
            if(i < 1){
                System.out.println((i*5-6) + "-" + (i*5) + ": " + numArray[i]);
            }
            else{
                System.out.println((i*5-5) + "-" + (i*5) + ": " + numArray[i]);
            }
        }
        int mode = 0;
        for(int i = 0; i < 51; i++){
            if(numArrayAll[i] > mode){
                mode = i;
            }
        }
        System.out.println("The mode is: " + mode);
        System.out.println("The greatest number is: " + greatestNumber);
        System.out.println("The lowest number is: " + lowestNumber);
        System.out.println("The average number is: " + averageNumber);
        System.out.println("The numbers range from " + lowestNumber + " to " + greatestNumber);
    }
}