package Basics.Serializable.v4;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CricketPlayer extends Player {
    private transient int iccRanking; //opting out from being serialised

    public CricketPlayer(String username, String password, int iccRanking) {
        super(username, password);
        this.iccRanking = iccRanking;
    }

    //On the other hand this class can also explicitly implement writeObject and readObject to opt out from it
    private void writeObject(ObjectOutputStream out) throws IOException {
        throw new NotSerializableException("This class should not be serialized");
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        throw new NotSerializableException("This class should not be serialized");
    }

    public void display() {
        System.out.println(" Player - Username: " + super.getUsername() + " Password: " + super.getPassword() + " E-Sports Ranking: " + this.iccRanking);
    }

}
