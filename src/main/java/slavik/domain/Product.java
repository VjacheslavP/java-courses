package slavik.domain;

import java.util.Date;

/**
 * Created by v.petrushkin on 13.10.2014.
 */
public class Product {
    private int id;
    private int catId;
    private String name;
    private Boolean visible;
    private Date added;

    public int getId() {
        return id;
    }

    public int getCatId() {
        return catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Date getAdded() {
        return added;
    }

    public int getCategory() {
        return this.catId;
    }

    public Product(String name, int catId, int id) {
        this.name = name;
        this.catId = catId;
        this.id = id;
        this.visible = false;
    }
}
