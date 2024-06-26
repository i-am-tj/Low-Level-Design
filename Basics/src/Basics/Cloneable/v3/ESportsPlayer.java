package Basics.Cloneable.v3;

public class ESportsPlayer extends Player {
    private int ranking;
    public ESportsPlayer(String username, String password, int ranking) {
        super(username, password);
        this.ranking = ranking;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("E-Sports Player - Username: " + super.getUsername() + " Password: " + super.getPassword() + " E-Sports Ranking: " + this.ranking);
    }
}
