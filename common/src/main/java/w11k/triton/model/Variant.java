package w11k.triton.model;

/**
 * Copyright 2015 Dragan Zuvic
 * User: zuvic
 * Date: 3/12/15 Time: 1:54 PM
 */
public class Variant {
    private final String name;
    private final Integer price;

    public Variant(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}
