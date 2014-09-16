package activity3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a bill amount.");
        
        double amount = input.nextDouble();
        double hst = 0.13;
        double total = (hst*amount)+(amount);
        
        System.out.println("Your bill will be " + total + ". Do you want to add tips? (yes/no)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        if(line.equals("yes")){
            System.out.println("How much? (type 0.15 if you want to do 15%)");
            double tip = input.nextDouble();
            
            if(tip == 0.15){
                tip = (amount*0.15);
            }
            total += tip;
            System.out.println("With the tip your bill is: " + total);
        }
        else{
            System.out.println("Well that's not very Canadian of you! Sorry for shouting. Have a good day.");
        }
    }
}
