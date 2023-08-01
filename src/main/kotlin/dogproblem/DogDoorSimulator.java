package dogproblem;

public class DogDoorSimulator {
    public static void main(String[] args) {

        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido’s all done...");
        try {
            Thread.currentThread().wait(10000);
        } catch (InterruptedException e) { }

        System.out.println("...but he is stuck outside...");
        System.out.println("\nFido’s start barking again...");
        System.out.println("\nGina presses remote button again...");
        remote.pressButton();
        System.out.println("\nFido’s back inside...");

    }

}