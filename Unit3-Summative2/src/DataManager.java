import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class DataManager {
    private FileWriter fileWriter;
    private FileReader fileReader;
    private PrintWriter printWriter;
    private BufferedReader bufferedReader;
    String file;
    public DataManager(String fileName){
        file = fileName;
    }
    public void setupReader(){
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void setupWriter(){
        try{
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void writeStats(Stats stats){
        if(stats == null){
            stats = new Stats();
        }
        printWriter.println("g:" + stats.totalGuesses);
        printWriter.println("win:" + stats.totalWins);
        printWriter.println("l:" + stats.totalLoses);
        printWriter.println("whi:" + stats.totalWhite);
        printWriter.println("b:" + stats.totalBlack);
        printWriter.close();
    }

    public Stats getStats(){
        Stats stats = new Stats();
        //totalGuesses, totalWins, totalLoses, totalWhite, totalBlack;
        try{
            String line;
            while((line = bufferedReader.readLine()) != null){
                if(line.contains("g:")){
                    stats.totalGuesses = Integer.parseInt(line.substring(2));
                }
                else if(line.contains("win:")){
                    stats.totalWins = Integer.parseInt(line.substring(4));
                }
                else if(line.contains("l:")){
                    stats.totalLoses = Integer.parseInt(line.substring(2));
                }
                else if(line.contains("whi:")){
                    stats.totalWhite = Integer.parseInt(line.substring(4));
                }
                else if(line.contains("b:")){
                    stats.totalBlack = Integer.parseInt(line.substring(2));
                }
            }
            bufferedReader.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        this.setupWriter();
        this.writeStats(stats);
        return stats;
    }
    public void writeSettings(Settings settings){
        if(settings == null){
            settings = new Settings();
        }
        try{
            printWriter.println("c:" + settings.amountOfColours);
            printWriter.println("g:" + settings.amountOfGuesses);
            printWriter.println("p:" + settings.definePegs);
            
            printWriter.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public Settings getSettings(){
        Settings settings = new Settings();
        try{
            String line;
            while((line = bufferedReader.readLine()) != null){
                if(line.contains("c:")){
                    settings.amountOfColours = Integer.parseInt(line.substring(2));
                }
                else if(line.contains("g:")){
                    settings.amountOfGuesses = Integer.parseInt(line.substring(2));
                }
                else if(line.contains("p:")){
                    settings.definePegs = Integer.parseInt(line.substring(2));
                }
                //System.out.println(line);
            }
            bufferedReader.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return settings;
    }
}
