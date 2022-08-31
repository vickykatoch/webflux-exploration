package org.avam.webfluxexploration.repository;

import org.avam.webfluxexploration.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
    
}
