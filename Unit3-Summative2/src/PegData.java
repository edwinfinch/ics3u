public class PegData {
    public int amountOfWhites, amountOfBlacks;
    public String[][] pegs;
    public String errorMessage;
    public int[][] locations;
    public String guess;
    private String[] colours = {
        "red", "green", "blue", "orange", "yellow", "black", "white"
    };
    public String[] coloursInput;
    public PegData(){
        amountOfWhites = 0;
        amountOfBlacks = 0;
        pegs = new String[2][10];
        locations = new int[2][20];
        errorMessage = "No error";
    }
    public void setString(boolean isBlack, int location, String string){
        if(isBlack){
            pegs[0][location] = string;
        }
        else{
            pegs[1][location] = string;
        }
    }
    private boolean isInBlack(String string){
        boolean returnValue = false;
        for(int i = 0; i < this.amountOfBlacks; i++){
            System.out.println("String: " + string + " pegs string: " + this.pegs[1][i] + " i: " + i);
            if(this.pegs[1][i].equals(string)){
                returnValue = true;
            }
        }
        return returnValue;
    }
    public String getBlacks(PegData data, String[] guess){
        String toReturn = " Blacks: ";
        for(int i = 0; i < this.amountOfBlacks; i++){
            toReturn += guess[this.locations[1][i]] + ", ";
        }
        if(toReturn.equals(" Blacks: ")){
            toReturn = "";
        }
        else{
            toReturn = toReturn.substring(0, toReturn.length()-2);
            toReturn += ".";
        }
        return toReturn;
    }
    public String getWhites(PegData data, String[] guess){
        String toReturn = "Whites: ";
        for(int i = 0; i < data.amountOfWhites; i++){
            if(!isInBlack(guess[data.locations[0][i]])){
                toReturn += guess[data.locations[0][i]] + ", ";
            }
        }
        if(toReturn.equals("Whites: ")){
            toReturn = "";
        }
        else{
            toReturn = toReturn.substring(0, toReturn.length()-2);
            toReturn += ".";
        }
        return toReturn;
    }
    public String getPegsString(String[] guess){
        String toReturn = getWhites(this, guess);
        toReturn += getBlacks(this, guess);
        
        return toReturn;
    }
}
