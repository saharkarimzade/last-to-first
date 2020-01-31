package playground.lasttofirst;
public class Greeting {

    private final long id;
    private final String data;

    public Greeting(long id, String data) {
        this.id = id;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public String getData() {
        return data;
    }
}