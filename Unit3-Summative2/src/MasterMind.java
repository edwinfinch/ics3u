
import java.util.ArrayList;
import java.util.Random;

public class MasterMind {
    private Settings currentSettings;
    private String[] guess = new String[7];
    public Stats currentGameStats;
    private String[] colours = {
        "red", "green", "blue", "orange", "yellow", "black", "white", "brown", "purple", "pink"
    };
    public ArrayList<PegData> listData;
    public boolean gameActive = false;
    
    public MasterMind(Settings settings){
        currentSettings = settings;
        listData = new ArrayList();
        
    }
    public int getAmountOfGuesses(){
        return currentSettings.amountOfGuesses;
    }
    public int random(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    private String generateString(){
        String string = new String();
        String toAdd = colours[random(0, 9)];
        for(int i = 0; i < currentSettings.amountOfColours; i++){
            while(string.contains(toAdd)){
                toAdd = colours[random(0, 9)];
            }    
            string += toAdd + ",";
        }
        return string;
    }
    public Stats newGame(Stats stats){
        Stats tempStats = currentGameStats;
        currentGameStats = new Stats();
        guess = generateString().split(",");
        gameActive = true;
        
        return tempStats;
    }
    public Stats newGame(){
        Stats stats = new Stats();
        guess = generateString().split(",");
        
        return stats;
    }
    public PegData guess(String inputGuess){
        PegData pegs = new PegData();
        pegs.guess = inputGuess;
        String[] coloursInput; 
        inputGuess = inputGuess.replaceAll(",", " ");
        inputGuess = inputGuess.replaceAll("  ", " ");
        coloursInput = inputGuess.split(" ");
        pegs.coloursInput = coloursInput;
        try{
            for(int i = 0; i <currentSettings.amountOfColours; i++){
                for(int j = 0; j < guess.length; j++){
                    if(coloursInput[i].equals(guess[j])){
                        //System.out.println(coloursInput[i] + " equals " + guess[j] + ": white, location " + i + " + " + j);
                        pegs.pegs[1][pegs.amountOfWhites] = coloursInput[i];
                        pegs.locations[0][pegs.amountOfWhites] = j;
                        pegs.amountOfWhites++;
                    }
                }
                if(coloursInput[i].equals(guess[i])){
                    //System.out.println(coloursInput[i] + " equals " + guess[i] + ": black, location " + i + " + " + i);
                    pegs.pegs[1][pegs.amountOfBlacks] = coloursInput[i];
                    pegs.locations[1][pegs.amountOfBlacks] = i;
                    pegs.amountOfBlacks++;
                    pegs.amountOfWhites--;
                }
                //System.out.println(guess[i] + " and " + coloursInput[i]);
            }
        }
        catch(Exception e){
            pegs.errorMessage = e.getMessage();
        }
        //System.out.println(pegs[0] + " white, " + pegs[1] + " blacks");
        currentGameStats.totalGuesses++;
        if(pegs.amountOfBlacks == currentSettings.amountOfColours){
            pegs.amountOfBlacks = 1337;
        }
        else if(currentGameStats.totalGuesses >= currentSettings.amountOfGuesses){
            pegs.amountOfBlacks = -1337;
        }
        listData.add(pegs);
        return pegs;
    }
    public String getString(int[] pegs){
        String string = "Access denied";
        if(Math.abs(pegs[1]) == 1337){
            string = "";
            for(int i = 0; i < guess.length; i++){
                string += guess[i] + ", ";
            }
            string = string.substring(0, string.length()-2);
        }
        return string;
    }
    public String[] getGuess(){
        return guess;
    }
    public String coloursToString(){
        String string = "";
        
        for(int i = 0; i < 10; i++){
            string += colours[i] + ", ";
        }
        string = string.substring(0, string.length()-2);
        
        return string;
    }
}
