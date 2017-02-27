package com.lijojacob.microxs.demo.catalog.repository;

import com.lijojacob.microxs.demo.catalog.entity.Manufacturer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by lijojacob on 8/16/16.
 */
public interface ManufacturerRepository extends MongoRepository<Manufacturer, String> {

}
