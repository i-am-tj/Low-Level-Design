package Basics.Cloneable.v3;

public class CricketPlayer extends Player {
    private int iccRanking;

    public CricketPlayer(String username, String password, int iccRanking) {
        super(username, password);
        this.iccRanking = iccRanking;
    }

    // This class throws CloneNotSupportedException indicating this has opted out from getting cloned
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("This class is not cloneable");
    }

    public void display() {
        System.out.println(" Player - Username: " + super.getUsername() + " Password: " + super.getPassword() + " E-Sports Ranking: " + this.iccRanking);
    }


}
