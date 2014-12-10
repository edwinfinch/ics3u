
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author edwinfinch
 */
public class ClassData {
    ArrayList classList;
    ClassData(ArrayList<Integer> list){
        classList = list;
    }
    public double getAverage(){
        double median = 0;
        for(int i = 0; i < classList.size(); i++){
            median += Double.parseDouble(classList.get(i)+ "");
        }
        median = median/classList.size();
        return median;
    }
    
    public int getHighest(){
        return (int)classList.get(classList.size()-1);
    }
    
    public int getLowest(){
        return (int)classList.get(0);
    }
    
    public int getRange(){
        int range = getHighest()-getLowest();
        return range;
    }
    
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
        }
        return amount;
    }
}
