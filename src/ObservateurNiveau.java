import java.util.Observable;

public class ObservateurNiveau extends ObservateurItem {

    public ObservateurNiveau() {
        super();
    }

    @Override
    public void add(Item i){
        sesItems.put(i, i.niveau());
    }

    @Override
    public void update(Observable o, Object ignore) {
        Item i = (Item)o;
        if(i.niveau() == 1 && (int)sesItems.get(i) == 0){
            System.out.println("L'item " + i.id() + " a ete charge.");
            sesItems.replace(i, i.niveau());
        }
        else if(i.niveau() == 0 && (int)sesItems.get(i) == 1){
            System.out.println("L'item " + i.id() + " a ete depose au sol.");
            sesItems.replace(i, i.niveau());
        }
    }
}
