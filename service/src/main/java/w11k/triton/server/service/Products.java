package w11k.triton.server.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import w11k.triton.engine.ProductBuilder;
import w11k.triton.model.Product;
import w11k.triton.model.ProductService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Copyright 2015 Dragan Zuvic
 */

@Path("/product")
public class Products implements ProductService {

    public static final Logger LOG = LoggerFactory.getLogger(Products.class);

    @GET
    @Path("/echo")
    @Produces(MediaType.APPLICATION_JSON)
    public String echo(@QueryParam("text") String text) {
        LOG.info("echo called: {}", text);
        return text;
    }

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
    @Override
	public List<Product> allProducts() {
		LOG.info("allProducts called.");
        return new ProductBuilder().allProducts();
	}

}
