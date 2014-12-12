class Stats {
    public int totalGuesses, totalWins, totalLoses, totalWhite, totalBlack;
    public Stats(){
        totalGuesses = 0;
        totalWins = 0;
        totalLoses = 0;
        totalWhite = 0;
        totalBlack = 0;
    }
    public Stats addStats(Stats stats){
        Stats finalStats = this;
        finalStats.totalBlack += stats.totalBlack;
        finalStats.totalWhite += stats.totalWhite;
        finalStats.totalLoses += stats.totalLoses;
        finalStats.totalWins += stats.totalWins;
        finalStats.totalGuesses += stats.totalGuesses;
        
        return finalStats;
    }
}
