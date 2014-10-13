package slavik.domain;

/**
 * Created by v.petrushkin on 13.10.2014.
 */
public class Category {
    private int id;
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public Category(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
