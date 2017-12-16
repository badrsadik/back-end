package com.hidden.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hidden.entities.Shop;

public interface ShopRepository extends MongoRepository<Shop, Long> {

}
