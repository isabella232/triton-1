package w11k.triton.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright 2015 Dragan Zuvic
 * User: zuvic
 * Date: 3/12/15 Time: 10:55 AM
 */
public class Product {
    final private String name;
    final private List<Variant> variant = new ArrayList<Variant>();
    final Integer price;

    public String getName() {
        return name;
    }

    public List<Variant> getVariant() {
        return variant;
    }

    public Integer getPrice() {
        return price;
    }

    public Product add(Variant v) {
        variant.add(v);
        return this;
    }

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

}
