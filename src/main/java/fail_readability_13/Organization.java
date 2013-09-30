package fail_readability_13;

public class Organization {

    String id;
    String name;

    public Organization() {
    }

    @Override
    public String toString() {
        return super.toString() + " [id=" + id + ", name=" + name +"]";
    }
}
