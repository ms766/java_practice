public class Main {
    public static void main(String[] args) {
        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer bill  = new SoccerPlayer("Bill");

        Team<FootBallPlayer> crows = new Team<>("Crows");
        crows.addPlayer(joe);
        Team<BaseBallPlayer> jacks = new Team<>("Jacks");
        jacks.addPlayer(pat);
        Team<SoccerPlayer> rams = new Team<>("Rams");
        rams.addPlayer(bill);

//        System.out.println(crows.numPlayers());

    }
}