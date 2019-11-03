import java.util.Observable;

public class ObservateurDeplacement extends ObservateurItem {

    public ObservateurDeplacement() {
        super();
    }

    @Override
    public void add(Item i) {
        sesItems.put(i, new Position(i.position().x(), i.position().y()));
    }

    public void update(Observable o, Object ignore) {
        Item i = (Item)o;
        if(!(i.position().equals(sesItems.get(i)))){
            System.out.println("L'item " + i.id() + " a change de position : " + sesItems.get(i).toString() + " -> " + i.position().toString() + ".");
            sesItems.replace(i, new Position(i.position().x(), i.position().y()));
        }
    }
}
