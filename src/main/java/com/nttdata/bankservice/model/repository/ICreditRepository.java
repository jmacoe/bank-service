package com.nttdata.bankservice.model.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.bankservice.model.document.Credit;

@Repository
public interface ICreditRepository extends ReactiveMongoRepository<Credit, String> {

}
