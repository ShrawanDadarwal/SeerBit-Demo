package com.seerbit.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.seerbit.demo.response.CommonResponse;



@Repository
public interface CommonResponseRepository extends MongoRepository<CommonResponse, String>{
	
	@Query(value = "{'transaction.reference' : ?0}", fields = "{'transaction' : 0}")
	CommonResponse findByReference(String reference);

}
