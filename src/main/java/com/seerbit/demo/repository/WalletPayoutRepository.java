package com.seerbit.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.seerbit.demo.model.WalletPayout;

public interface WalletPayoutRepository extends MongoRepository<WalletPayout, String>{
	@Query(value = "{'transaction.reference' : ?0}", fields = "{'transaction' : 0}")
	WalletPayout findByReference(String reference);
}
