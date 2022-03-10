package com.seerbit.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.seerbit.demo.response.CancelCashPickUpResponse;

public interface CancelCashPickUpRepository extends MongoRepository<CancelCashPickUpResponse, String>{
	
	@Query(value = "{'transaction.reference' : ?0}", fields = "{'transaction' : 0}")
	CancelCashPickUpResponse findByReference(String reference);
}
