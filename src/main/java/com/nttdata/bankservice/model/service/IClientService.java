package com.nttdata.bankservice.model.service;

import com.nttdata.bankservice.model.document.Client;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClientService {
	
	Mono<Client> findById(String id);
	
	Flux<Client> findAll();
	
	Flux<Client> findByName(String name);
	
	Mono<Boolean> existsById(String id);
	
	Mono<Client> save(Client client) throws Exception;	
	
	Mono<Client> save(String id, Client client) throws Exception;
	
	Mono<Client> delete(String id);
	
}
