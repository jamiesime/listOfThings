package example.codeclan.com.favouritethings;

import java.util.ArrayList;

/**
 * Created by user on 07/11/2017.
 */

public class Things {

    private ArrayList<Thing> list;

    public Things() {
        list = new ArrayList<Thing>();
        list.add(new Thing("Blue Socks", "keep feet warm"));
        list.add(new Thing("Sword Replica", "practice my attacks"));
        list.add(new Thing("Duck Egg", "waiting to hatch"));
        list.add(new Thing("Pen", "good for writing"));
        list.add(new Thing("Gary's Camera", "he forgot i borrowed it"));
        list.add(new Thing("Rollo E-Juicer", "Fantastic value for all my juices"));
    }

    public ArrayList<Thing> getList() {
        return new ArrayList<Thing>(list);
    }
}
