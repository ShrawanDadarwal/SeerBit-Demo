package com.seerbit.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.seerbit.demo.model.FCMBCashPickUp;

@Repository
public interface FcmbCashPickUpRepository extends MongoRepository<FCMBCashPickUp, String>{
	@Query(value = "{'transaction.reference' : ?0}", fields = "{'transaction' : 0}")
	FCMBCashPickUp findByReference(String reference);
}
