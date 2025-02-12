package ca.nl.cna.java3.servlet.session;

/**
 * This class is a simple POJO that represents a Foo object which is just and id and a value for demonstration
 */
public class Foo {

    public static String NAME = "foo";
    private int id;
    private String value;

    /**
     * Constructor
     * @param id
     * @param value
     */
    public Foo(int id, String value) {
        this.id = id;
        this.value = value;
    }

    /**
     * Get the id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the value
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * Set the value
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "id=" + id +
                ", value='" + value + '\'' +
                "}";
    }
}
