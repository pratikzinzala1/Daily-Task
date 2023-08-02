package dogproblem;

public class DogDoorSimulator {
    public static void main(String[] args) {

        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);
        System.out.println("Fido barks to go outside...");
        recognizer.recognize("Woof");

        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido’s all done...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) { }

        System.out.println("...but he is stuck outside...");
        System.out.println("\nFido’s start barking again...");
        recognizer.recognize("Woof");

        System.out.println("\nFido’s back inside...");

    }

}