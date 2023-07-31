package guitarproblem;


import guitarproblem.enums.Builder;
import guitarproblem.enums.Type;
import guitarproblem.enums.Wood;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price,
                          Builder builder, String model,
                          Type type, int numString, Wood backWood, Wood topWood) {
        GuitarSpec guitarSpec = new GuitarSpec( builder,
                model, type,numString, backWood, topWood);
        Guitar guitar = new Guitar(serialNumber, price,guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            if (guitar.getGuitarSpec().matches(searchSpec))
                matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}