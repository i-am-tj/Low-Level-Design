package Basics.Cloneable.v3;

public class Player implements Cloneable {
    private String username;
    private String password;

    public Player(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void display() {
        System.out.println(" Player - Username: " + this.username + " Password: " + this.password);
    }
}
