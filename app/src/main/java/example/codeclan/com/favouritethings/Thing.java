package example.codeclan.com.favouritethings;

/**
 * Created by user on 07/11/2017.
 */

public class Thing {

    private String name;
    private String reason;

    public Thing(String name, String reason) {
        this.name = name;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public String getReason() {
        return reason;
    }
}
