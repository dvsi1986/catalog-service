package com.lijojacob.microxs.demo.catalog.repository;

import com.lijojacob.microxs.demo.catalog.entity.Category;
import com.lijojacob.microxs.demo.catalog.entity.Product;
import com.lijojacob.microxs.demo.catalog.entity.Sku;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by lijojacob on 8/16/16.
 */
public interface ProductRepository extends MongoRepository<Product, String> {

    List<Product> findByFixedParentCategoriesContaining(Category category);

    List<Product> findByChildSkusContaining(Sku sku);

}
