package w11k.triton.engine;

import w11k.triton.model.Product;
import w11k.triton.model.ProductService;
import w11k.triton.model.Variant;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright 2015 Dragan Zuvic
 * User: zuvic
 * Date: 3/12/15 Time: 10:59 AM
 */
public class ProductBuilder  implements ProductService {

    public List<Product> allProducts() {
        List<Product> result = new ArrayList<Product>();
        result.add( new Product("P1", 30));
        result.add( nP("P2", 20).add( nV("V1",0)));
        result.add( nP("P3", 10).add( nV("V1",0)) .add( nV("V2",20)));

        return result;
    }

    private Product nP(String name, Integer price) {
        return new Product(name, price);
    }

    private Variant nV(String name, Integer price) {
        return new Variant(name, price);
    }
}
