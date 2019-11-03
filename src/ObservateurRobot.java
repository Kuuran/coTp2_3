import java.util.Observable;
import java.util.Observer;

public class ObservateurRobot extends ObservateurItem  {

    protected ObservateurRobot() {
        super();
    }

    public void update(Observable o, Object ignore) {
        Item i = (Item)o;
        System.out.println("Le Robot " + i.id() + " a ete modifie.");
    }
}
