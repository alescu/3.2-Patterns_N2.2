import java.util.*;

public class Stockbroker {

    private List<Subscriber> observers = new ArrayList<Subscriber>();

    public List<Subscriber> getObservers() {
        return observers;
    }

    public void addObserver(Subscriber obs) {
        this.observers.add(obs);
    }

    public void removeObserver(Subscriber obs) {
        this.observers.remove(obs);
    }

    public void publishNewCommunicate(String news) {
        System.out.println("Message: " + news);
        for(Subscriber obs: this.observers){
            obs.Update(news);
        }
        System.out.println("\n");
    }
}
