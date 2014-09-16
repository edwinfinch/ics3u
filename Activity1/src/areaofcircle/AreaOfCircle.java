package areaofcircle;

import java.util.Scanner;
import static sun.misc.PostVMInitHook.run;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Please select an operation to run:");
        System.out.println("1. Area of circle");
        System.out.println("2. Wayne G.");
        System.out.println("3. Area of rectangle");
        System.out.println("4. Net pay");
        System.out.println("5. Carpet");
        System.out.println("6. Bill of sale");
        Scanner input = new Scanner(System.in);
        int input_value = input.nextInt();
       switch(input_value){
           case 1:
               circle_area();
               break;
           case 2:
               wayne();
               break;
           case 3:
               rectangle_area();
               break;
           case 4:
               net_pay();
               break;
           case 5:
               carpet();
               break;
           case 6:
               bill_of_sale();
               break;
       }
       System.out.println("END PROGRAM");
    }
    public static void circle_area() {
        double pi = 3.14;
        double radius = 15;
        
        double rad_squared = radius*radius;
        
        double area = rad_squared*pi;
        
        System.out.println("The area of a circle with a radius of 15cm is around " + area + "cm squared.");
    }
    public static void wayne(){
        String name = "Wayne Gretsky";
        int jersey_num = 99;
        
        System.out.println(name + "'s number is " + jersey_num);
    }
    public static void rectangle_area(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a width: ");
        double width = input.nextDouble();
        
        System.out.println("Please enter a length: ");
        double length = input.nextDouble();
        
        double area = length*width;
        
        System.out.println("Your rectangle has a width of " + width + " and a height of " + length + ". The area of that"
                + " rectangle is " + area);
    }
    //this one was 2easy4any1
    public static void net_pay(){
        double n, h = 40, w = 5, i = 2, t = 0.22;
        n = (h*w-i)-t*(h*w-i);
        
        System.out.println("The net pay of the employee, Mr. Silly Goose, is " + n);
    }
    public static void carpet(){
        double carpet_l = 8.5, carpet_w = 6;
        double carpet_area = carpet_l*carpet_w;
        double carpet_cost = 19.95;
        double cost = carpet_area/carpet_cost;
        
        System.out.println("The cost of the carpet is " + cost + " (the carpet is " + carpet_area + " square meters)");
    }
    public static void bill_of_sale(){
        Scanner input = new Scanner(System.in);
        double tax = 0.13;
        
        System.out.println("Enter purchase price:");
        double purchase_price = input.nextDouble();
        
        System.out.println("Enter the amount paid in:");
        double paid_in = input.nextDouble(); 
        
        double before_change = (purchase_price*tax)+(purchase_price);
        
        double change = paid_in-before_change;
        
        if(change > 0){
            System.out.println("The item was bought for $" + purchase_price +
                    " and was paid with $" + paid_in + ". After taxes, the price was $" + before_change +
                    " and you got $" + change + " back.");
        }
        else{
            System.out.println("Invalid amounts. You have negative change. Program running again...");
            bill_of_sale();
        }
    }
}
