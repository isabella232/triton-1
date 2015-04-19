package w11k.triton.engine;

import junit.framework.TestCase;
import w11k.triton.model.Product;

import java.util.List;

public class ProductBuilderTest extends TestCase {

    public void testAllProducts() throws Exception {
        List<Product> result = new ProductBuilder().allProducts();

        assertEquals(result.size() , 3);
    }
}