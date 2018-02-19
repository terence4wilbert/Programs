public final class Team{
    private final String teamName;
    private final List<String> playerName;

    // Constructor to perform copys
    public Team(final String name, final List<String> players){
        teamName = name;
        playerNames = players;
    }

    // public void setTeamName(final String name){
    //     teamName = name;
    // }
    public String getTeamName(){
        return teamName;
    }
    // public void setPlayersName(final List<String> names) {
    //     playerNames = names;
    // }

    public List<String> getPlayerNames() {
        return playerNames;
    }
}