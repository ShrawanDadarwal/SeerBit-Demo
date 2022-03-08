package com.seerbit.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.seerbit.demo.model.AcPayoutToNigeria;

public interface AccountPayoutToNigeriaRepository extends MongoRepository<AcPayoutToNigeria, String>{
	
	@Query(value = "{'transaction.reference' : ?0}", fields = "{'transaction' : 0}")
	AcPayoutToNigeria findByReference(String reference);
}
