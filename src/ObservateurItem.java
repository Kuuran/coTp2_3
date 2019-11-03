import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

public abstract class ObservateurItem implements Observer {

    protected HashMap<Item, Object> sesItems;

    protected ObservateurItem() {
        sesItems = new HashMap<>();
    }

    public void add(Item i) {
        sesItems.put(i, null);
    }

    public void remove(Item i) {
        sesItems.remove(i);
        i.deleteObserver(this);
    }

    public void update(Observable o, Object ignore) {
    }
}
