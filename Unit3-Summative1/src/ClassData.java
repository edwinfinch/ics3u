
import java.util.ArrayList;

/* 
ClassData
----------
This class allows for easy handing of a class and their marks,
with built in functions for every needed variable such as median,
range, and average.

All functions included return the value from the current ClassData ArrayList
and doesn't take external sources into account for most cases.
*/
public class ClassData {
    ArrayList classList;
    //Constructor that sets up the instance with a copy of the list that the user is dealing with
    ClassData(ArrayList<Integer> list){
        classList = list;
    }
    //Returns the average of all of the marks in the list (as a decimal)
    public double getAverage(){
        double median = 0;
        for(int i = 0; i < classList.size(); i++){
            median += Double.parseDouble(classList.get(i)+ "");
        }
        median = median/classList.size();
        return median;
    }
    //Returns the highest number in the list (since it is already sorted, it just returns to top)
    public int getHighest(){
        return (int)classList.get(classList.size()-1);
    }
    //Returns the highest number in the list (since it is already sorted, it just returns to bottom)
    public int getLowest(){
        return (int)classList.get(0);
    }
    //Gets the range between the highest and lowest numbers in the list. Always positive.
    public int getRange(){
        int range = getHighest()-getLowest();
        return range;
    }
    //Returns the median of the class list
    public double getMedian(){
        double median = 0;
        try{
            if(classList.size()%2 == 0){
                int num1 = (int)classList.get(classList.size()/2), num2 = (int)classList.get((classList.size()/2)+1);
                double toAdd = (num2-num1)/2;
                median = toAdd+num1;
            }
            else{
                median = Double.parseDouble((int)classList.get(classList.size()/2) + "");
            }
        }
        catch(Exception e){
            if(classList.size()%2 == 0){
                int num1 = (int)classList.get(((classList.size()/2)-1)), num2 = (int)classList.get((classList.size()/2));
                double toAdd = (num2-num1)/2;
                median = toAdd+num1;
            }
            else{
                median = Double.parseDouble((int)classList.get(classList.size()/2) + "");
            }
        }
        return median;
    }
    //Returns the amount of people at the level inputted as int level, otherwise returns -1
    public int getAmountOfLevel(int level){
        int amount = 0;
        switch(level){
            case 0:
                for(int i = 0; i < classList.size(); i++){
                    if((int)classList.get(i) < 50){
                        amount++;
                    }
                }
                break;
            case 1:
                for(int i = 0; i < classList.size(); i++){
                    int mark = (int)classList.get(i);
                    if((mark >= 50) && (mark < 60)){
                        amount++;
                    }
                }
                break;
            case 2:
                for(int i = 0; i < classList.size(); i++){
                    int mark = (int)classList.get(i);
                    if((mark >= 60) && (mark < 70)){
                        amount++;
                    }
                }
                break;
            case 3:
                for(int i = 0; i < classList.size(); i++){
                    int mark = (int)classList.get(i);
                    if((mark >= 70) && (mark < 80)){
                        amount++;
                    }
                }
                break;
            case 4:
                for(int i = 0; i < classList.size(); i++){
                    int mark = (int)classList.get(i);
                    if((mark >= 80)){
                        amount++;
                    }
                }
                break;
            default:
                amount = -1;
        }
        return amount;
    }
}
