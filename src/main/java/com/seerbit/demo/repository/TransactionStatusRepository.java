package com.seerbit.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.seerbit.demo.model.TransactionStatus;



@Repository
public interface TransactionStatusRepository extends MongoRepository<TransactionStatus, String>{
	@Query(value = "{'transaction.reference' : ?0}", fields = "{'transaction' : 0}")
	TransactionStatus findByReference(String reference);

}
