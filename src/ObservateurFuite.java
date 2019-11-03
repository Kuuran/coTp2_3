import java.util.Observable;

public class ObservateurFuite extends ObservateurItem {

    public ObservateurFuite() {
        super();
    }

    @Override
    public void add(Item i) {
        sesItems.put(i, i.masse());
    }

    public void update(Observable o, Object ignore) {
        Item i = (Item)o;
        if(!(i.masse() == (double) sesItems.get(i))){
            System.out.println("\nLa masse du Sac " + i.id() + " est passee de " + (double)sesItems.get(i) + " a " + i.masse() + ".");
            sesItems.replace(i, i.masse());
        }
    }
}
