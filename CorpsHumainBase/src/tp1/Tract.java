package tp1;

public class Tract extends HasTag{

    public String name;

    public String length;

    public String volume;

    public String toString() {
        return String.format("{\n" +
                "  \"name\": %s, \n" +
                "  \"length\": %s,\n" +
                "  \"volume\": %s\n" +
                "}",name,length,volume);

    }
}
