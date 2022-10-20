import java.util.ArrayList;

public class Team<T> {
    private String teamName;
    int played = 0;
    int won    = 0;
    int lost   = 0;
    int tied   = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName(){
        return this.teamName;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(((Player)player).getName()+" is already on team");
            return false;
        }else{
            members.add(player);
            System.out.println(((Player)player).getName()+" picked for team " + this.teamName);
            return true;
        }
    }

    //getter
    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team opponent,int outScore, int theirScore){
        if(outScore > theirScore){
            won++;
        }else if (outScore == theirScore){
            tied++;
        }else{
            lost++;
        }
        played++;
        if(opponent != null){
            opponent.matchResult(null,theirScore,outScore);
        }
    }

    public int ranking(){
        return (won*2) + tied;
    }
}
