package dogproblem;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private LinkedList<Bark> allowedBark = new LinkedList<Bark>();
    public DogDoor() {
        this.open = false;
    }

    public void addAllowedBark(Bark bark) {
        this.allowedBark.add(bark);
    }
    public List<Bark> getAllowedBarks() {
        return allowedBark;
    }
    public void open() {
        System.out.println("The dog door opens.");
        open = true;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }
    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }
    public boolean isOpen() {
        return open;
    }
}