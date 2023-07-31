package guitarproblem;


import guitarproblem.enums.Builder;
import guitarproblem.enums.Type;
import guitarproblem.enums.Wood;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {

        // Set up Rick’s guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        GuitarSpec whatErinLikes = new GuitarSpec( Builder.FENDER,
                "Stratocastor", Type.ELECTRIC,12, Wood.ALDER, Wood.ALDER);
        List matchingGuitars = inventory.search(whatErinLikes);

        if(!matchingGuitars.isEmpty()){
            System.out.println("Erin, you might like these guitars:");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next();
                GuitarSpec guitarSpec = guitar.getGuitarSpec();
                System.out.println(" We have a " +
                        guitarSpec.getBuilder() + " "  + guitarSpec.getModel() + " " +
                        guitarSpec.getType() + " guitar:\n " +
                        guitarSpec.getBackWood() + " back and sides,\n " +
                        guitarSpec.getTopWood() + " top.\n You can have it for only $" +
                        guitar.getPrice() + "!\n ----");
            }
        }
        else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }




    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars to the inventory...
        inventory.addGuitar("V95693",
                1499.95, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC,12, Wood.ALDER, Wood.ALDER);



        inventory.addGuitar("V9512",
                1549.95, Builder.FENDER,
                "Stratocastor", Type.ELECTRIC,12,
                Wood.ALDER, Wood.ALDER);
    }
}