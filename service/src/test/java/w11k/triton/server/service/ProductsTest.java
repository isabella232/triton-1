package w11k.triton.server.service;

import junit.framework.TestCase;

/**
 * User: zuvic
 * Date: 4/16/15 Time: 1:09 PM
 */
public class ProductsTest extends TestCase {

    public void testEcho() throws Exception {
        Products testee = new Products();
        assertEquals(testee.echo("test"),"test");
    }
}
